package org.maubergine.vindaloo.web;

import java.util.Date;

import org.apache.log4j.Logger;
import org.maubergine.vindaloo.services.ProductManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello.htm")
public class InventoryController 
{

	private static final Logger logger = Logger.getLogger(InventoryController.class); 
	
	@Autowired
	private ProductManager productManager;
	
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model){
		String now = new Date().toString();
		
		logger.info("returning hello view with " + now);
		
		
		model.addAttribute("message", "Spring 3 MVC Hello World");
		model.addAttribute("now", now);	
		model.put("products", this.productManager.getProducts());
		
		return "hello";
		
	}
	
	
	
}
