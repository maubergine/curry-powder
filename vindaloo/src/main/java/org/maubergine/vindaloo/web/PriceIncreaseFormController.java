package org.maubergine.vindaloo.web;


import javax.validation.Valid;

import org.maubergine.vindaloo.services.PriceIncrease;
import org.maubergine.vindaloo.services.ProductManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@RequestMapping("price-increase.htm")
@Controller
@SessionAttributes
public class PriceIncreaseFormController { 

	
	@Autowired
	private ProductManager productManager;

	@RequestMapping(method = RequestMethod.POST)
	public String onSubmit(@ModelAttribute("priceIncrease") @Valid PriceIncrease priceIncrease, BindingResult result, ModelMap model){
		
		if(result.hasErrors()){
			return "price-increase";
		}
		
		
		
        productManager.increasePrice(priceIncrease.getPercentage());

        model.addAttribute("priceIncrease", priceIncrease);
        
        return "increase-display";
        
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String onRequest(ModelMap model){
		
		PriceIncrease pi = new PriceIncrease();
		
		model.addAttribute("priceIncrease", pi);
		
		return "price-increase";
		
	}
	
}
