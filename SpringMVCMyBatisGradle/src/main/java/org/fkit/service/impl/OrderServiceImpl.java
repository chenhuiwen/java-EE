package org.fkit.service.impl;

import java.util.List;

import org.fkit.domain.Order;
import org.fkit.mapper.CartMapper;
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
	public int addorder(Order order) {
		// TODO Auto-generated method stub
		return orderMapper.add(order);
	}

	@Override
	public void updateOrder(String state, int id) {
		// TODO Auto-generated method stub
		orderMapper.updateCart(state, id);
	}

	
}
