package org.fkit.controller;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.fkit.domain.Cart;
import org.fkit.domain.Collect;
import org.fkit.service.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class CollectController {
	@Autowired
	@Qualifier("collectService")
	private CollectService collectService;
	@RequestMapping(value = "/savecollect")
	public ModelAndView addCart(
			@ModelAttribute Collect collect,
			ModelAndView mv,
			 HttpSession session,
			 HttpServletRequest request){
		int good_sn=Integer.parseInt(request.getParameter("good_sn"));
		collect.setGood_sn(good_sn);
		int user_sn=Integer.parseInt(request.getParameter("user_sn"));
		collect.setUser_sn(user_sn);
	    Collect collect1= collectService.findCollect(good_sn, user_sn);
		if(collect1==null){
		collectService.saveCollect(collect);
		}
		mv.setView(new RedirectView("./main"));
				return mv;
		
	}
	@RequestMapping(value="/collectlist")
	public String collectlist(Model model,
			 HttpServletRequest request){
		Collect collect=new Collect();
		int user_sn=Integer.parseInt(request.getParameter("user_sn"));
		collect.setUser_sn(user_sn);
		List<Collect> collect_list=collectService.getAll(user_sn);
		model.addAttribute("collect_list", collect_list);
		return "collectlist";
	}
	@RequestMapping(value="/removecollect")
	public ModelAndView removecollect(
			@ModelAttribute Collect collect,
			ModelAndView mv,
			HttpServletRequest request,
			 HttpSession session){
		int user_sn=Integer.parseInt(request.getParameter("user_sn"));
		collect.setUser_sn(user_sn);
		int good_sn=Integer.parseInt(request.getParameter("good_sn"));
		collect.setGood_sn(good_sn);
		collectService.removeCollect(good_sn, user_sn);
		mv.setView(new RedirectView("./collectlist"));
	return mv;
	}

}
