package com.lip.hello.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lip.hello.core.model.User;
import com.lip.hello.core.service.IUserService;
import com.lip.hello.service.ITestService;

@Controller
public class HelloController {
	@Resource
	private ITestService testService;

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> sayHello(HttpServletRequest request) {
		Map<String, Object> resultMap = new HashMap<>();
		resultMap.put("name", testService.getName());
		resultMap.put("msg", true);
		return resultMap;
	}
}
