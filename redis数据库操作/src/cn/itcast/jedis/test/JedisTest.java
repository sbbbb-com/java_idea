package cn.itcast.jedis.test;

import cn.itcast.jedis.util.JedisPoolUtils;
import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static cn.itcast.jedis.util.JedisPoolUtils.*;

/**
 * jedis�Ĳ�����
 */
public class JedisTest {

    /**
     * ��������
     */
    @Test
    public void test1(){
        //1.��ȡ����
        Jedis jedis=new Jedis("localhost",6379);
        //2.����
        jedis.set("username","zhangsan");
        //3.�ر�����
        jedis.close();
    }

    @Test
    public void test2(){
        //1.��ȡ����
        Jedis jedis=new Jedis();  //���ʹ�ÿղι��죬Ĭ��ֵ��"localhost",6379��
        //2.����
       //�洢
        jedis.set("username","zhangsan");
        //��ȡ
        String username = jedis.get("username");
        System.out.println(username);

        //����ʹ��setex���������洢����ָ������ʱ��� key value
        //��activecode��hehe��ֵ�Դ���redis������20����Զ�ɾ���ü�ֵ��
        jedis.setex("activecode",20,"hehe");
        //3.�ر�����
        jedis.close();
    }

    @Test
    public void test3(){
        //1.��ȡ����
        Jedis jedis=new Jedis();  //���ʹ�ÿղι��죬Ĭ��ֵ��"localhost",6379��
        //2.����
        //�洢hash
        jedis.hset("user","name","lisi");
        jedis.hset("user","age","23");
        jedis.hset("user","gender","female");

        //��ȡhash
        String name = jedis.hget("user", "name");
        System.out.println(name);

        //��ȡhash������map�е�����
        Map<String,String> user=jedis.hgetAll("user");

        //keyset
        Set<String> keySet=user.keySet();
        for (String key : keySet) {
            //��ȡvalue
            String value = user.get(key);
            System.out.println(key+":"+value);
        }

        //3.�ر�����
        jedis.close();
    }


    @Test
    public void test4(){
        //1.��ȡ����
        Jedis jedis=new Jedis();  //���ʹ�ÿղι��죬Ĭ��ֵ��"localhost",6379��
        //2.����
        //�洢 list
        jedis.lpush("mylist","a","b","c"); //����ߴ�
        jedis.rpush("mylist","a","b","c"); //���ұߴ�

        //list ��Χ��ȡ
        List<String> mylist=jedis.lrange("mylist",0,-1);
        System.out.println(mylist);

        //list ����
        String emlement1=jedis.lpop("mylist");  //c ��ߵ���
        System.out.println(emlement1);

        String emlement2=jedis.rpop("mylist");  //c �ұߵ���
        System.out.println(emlement2);

        //list ��Χ��ȡ
        List<String> mylist2=jedis.lrange("mylist",0,-1);
        System.out.println(mylist2);

        //3.�ر�����
        jedis.close();
    }

    @Test
    public void test5(){
        //1.��ȡ����
        Jedis jedis=new Jedis();  //���ʹ�ÿղι��죬Ĭ��ֵ��"localhost",6379��
        //2.����
        //�洢set
        jedis.sadd("myset","java","c++","php","python");

        // set ��ȡ
        Set<String> myset=jedis.smembers("myset");
        System.out.println(myset);

        //3.�ر�����
        jedis.close();
    }

    @Test
    public void test6(){
        //1.��ȡ����
        Jedis jedis=new Jedis();  //���ʹ�ÿղι��죬Ĭ��ֵ��"localhost",6379��
        //2.����
        //�洢sortedset
        jedis.zadd("mysortedset",3,"����");
        jedis.zadd("mysortedset",30,"����");
        jedis.zadd("mysortedset",52,"�����");

        //sortedset ��ȡ
        Set<String> mysortedset=jedis.zrange("mysortedset",0,-1);

        System.out.println(mysortedset);


        //3.�ر�����
        jedis.close();
    }

    @Test
    public  void  test7(){
        //0.����һ�����ö���
        JedisPoolConfig config=new JedisPoolConfig();
        config.setMaxTotal(50);
        config.setMaxIdle(10);

        //1.����jedispool���ӳض���
        JedisPool jedisPool=new JedisPool(config,"localhost",6379);

        //2.��ȡ����
        Jedis jedis=jedisPool.getResource();
        //3.ʹ��
        jedis.set("hehe","haha2");

        //4.�رգ� �黹�����ӳ���
        jedis.close();
    }

    @Test
    public  void  test8(){
        //ͨ�����ӳع������ȡ
        Jedis jedis= getJedis();



        //3.ʹ��
        jedis.set("hehe","world");

        //4.�رգ� �黹�����ӳ���
        jedis.close();
    }
}
