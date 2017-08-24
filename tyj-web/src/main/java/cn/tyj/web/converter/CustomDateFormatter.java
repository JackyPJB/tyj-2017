package cn.tyj.web.converter;

import org.apache.commons.lang3.StringUtils;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created with IntelliJ IDEA
 * User : Pengjb
 * Date : 2017/8/16
 */
public class CustomDateFormatter implements Formatter<Date> {
	//	获取构造函数，初始化日期参数的格式要求 <!--<constructor-arg name="datePattern" value="yyyy-MM-dd HH:mm:ss"/>-->
/*	private String datePattern;
	private SimpleDateFormat dateFormat;
	public CustomDateFormatter(String datePattern) {
		System.out.println("DateFormatter()5b========");
		this.datePattern = datePattern;
		dateFormat = new SimpleDateFormat(datePattern);
		dateFormat.setLenient(false);//表示严格日期格式，例如2017年13月1日就不能自动转换成2018年1月1日了
	}*/

	@Override
	public Date parse(String source, Locale locale) throws ParseException {
		try {
			if (StringUtils.isNotBlank(source)) {
				if (source.indexOf(" ") > 0)
					return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(source);
				else
					return new SimpleDateFormat("yyyy-MM-dd").parse(source);
			}
		} catch (ParseException e) {
			// the error message will be displayed when using <form:errors>
			throw new IllegalArgumentException("invalid date format. Please use this pattern \"yyyy-MM-dd HH:mm:ss\" or \"yyyy-MM-dd\" ");
		}
		return null;
	}

	@Override
	public String print(Date date, Locale locale) {
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
	}
}
