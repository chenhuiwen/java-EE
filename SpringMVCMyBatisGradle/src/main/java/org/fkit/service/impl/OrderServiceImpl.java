package org.fkit.service.impl;

import java.util.List;

import org.fkit.domain.Order;
import org.fkit.domain.User;
import org.fkit.mapper.OrderMapper;
import org.fkit.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("orderService")
public class OrderServiceImpl implements OrderService{
	@Autowired
	private OrderMapper orderMapper;
	@Transactional(readOnly=true)

	@Override
	public List<Order> getAll() {
		// TODO Auto-generated method stub
		return orderMapper.findAll();
	}

	@Override
	public Order selectOrder(int id) {
		// TODO Auto-generated method stub
		Order order=orderMapper.selectOrder(id);
		return order;
	}

	@Override
	public int deleteorder(Order order) {
		// TODO Auto-generated method stub
		return orderMapper.delete(order);
	}

	
	@Override
	public void updateOrder(String state, int id) {
		// TODO Auto-generated method stub
		orderMapper.updateCart(state, id);
	}

	@Override
	public int addorder(Order order, int good_sn,int count) {
		// TODO Auto-generated method stub
		orderMapper.add(order);
		orderMapper.deleteCart(good_sn);
		orderMapper.reduceGood(good_sn, count);
		return 0;
	}

	@Override
	public User selectUser(int user_sn) {
		// TODO Auto-generated method stub
		orderMapper.findUser(user_sn);
		return orderMapper.findUser(user_sn);
	}

	

	
	
}
