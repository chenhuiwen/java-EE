package org.fkit.service.impl;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.fkit.domain.Cart;
import org.fkit.mapper.CartMapper;
import org.fkit.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("cartService")
public class CartServiceImpl implements CartService{
	@Autowired
	private CartMapper cartMapper;
	@Transactional(readOnly=true)
	@Override
	public List<Cart> getCart() {
		// TODO Auto-generated method stub
		return cartMapper.findAll();
	}

	

	@Override
	public int deleteAll(Cart cart) {
		// TODO Auto-generated method stub
		return cartMapper.deleteAll(cart);
	}

	@Override
	public Cart findCart(String good_sn) {
		// TODO Auto-generated method stub
		 return cartMapper.findWithId(good_sn);
	}

	@Override
	public void addCart(String good_sn) {
		// TODO Auto-generated method stub
		cartMapper.addCart(good_sn);
	}

	@Override
	public void saveCart(Cart cart) {
		// TODO Auto-generated method stub
		int i = 1;
		cart.setCount(i);
		cartMapper.save(cart);
		
	}



	@Override
	public void deleteCart(Cart cart) {
		// TODO Auto-generated method stub
		cartMapper.delete(cart);
	}



	@Override
	public void reduceCart(String good_sn) {
		// TODO Auto-generated method stub
		Cart cart = cartMapper.findWithId(good_sn);
		if (cart.getCount() >= 1) {
			cartMapper.reduceCart(good_sn);
		} else {
			Error e = null;
			throw new RuntimeErrorException(e);
		}
	}



	@Override
	public List<Cart> getUserCart(String user_sn) {
		// TODO Auto-generated method stub
		System.out.println("user_sn");
		return cartMapper.findUserAll(user_sn);
	}

	



	
	
	
	

}
