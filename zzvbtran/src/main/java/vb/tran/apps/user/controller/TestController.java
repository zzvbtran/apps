package vb.tran.apps.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

	private String message;
	
	@RequestMapping(value= {"/", "/index"},method=RequestMethod.GET)
	public String index() {
		///ddddeddd
		// 001
		// 002
		// 003
		return "xxx";
	}
}
