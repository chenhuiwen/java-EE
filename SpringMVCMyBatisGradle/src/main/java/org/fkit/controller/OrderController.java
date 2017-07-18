package org.fkit.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.fkit.domain.Good;
import org.fkit.domain.Order;
import org.fkit.service.GoodService;
import org.fkit.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class OrderController {
	@Autowired
	@Qualifier("orderService")
	private OrderService orderService;
	
	@RequestMapping(value="/orderlist")
	 public String orderlist(Model model){
		List<Order> order_list = orderService.getAll();
		model.addAttribute("order_list", order_list);
		return "orderlist";
	}
	@RequestMapping(value="/order")
	 public String order(Model model){
		List<Order> order_list = orderService.getAll();
		model.addAttribute("order_list", order_list);
		return "order";
	}
	@RequestMapping(value="/addorder")
	public ModelAndView addorder(
			@ModelAttribute Order order,
			ModelAndView mv,
			 HttpSession session){
		String state="待处理";
		order.setState(state);
		int count=orderService.addorder(order);
		mv.setView(new RedirectView("./orderlist"));
	return mv;
	}
	@RequestMapping(value="/deleteorder")
	public ModelAndView deleteorder(
			@ModelAttribute Order order,
			ModelAndView mv,
			 HttpSession session){
		int count=orderService.deleteorder(order);
		mv.setView(new RedirectView("./orderlist"));
	return mv;
	}
	@RequestMapping(value="/doingorder")
	public ModelAndView doingorder(
			@ModelAttribute Order order,
			ModelAndView mv,
			 HttpSession session,
			 HttpServletRequest request){
		int id=Integer.parseInt(request.getParameter("id"));
		order.setId(id);
		String state="配送中";
		order.setState(state);
		orderService.updateOrder(state, id);
		mv.setView(new RedirectView("./orderlist"));
	return mv;
}
	@RequestMapping(value="/endorder")
	public ModelAndView endorder(
			@ModelAttribute Order order,
			ModelAndView mv,
			 HttpSession session,
			 HttpServletRequest request){
		int id=Integer.parseInt(request.getParameter("id"));
		order.setId(id);
		String state="已完成";
		order.setState(state);
		orderService.updateOrder(state, id);
		mv.setView(new RedirectView("./order"));
	return mv;
}
	@RequestMapping(value="/selectorder")
	 public ModelAndView selectorder(
			 int id,
			 ModelAndView mv,
			 HttpSession session){
		Order order=orderService.selectOrder(id);
		session.setAttribute("order", order);
		mv.setViewName("showorder");
		return mv;
	}
}
