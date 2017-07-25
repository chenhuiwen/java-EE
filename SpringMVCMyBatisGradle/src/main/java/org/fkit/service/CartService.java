package org.fkit.service;



import java.util.List;

import org.fkit.domain.Cart;


public interface CartService {
	List<Cart> getCart();
	void deleteCart(Cart cart);
	void addCart(String good_sn);
	void reduceCart(String good_sn);
	int deleteAll(Cart cart);
	Cart findCart(String good_sn);
	void saveCart(Cart cart);
	List<Cart> getUserCart(String user_sn);

}
