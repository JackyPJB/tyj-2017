package cn.tyj.dao.data;

import cn.tyj.dao.pojo.WarnningRecord;

import java.util.List;

/**
 * Created with IntelliJ IDEA
 * User : Pengjb
 * Date : 2018/1/1 0001
 */
public interface WarningRecordData {
	int insertSelective(WarnningRecord record);

	WarnningRecord selectByPrimaryKey(Long id);

	List<WarnningRecord> selectBySelective(WarnningRecord record);
}
