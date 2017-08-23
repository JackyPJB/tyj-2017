package cn.tyj.service.test;

import cn.tyj.dao.vo.User001Vo;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created with IntelliJ IDEA
 * User : Pengjb
 * Date : 2017/8/16
 */

public interface TestService {

	int count();

	int insert1(User001Vo user001Vo);

}
