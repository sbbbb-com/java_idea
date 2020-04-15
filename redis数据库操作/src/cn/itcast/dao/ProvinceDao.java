package cn.itcast.dao;

import cn.itcast.domain.Province;

import java.util.List;

public interface ProvinceDao {
    /**
     * 查询所有
     * @return 返回查询所有数据
     */
    public List<Province> findAll();

}
