package cn.itcast.dao;

import cn.itcast.domain.Province;

import java.util.List;

public interface ProvinceDao {
    /**
     * ��ѯ����
     * @return ���ز�ѯ��������
     */
    public List<Province> findAll();

}
