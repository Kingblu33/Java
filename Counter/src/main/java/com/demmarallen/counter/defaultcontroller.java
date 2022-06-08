package com.demmarallen.counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class defaultcontroller {
      
	@GetMapping("/")
	public String Counter(HttpSession session) {
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
		else {
			Integer currentCount = (Integer) session.getAttribute("count") + 1;
			session.setAttribute("count",currentCount);
		}
		return "home.jsp";
	}
	
	@GetMapping("/in3")
	public String Counter2(HttpSession session, Model model) {
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
		else {
			Integer currentCount = (Integer) session.getAttribute("count") + 2;
			session.setAttribute("count",currentCount);
		}
		Integer currentCount = (Integer) session.getAttribute("count");
		model.addAttribute("countToShow", currentCount);
		return "showcounter3.jsp";
	}
	@GetMapping("/showcount")
	public String Counter1(HttpSession session, Model model) {
		Integer currentCount = (Integer) session.getAttribute("count");
		model.addAttribute("countToShow", currentCount);
		return "counter.jsp";
	}
	@GetMapping("/clear")
	public String clear(HttpSession session) {
		session.invalidate();
		return "home.jsp";
	}
	
	
}
