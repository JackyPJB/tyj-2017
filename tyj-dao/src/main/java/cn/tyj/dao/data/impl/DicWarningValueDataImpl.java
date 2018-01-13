package cn.tyj.dao.data.impl;

import cn.tyj.dao.data.DicWarningValueData;
import cn.tyj.dao.mapper.DicWarnningValueMapper;
import cn.tyj.dao.pojo.DicWarnningValue;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IntelliJ IDEA
 * User : Pengjb
 * Date : 2018/1/1 0001
 */
@Repository("dicWarningValueData")
public class DicWarningValueDataImpl implements DicWarningValueData {
	@Resource
	private DicWarnningValueMapper dicWarnningValueMapper;

	@Override
	public List<DicWarnningValue> selectAll(){
		return dicWarnningValueMapper.selectAll();
	}

	@Override
	public DicWarnningValue selectByPrimaryKey(Integer id){
		return dicWarnningValueMapper.selectByPrimaryKey(id);
	}


}
