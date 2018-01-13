package cn.tyj.dao.mapper;

import cn.tyj.dao.pojo.Device;

public interface DeviceMapper {
    int deleteByPrimaryKey(Long deviceId);

    int insert(Device record);

    int insertSelective(Device record);

    Device selectByPrimaryKey(Long deviceId);

    int updateByPrimaryKeySelective(Device record);

    int updateByPrimaryKey(Device record);
}