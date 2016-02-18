package com.lip.testmybatis;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lip.hello.core.model.User;
import com.lip.hello.core.service.IUserService;
import com.lip.hello.service.ITestService;

@RunWith(SpringJUnit4ClassRunner.class) // 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath*:config/spring-mybatis.xml" ,"classpath*:spring-mvc.xml"})

public class TestMyBatis {
	private static Logger logger = Logger.getLogger(TestMyBatis.class);
	@Resource
	private IUserService userService;
	@Resource
	private ITestService testService;
	// private ApplicationContext ac = null;

	// @Before
	// public void before() {
	// ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	// userService = (IUserService) ac.getBean("userService");
	// }

	@Test
	public void test1() {
		// System.out.println(user.getUserName());
		User user = userService.getUser("10000216");
		logger.warn("name:"+user.getAgentId());
		logger.info("值：" + testService.getName());
	}
}
