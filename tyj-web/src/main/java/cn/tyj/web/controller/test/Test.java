package cn.tyj.web.controller.test;

import cn.tyj.dao.dataForm.TestClass;
import cn.tyj.dao.pojo.User001;
import cn.tyj.dao.vo.User001Vo;
import cn.tyj.service.test.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Created with IntelliJ IDEA
 * User : Pengjb
 * Date : 2017/8/15
 */

@Controller
public class Test {
	@Resource
	private TestService testService;
	//	关于logback的配置和使用，http://www.jianshu.com/p/1ded57f6c4e3
	private final static Logger logger = LoggerFactory.getLogger(Test.class);

	//--@Controller注解：采用注解的方式，可以明确地定义该类为处理请求的Controller类；
	//--@RequestMapping()注解：用于定义一个请求映射，value为请求的url，值为 / 说明，该请求首页请求，method用以指定该请求类型，一般为get和post；
	//--return "index"：处理完该请求后返回的页面，此请求返回 index.jsp页面。
//	@RequestMapping(value="/test/pjbtest",method={RequestMethod.POST,RequestMethod.PUT,RequestMethod.GET})
	@RequestMapping("/test/pjbtest")
//	public ModelAndView pjbTest(ModelAndView model) {
// 		model.addObject("test","123345");
//		model.setViewName("/test/pjbtest");
	public String pjbTest(@Valid TestClass testClass, BindingResult bindingResult, Model model){
/*        Long userId = sessionManager.getUserId(session);
        QuizCustomVo quizCustomVo = new QuizCustomVo();
        quizCustomVo.setUserId(userId);
        List<QuizCustom> myMessage = quizService.findQuizInfoItems(quizCustomVo).getModule();
        List<TestUserCustom> userList = userSerivce.findUserList();
        model.addAttribute("userList", userList);
        model.addAttribute("myMessage", myMessage);
		logger.info("testClass:" + testClass.getDate());
*/
		if (bindingResult.hasErrors()) {
			FieldError fieldError = bindingResult.getFieldError();
			logger.info("Code:" + fieldError.getCode() + ", field:" + fieldError.getField() + " , message:" + fieldError.getDefaultMessage());
			return "/test/pjbtest";
		}
		logger.info("aaaaaaaaa= " + testClass.getDate());
//		model.addAttribute(testClass);
		model.addAttribute("insertResult",testService.insert1(testClass));
		model.addAttribute("test111",testService.count());
        model.addAttribute("dizhi","http://www.njm2m.com");//二维码映射的地址
		return "/test/pjbtest";
	}

//	国际化测试
	@RequestMapping("/test/hello")
	public ModelAndView welcome() {
		ModelAndView modelAndView = new ModelAndView("/test/welcome");
		Locale locale = LocaleContextHolder.getLocale();
		logger.info("local local local " + locale);
		return modelAndView;
	}

//  Json 测试
	@RequestMapping("/test/getJson")
	public @ResponseBody
	User001Vo getJson(@RequestBody User001Vo user001Vo){
		user001Vo.setName("Json");
		logger.info("userAge1111:"+user001Vo.getAge());
		List<User001> user001List = new ArrayList<User001>();
		for(int i=0;i<5;i++){
			User001 user001 = new User001();
			user001.setId(i);
			user001List.add(user001);
		}
		user001List.addAll(user001Vo.getUser001List());
		user001Vo.setUser001List(user001List);
		return user001Vo;
	}
}
