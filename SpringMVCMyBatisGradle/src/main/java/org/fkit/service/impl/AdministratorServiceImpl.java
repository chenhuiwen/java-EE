package org.fkit.service.impl;

import org.fkit.domain.Administrator;
import org.fkit.mapper.AdministratorMapper;
import org.fkit.service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("administratorService")
public class AdministratorServiceImpl implements AdministratorService{
	/**
	 * 自动注入AdministratorMapper
	 * */
	@Autowired
	private AdministratorMapper administratorMapper;

	/**
	 * AdministratorService接口login方法实现
	 * @see { AdministratorService }
	 * */
	@Transactional(readOnly=true)
	@Override
	public Administrator login(String loginname, String password) {
		// TODO Auto-generated method stub
		return administratorMapper.findWithLoginnameAndPassword(loginname, password);
	}

}
