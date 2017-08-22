package cn.tyj.dao.dataForm;



import cn.tyj.dao.vo.User001Vo;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * Created with IntelliJ IDEA
 * User : Pengjb
 * Date : 2017/8/16
 */
public class TestClass extends User001Vo{

	@NotBlank(message="{user.name.required}")
	@Size(max = 8,min = 3,message = "{user.name.size}")
	private String name;

	private Date date;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
