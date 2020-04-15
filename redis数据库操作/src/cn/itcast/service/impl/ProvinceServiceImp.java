package cn.itcast.service.impl;

import cn.itcast.dao.ProvinceDao;
import cn.itcast.dao.impl.ProvinceDaoImpl;
import cn.itcast.domain.Province;
import cn.itcast.jedis.util.JedisPoolUtils;
import cn.itcast.service.ProvinceService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import redis.clients.jedis.Jedis;

import java.util.List;

public class ProvinceServiceImp implements ProvinceService {
    //����dao
    private ProvinceDao dao=new ProvinceDaoImpl();

    @Override
    public List<Province> findAll() {
        return dao.findAll();
    }

    /*
    ʹ��redis����
     */
    @Override
    public String findAllJson() {
        //1.�ȴ�redis�в�ѯ����
        //1.1��ȡredis�ͻ�������
        Jedis jedis = JedisPoolUtils.getJedis();
        String province_json = jedis.get("province");

        //�ж� province_json �����Ƿ�Ϊnull
        if (province_json==null || province_json.length()==0){
            //redis��û������
            System.out.println("redis��û�����ݣ���ѯ���ݿ⡣������");
            //2.1�����ݿ��в�ѯ
            List<Province> ps = dao.findAll();
            //2.2��list���л�Ϊjson
            ObjectMapper mapper=new ObjectMapper();
            try {
                province_json = mapper.writeValueAsString(ps);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }

            //2.3 ��json���ݴ���redis��
            jedis.set("province",province_json);
            //�黹����
            jedis.close();
        }else {
            System.out.println("redis�������ݣ���ѯ���档������");
        }


        return province_json;
    }
}
