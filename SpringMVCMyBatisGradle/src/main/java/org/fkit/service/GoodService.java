package org.fkit.service;

import java.util.List;


import org.fkit.domain.Good;

public interface GoodService {
	List<Good> getAll();
	int deleteGood(int id);
	int add(Good good);
	void reduce(int id);
	List<Good> getSome(String parent_category_sn);
	Good selectGood(int id);
	int sum();
	int sale();
	
}
