package cn.tyj.dao.data;

import cn.tyj.dao.pojo.Device;

/**
 * Created with IntelliJ IDEA
 * User : Pengjb
 * Date : 2018/1/1 0001
 */
public interface DeviceData {
	int insertSelective(Device record);

	Device selectByPrimaryKey(Long deviceId);

	int updateByPrimaryKeySelective(Device record);

}
