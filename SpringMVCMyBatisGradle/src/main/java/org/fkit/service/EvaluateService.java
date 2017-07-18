package org.fkit.service;

import java.util.List;

import org.fkit.domain.Evaluate;

public interface EvaluateService {
	List<Evaluate> getALL();
	void saveEvaluate(Evaluate evaluate);
	void deleteEvaluate(int id);
	List<Evaluate> selectEvaluate(int good_sn);
	
}
