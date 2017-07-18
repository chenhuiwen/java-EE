package org.fkit.service;

import java.util.List;

import org.fkit.domain.Collect;

public interface CollectService {
	List<Collect> getAll(int user_sn);
	void removeCollect(int good_sn,int user_sn);
	Collect findCollect(int good_sn,int user_sn);
	void saveCollect(Collect collect);
	void clearCollect();
}
