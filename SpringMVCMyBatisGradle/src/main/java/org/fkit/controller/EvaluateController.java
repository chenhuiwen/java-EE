package org.fkit.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.fkit.domain.Evaluate;
import org.fkit.service.EvaluateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class EvaluateController {
	@Autowired
	@Qualifier("evaluateService")
	private EvaluateService evaluateService;
	@RequestMapping(value="/evaluatelist")
	public String evaluatelist(Model model){
		List<Evaluate> evaluate_list=evaluateService.getALL();
		model.addAttribute("evaluate_list",evaluate_list);
		return "evaluatelist";
	}
	@RequestMapping(value="/saveEvaluate")
	public ModelAndView saveEvaluate(
			@ModelAttribute Evaluate evaluate,
			ModelAndView mv,
			 HttpSession session,
			 HttpServletRequest request){
		evaluateService.saveEvaluate(evaluate);
		mv.setView(new RedirectView("./evaluatelist"));
	return mv;
	}
	@RequestMapping(value="/deleteevaluate")
	public ModelAndView deleteevaluate(
			@ModelAttribute Evaluate evaluate,
			ModelAndView mv,
			 HttpSession session,
			 HttpServletRequest request){
		int id=Integer.parseInt(request.getParameter("id"));
		evaluate.setId(id);
		evaluateService.deleteEvaluate(id);
		mv.setView(new RedirectView("./evaluatelist"));
	return mv;
	}
	@RequestMapping(value="/showEvaluate")
	 public String showEvaluate(Model model,
			 @ModelAttribute Evaluate evaluate ,
			 HttpServletRequest request){
		int good_sn=Integer.parseInt(request.getParameter("good_sn"));
		evaluate.setGood_sn(good_sn);
		List<Evaluate> evaluate_list = evaluateService.selectEvaluate(good_sn);
		model.addAttribute("evaluate_list", evaluate_list);
		return "showEvaluatetForm";
	}
}
