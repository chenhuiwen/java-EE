package org.fkit.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.fkit.domain.Evaluate;
import org.fkit.domain.Good;
import org.fkit.service.EvaluateService;
import org.fkit.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class GoodController {
	@Autowired
	@Qualifier("goodService")
	private GoodService goodService;
	@Qualifier("evaluateService")
	private EvaluateService evaluateService;
	@RequestMapping(value="/goodlist")
	 public String goodlist(Model model){
		List<Good> good_list = goodService.getAll();
		model.addAttribute("good_list", good_list);
		return "goodlist";
	}
	@RequestMapping(value="/delete")
	public ModelAndView delete(
			@ModelAttribute Good good,
			ModelAndView mv,
			 HttpSession session,
			 HttpServletRequest request){
		int id=Integer.parseInt(request.getParameter("id"));
		good.setId(id);
		int count=goodService.deleteGood(id);
		mv.setView(new RedirectView("./goodlist"));
	return mv;
	}
	@RequestMapping(value="/add")
	public ModelAndView add(
			@ModelAttribute Good good,
			ModelAndView mv,
			 HttpSession session){
		int sale=0;
		good.setSale(sale);
		goodService.add(good);
		mv.setView(new RedirectView("./goodlist"));
	return mv;
	}
	
	
	@RequestMapping(value="/gift")
	 public String gift(Model model,
			 @ModelAttribute Good good ,
			 HttpServletRequest request){
		String parent_category_sn=request.getParameter("parent_category_sn");
		good.setParent_category_sn(parent_category_sn);
		List<Good> good_list = goodService.getSome(parent_category_sn);
		model.addAttribute("good_list", good_list);
		return "giftForm";
	}
	@RequestMapping(value="/select")
	 public ModelAndView select(
			 ModelAndView mv,
			 HttpSession session,
			 HttpServletRequest request){
		int id=Integer.parseInt(request.getParameter("id"));
		Good good=goodService.selectGood(id);
		session.setAttribute("good", good);
		//int good_sn=id;
		//evaluate.setGood_sn(good_sn);
		//List<Evaluate> evaluate_list=evaluateService.selectEvaluate(good_sn);
		//model.addAttribute("evaluate_list",evaluate_list);
		mv.setViewName("showForm");
		return mv;
	}
	
	/*@RequestMapping(value="/reduceGood")
	public ModelAndView reduceGood(
			@ModelAttribute Good good,
			ModelAndView mv,
			 HttpSession session,
			 HttpServletRequest request){
		int id=Integer.parseInt(request.getParameter("good_sn"));
		good.setId(id);
		Good good1= goodService.selectGood(id);
		int count=good1.getCount();
		if (count == 1){
			goodService.deleteGood(id);
		}else{
			goodService.reduce(id);
			}
		
		mv.setView(new RedirectView("./addorder"));
	return mv;
	}*/
	@RequestMapping(value="/sumGood")
	public String sumGood(){
		int sum=goodService.sum();
		System.out.println(sum);
		int sale=goodService.sale();
		
		return "sum";
	}
}

