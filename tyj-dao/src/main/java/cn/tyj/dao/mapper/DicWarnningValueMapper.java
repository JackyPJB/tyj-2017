package cn.tyj.dao.mapper;

import cn.tyj.dao.pojo.DicWarnningValue;

import java.util.List;

public interface DicWarnningValueMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DicWarnningValue record);

    int insertSelective(DicWarnningValue record);

    DicWarnningValue selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DicWarnningValue record);

    int updateByPrimaryKey(DicWarnningValue record);

    List<DicWarnningValue> selectAll();
}