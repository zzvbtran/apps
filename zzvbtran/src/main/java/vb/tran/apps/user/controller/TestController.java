package vb.tran.apps.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {


	@RequestMapping(value= {"/", "/index"},method=RequestMethod.GET)
	public String index(Model model) {
		  String message = "Hello Spring Boot + JSP";
		  
	        model.addAttribute("message", message);
		return "index";
	}
}
