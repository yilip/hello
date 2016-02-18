package com.lip.hello.service.imp;

import org.springframework.stereotype.Service;

import com.lip.hello.service.ITestService;

@Service
public class TestServiceImpl implements ITestService {

	@Override
	public String getName() {
		return this.getClass().getName();
	}

}
