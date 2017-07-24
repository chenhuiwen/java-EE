package org.fkit.service;

import java.util.List;

import org.fkit.domain.Order;
import org.fkit.domain.User;

public interface OrderService {
	int addorder(Order order,int good_sn,int count);
	int deleteorder(Order order);
	List<Order> getAll();
	Order selectOrder(int id);
	void updateOrder(String state,int id);
	User selectUser(int user_sn);
}
