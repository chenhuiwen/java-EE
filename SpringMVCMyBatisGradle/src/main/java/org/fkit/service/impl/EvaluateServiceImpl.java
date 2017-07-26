package org.fkit.service.impl;

import java.util.List;

import org.fkit.domain.Evaluate;
import org.fkit.mapper.EvaluateMapper;
import org.fkit.service.EvaluateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("evaluateService")
public class EvaluateServiceImpl implements EvaluateService{
	@Autowired
	private EvaluateMapper evaluateMapper;
	@Transactional(readOnly=true)
	@Override
	public List<Evaluate> getALL() {
		// TODO Auto-generated method stub
		return evaluateMapper.findAll();
	}

	
	@Override
	public void deleteEvaluate(int id) {
		// TODO Auto-generated method stub
		evaluateMapper.delete(id);
	}

	@Override
	public List<Evaluate> selectEvaluate(int good_sn) {
		// TODO Auto-generated method stub
		return evaluateMapper.findSome(good_sn);
	}


	@Override
	public void saveEvaluate(Evaluate evaluate) {
		// TODO Auto-generated method stub
		evaluateMapper.add(evaluate);
	}
	
	

}
