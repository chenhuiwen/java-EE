package org.fkit.controller;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.fkit.domain.Order;
import org.fkit.domain.User;
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
			 HttpSession session,
			 HttpServletRequest request){
		int good_sn=Integer.parseInt(request.getParameter("good_sn"));
		int count=Integer.parseInt(request.getParameter("count"));
		String state="待处理";
		order.setState(state);
		orderService.addorder(order, good_sn, count);
		mv.setView(new RedirectView("./order"));
	return mv;
	}
	@RequestMapping(value="/deleteorder")
	public ModelAndView deleteorder(
			@ModelAttribute Order order,
			ModelAndView mv,
			 HttpSession session){
		orderService.deleteorder(order);
		mv.setView(new RedirectView("./orderlist"));
	return mv;
	}
	@RequestMapping(value="/doingorder")
	public ModelAndView doingorder(
			@ModelAttribute Order order,
			ModelAndView mv,
			 HttpSession session,
			 HttpServletRequest request,
			 HttpServletResponse response) throws Exception{
		int id=Integer.parseInt(request.getParameter("id"));
		order.setId(id);
		String state="配送中";
		order.setState(state);
		orderService.updateOrder(state, id);
		int user_sn=Integer.parseInt(request.getParameter("user_sn"));
		User user=new User();
		user=orderService.selectUser(user_sn);
		String email=user.getEmail();
		System.out.println(email);
		StringBuffer url = new StringBuffer();
		StringBuilder builder = new StringBuilder();
		// 正文
		builder.append("亲爱的"+user.getUsername()+"您的邮件正在派送中，请保持手机畅通");
		url.append("订单状态:" + order.getState());
		SimpleEmail sendemail = new SimpleEmail();
		sendemail.setHostName("smtp.163.com");
		
		// 指定要使用的邮件服务器
		sendemail.setAuthentication("18205206236@163.com", "huiwen970112");// 使用163的邮件服务器需提供在163已注册的用户名、密码
		sendemail.setCharset("UTF-8");
		try {
			sendemail.setCharset("UTF-8");
			sendemail.addTo(email);
			sendemail.setFrom("18205206236@163.com");
			sendemail.setSubject("订单状态");
			sendemail.setMsg(builder.toString());
			sendemail.send();
			System.out.println(builder.toString());
		} catch (EmailException e) {
			e.printStackTrace();
		}
		
	
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
