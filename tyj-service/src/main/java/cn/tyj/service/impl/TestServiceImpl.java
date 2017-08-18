package cn.tyj.service.impl;

import cn.tyj.service.TestService;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA
 * User : Pengjb
 * Date : 2017/8/16
 */

@Service("testService")
public class TestServiceImpl implements TestService {

	@Override
	public int count(){
		return 4;
	}

}
