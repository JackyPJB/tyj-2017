package cn.tyj.web.converter;

/**
 * Created with IntelliJ IDEA
 * User : Pengjb
 * Date : 2017/8/16
 */

import org.springframework.core.convert.converter.Converter;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.lang3.StringUtils;

public class CustomDateConverter implements Converter<String, Date> {
	@Override
	public Date convert(String source) {
		try {
			// 进行日期转换
			if (StringUtils.isNotBlank(source)) {
				if (source.indexOf(" ") > 0)
					return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(source);
				else
					return new SimpleDateFormat("yyyy-MM-dd").parse(source);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
