package com.codingdojo.dojosandninjas.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.dojosandninjas.models.Dojo;
import com.codingdojo.dojosandninjas.services.DojoService;

@Controller
public class DojoController {
	@Autowired
	DojoService dojoService;
	
	@RequestMapping("/")
	public String redirectto() {
		return "redirect:/dojos/new";
	}
	
	@RequestMapping("/dojos/new")
	public String newDojo( @ModelAttribute("dojo") Dojo dojo,Model model) {
		model.addAttribute("dojos", dojoService.allDojos());
		return "/dojos/new.jsp";
	}
	
	@RequestMapping(value="/dojos", method=RequestMethod.POST )
	public String dojoToDb(@Valid @ModelAttribute("dojo") Dojo dojo ,BindingResult result,Model model) {
		
		
		if(result.hasErrors()) {
			model.addAttribute("dojos", dojoService.allDojos());
			return "/dojos/new.jsp";
		} else {
			dojoService.createDojo(dojo);
			return "redirect:/dojos/new";
		}
		
	}
	
	@RequestMapping("/dojos/{id}")
	public String dojoView(@PathVariable("id") Long id, Model model) {
		model.addAttribute("dojo", dojoService.findDojo(id));
		return "/dojos/view.jsp";
	}
	
	@GetMapping("/dojos/delete/{id}")
	public String delete(@PathVariable("id") Long id,Model model,@ModelAttribute("dojo") Dojo dojo ) {
		dojoService.deleteDojo(id);
		
		return "redirect:/dojos/new";
	}
}
