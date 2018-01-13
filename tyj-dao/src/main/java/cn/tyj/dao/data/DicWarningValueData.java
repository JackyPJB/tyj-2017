package cn.tyj.dao.data;

import cn.tyj.dao.pojo.DicWarnningValue;

import java.util.List;

/**
 * Created with IntelliJ IDEA
 * User : Pengjb
 * Date : 2018/1/1 0001
 */
public interface DicWarningValueData {
	DicWarnningValue selectByPrimaryKey(Integer id);

	List<DicWarnningValue> selectAll();

}

