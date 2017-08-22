package cn.tyj.dao.data.impl;

import cn.tyj.dao.data.User001Data;
import cn.tyj.dao.mapper.User001Mapper;
import cn.tyj.dao.pojo.User001;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA
 * User : Pengjb
 * Date : 2017/8/21
 */

@Repository("user001Data")
public class User001DataImpl implements User001Data {
	@Resource
	private User001Mapper user001Mapper;

	@Override
	public int insert(User001 record){
		return user001Mapper.insert(record);

	}
}
