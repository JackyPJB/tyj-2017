package cn.tyj.dao.mapper;

import cn.tyj.dao.pojo.User001;

public interface User001Mapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User001 record);

    int insertSelective(User001 record);

    User001 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User001 record);

    int updateByPrimaryKey(User001 record);
}