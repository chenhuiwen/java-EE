package org.fkit.service.impl;

import java.util.List;
import org.fkit.domain.Good;
import org.fkit.mapper.GoodMapper;
import org.fkit.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("goodService")
public class GoodServiceImpl implements GoodService{
	
	@Autowired
	private GoodMapper goodMapper;

	
	@Transactional(readOnly=true)
	@Override
	public List<Good> getAll() {
		// TODO Auto-generated method stub
		return goodMapper.findAll();
	}



	@Override
	public Good selectGood(int id) {
		// TODO Auto-generated method stub
		return goodMapper.selectGood(id);
	}

	@Override
	public List<Good> getSome(String parent_category_sn) {
		// TODO Auto-generated method stub
		return goodMapper.findSome(parent_category_sn);
	}

	@Override
	public int deleteGood(int id) {
		// TODO Auto-generated method stub
		goodMapper.delete(id);
		return 1;
	}

	@Override
	public int add(Good good) {
		// TODO Auto-generated method stub
		goodMapper.add(good);
		return 1;
	}

	@Override
	public void reduce(int id) {
		// TODO Auto-generated method stub
		goodMapper.reduceGood(id);
	}



	@Override
	public int sum() {
		// TODO Auto-generated method stub
		return goodMapper.sum();
	}



	@Override
	public int sale() {
		// TODO Auto-generated method stub
		return goodMapper.sale();
	}



	

	}










	
	


	


