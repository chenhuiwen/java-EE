package org.fkit.service;

import org.fkit.domain.Administrator;

public interface AdministratorService {
	Administrator login(String loginname,String password);
}
