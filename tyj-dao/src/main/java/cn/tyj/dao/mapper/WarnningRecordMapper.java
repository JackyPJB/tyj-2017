package cn.tyj.dao.mapper;

import cn.tyj.dao.pojo.WarnningRecord;

import java.util.List;

public interface WarnningRecordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WarnningRecord record);

    int insertSelective(WarnningRecord record);

    WarnningRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WarnningRecord record);

    int updateByPrimaryKey(WarnningRecord record);

    List<WarnningRecord> selectBySelective(WarnningRecord record);
}