package com.demmarallen.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiPathVariable {
	@RequestMapping("")
	public String base20() {
		
		return "you made it pussy boy";
	}
	

}
