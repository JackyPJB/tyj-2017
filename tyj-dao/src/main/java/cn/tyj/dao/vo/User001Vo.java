package cn.tyj.dao.vo;

import cn.tyj.dao.pojo.User001;

import java.io.Serializable;
import java.util.List;

/**
 * Created with IntelliJ IDEA
 * User : Pengjb
 * Date : 2017/8/21
 */
public class User001Vo extends User001 implements Serializable{
	List<User001> user001List;

	public List<User001> getUser001List() {
		return user001List;
	}

	public void setUser001List(List<User001> user001List) {
		this.user001List = user001List;
	}
}
