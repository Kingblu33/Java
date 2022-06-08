package com.demmarallen.daikichi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller

public class DaikichiController {
	
	
	@RequestMapping("")
	public String base(String searchQuery) {
		if (searchQuery == null) {
			return "return a something";
		}
		else {
			 return "You searched for: " + searchQuery;
		}
		
	}
	
	@RequestMapping("/testhtml")
	public String test() {
		return "index.jsp";
	}
	@RequestMapping("/today")
	public String base2() {
		
		return "Today you will find luck in all your endeavors!";
	}
	@RequestMapping("/tomorrow")
	public String base3() {
		
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	@RequestMapping("/travel")
	public String base4(String island) {
		System.out.println(island);
        return "Congratulations! You will soon travel to " + island; 
	}
	
	
	 @RequestMapping("/{number}")
	    public String showLesson(@PathVariable("number") Integer number){
		 if (number % 2 == 0) {
			 return "You will take a grand journey in the near future, but be weary of tempting offers";
		 }
		 else {
			 return "You have enjoyed the fruits of your labor but now is a great time to spend time 			with family and friends"; 
		 }
	    	
	    }
	
	
	}


