package org.fkit.service.impl;

import java.util.List;

import org.fkit.domain.Collect;
import org.fkit.mapper.CollectMapper;
import org.fkit.service.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
@Service("collectService")
public class CollectServiceImpl implements CollectService{
	@Autowired
	private CollectMapper collectMapper;



	
	@Override
	public void clearCollect() {
		// TODO Auto-generated method stub
		
	}

	
	

	@Override
	public void removeCollect(int good_sn, int user_sn) {
		// TODO Auto-generated method stub
		collectMapper.removeCollect(good_sn, user_sn);
	}

	




	




	@Override
	public void saveCollect(Collect collect) {
		// TODO Auto-generated method stub
		collectMapper.saveCollect(collect);
	}




	@Override
	public List<Collect> getAll(int user_sn) {
		// TODO Auto-generated method stub
		return collectMapper.findAll(user_sn);
	}




	@Override
	public Collect findCollect(int good_sn, int user_sn) {
		// TODO Auto-generated method stub
		return collectMapper.findWithGoodAndUser(good_sn, user_sn);
	}

	}
