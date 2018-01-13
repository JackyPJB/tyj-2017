package cn.tyj.dao.data.impl;

import cn.tyj.dao.data.DeviceData;
import cn.tyj.dao.mapper.DeviceMapper;
import cn.tyj.dao.pojo.Device;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA
 * User : Pengjb
 * Date : 2018/1/1 0001
 */
@Repository("deviceData")
public class DeviceDataImpl implements DeviceData {
	@Resource
	private DeviceMapper deviceMapper;


	@Override
	public int insertSelective(Device record){
		return deviceMapper.insertSelective(record);
	}

	@Override
	public Device selectByPrimaryKey(Long deviceId){
		return deviceMapper.selectByPrimaryKey(deviceId);
	}

	@Override
	public int updateByPrimaryKeySelective(Device record){
		return deviceMapper.updateByPrimaryKeySelective(record);
	}

}
