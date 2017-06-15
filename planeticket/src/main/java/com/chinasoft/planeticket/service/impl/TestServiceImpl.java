package com.chinasoft.planeticket.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.chinasoft.planeticket.mapper.TestMapper;
import com.chinasoft.planeticket.pojo.Test;
import com.chinasoft.planeticket.service.ITestService;





@Service("testService")
public class TestServiceImpl implements ITestService{

	@Resource
	private TestMapper testMapper;
	
	@Override
	public Test queryTest(Test test) {
		// TODO 自动生成的方法存根
		return testMapper.queryTest(test);
	}

}
