package org.fkit.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.fkit.domain.Cart;
import org.fkit.domain.Good;
import org.fkit.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;




@Controller
public class CartController {
	@Autowired
	@Qualifier("cartService")
	private CartService cartService;
	@RequestMapping(value="/cartlist")
	 public String cartlist(Model model){
		List<Cart> cart_list = cartService.getCart();
		model.addAttribute("cart_list", cart_list);
		return "cartlist";
	}
	@RequestMapping(value="/addCart")
	public ModelAndView addCart(
			@ModelAttribute Cart cart,
			ModelAndView mv,
			 HttpSession session,
			 HttpServletRequest request){
		String good_sn=request.getParameter("id");
		cart.setGood_sn(good_sn);
		Cart cart1= cartService.findCart(good_sn);
		if (cart1 == null){
			 cartService.saveCart(cart);
		}else{
			 cartService.addCart(good_sn);
			}
		
		mv.setView(new RedirectView("./cartlist"));
	return mv;
	}
	@RequestMapping(value="/removecart")
	public ModelAndView removeCart(
			@ModelAttribute Cart cart,
			ModelAndView mv,
			 HttpSession session){
			cartService.deleteCart(cart);
		mv.setView(new RedirectView("./cartlist"));
	return mv;
	}
	@RequestMapping(value="/reducecart")
	public ModelAndView reducecart(Model model,
			ModelAndView mv,
			HttpServletRequest request){
		Cart cart=new Cart();
		String good_sn = request.getParameter("good_sn");
		cart.setGood_sn(good_sn);
		cartService.reduceCart(good_sn);
		mv.setView(new RedirectView("./cartlist"));
		return mv;
	}
	@RequestMapping(value="/clearcart")
	public ModelAndView clearCart(
			@ModelAttribute Cart cart,
			ModelAndView mv,
			 HttpSession session){
		int count=cartService.deleteAll(cart);
		mv.setView(new RedirectView("./cartlist"));
	return mv;
	}
	@RequestMapping(value="/addcount")
	public ModelAndView addcount(Model model,
			ModelAndView mv,
			HttpServletRequest request){
		Cart cart=new Cart();
		String good_sn = request.getParameter("good_sn");
		cart.setGood_sn(good_sn);
		cartService.addCart(good_sn);
		mv.setView(new RedirectView("./cartlist"));
		return mv;
	}
}
