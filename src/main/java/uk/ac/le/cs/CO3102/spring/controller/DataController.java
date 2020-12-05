package uk.ac.le.cs.CO3102.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import uk.ac.le.cs.CO3102.spring.service.DataService;

@Controller
@RequestMapping(value = {"/Covid"})
public class DataController {
	  @Autowired
	  DataService ads;
	
	  @RequestMapping(value = {"/cases"})
	    public ModelAndView listAll(){
		  
	        return new ModelAndView("login","account",ads.findAllCases());
	    }  
		  @RequestMapping(value = {"/listAllJson"})
	    public @ResponseBody Object listAllJson(Model model){
	        Object o=ads.findAllCases();
	        return o;
	    }
		  
		  @RequestMapping(value = {"/region"})
		    public ModelAndView regioncases(@RequestParam String country){
			    System.out.println(country);
		        return new ModelAndView("region","account",ads.findByName(country));
		    }  
	   
}
