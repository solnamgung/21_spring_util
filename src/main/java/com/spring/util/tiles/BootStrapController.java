package com.spring.util.tiles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/bootstrap")
public class BootStrapController {

	@RequestMapping(value="/index" , method=RequestMethod.GET)
	public String index() {
		return "bootIndex";
	}
	
	@RequestMapping(value="/checkout" , method=RequestMethod.GET)
	public String checkout() {
		return "/bootCheckout";
	}
	
	@RequestMapping(value="/productDetails" , method=RequestMethod.GET)
	public String productDetails() {
		return "/a";
	}
	
	@RequestMapping(value="/blog" , method=RequestMethod.GET)
	public String blog() {
		return "/abc";
	}
	
	
	
	
}


