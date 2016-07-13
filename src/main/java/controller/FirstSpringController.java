package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
   
@Controller    
public class FirstSpringController {
   
    @RequestMapping(value = "/hello", method = RequestMethod.GET)  
	public String firstCtrl(ModelMap model) {
        model.addAttribute("message", "Hello! This is My First Spring MVC Web Controller.");
        return "firstCtrl";
    }  
}
