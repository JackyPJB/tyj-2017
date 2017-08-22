package cn.tyj.service.impl;

import cn.tyj.dao.data.User001Data;
import cn.tyj.dao.vo.User001Vo;
import cn.tyj.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA
 * User : Pengjb
 * Date : 2017/8/16
 */

@Service("testService")
public class TestServiceImpl implements TestService {
	@Resource
	private User001Data user001Data;

	@Override
	public int count(){
		return 4;
	}

	@Override
	public int insert(User001Vo user001Vo){
		return user001Data.insert(user001Vo);
	}


}
