package cn.tyj.web.converter;

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
	private String datePattern;
	private SimpleDateFormat dateFormat;

	public CustomDateFormatter(String datePattern) {
		System.out.println("DateFormatter()5b========");
		this.datePattern = datePattern;
		dateFormat = new SimpleDateFormat(datePattern);
//		dateFormat.setLenient(false);
	}

	@Override
	public Date parse(String s, Locale locale) throws ParseException {
		try {
			System.out.println("DateFormatter()5b========"+ dateFormat.parse(s));
			return dateFormat.parse(s);
		} catch (ParseException e) {
			// the error message will be displayed when using <form:errors>
			throw new IllegalArgumentException("invalid date format. Please use this pattern\"" + datePattern + "\"");
		}
	}

	@Override
	public String print(Date date, Locale locale) {
		return dateFormat.format(date);
	}
}
