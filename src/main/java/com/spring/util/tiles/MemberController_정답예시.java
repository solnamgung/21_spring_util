package com.spring.util.tiles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/tiles")
public class MemberController_정답예시 {
	
	@RequestMapping(value="/login_정답예시" , method=RequestMethod.GET)
	public String login() {
		return "m/login_정답예시";
	}
	
	@RequestMapping(value="/detail_정답예시" , method=RequestMethod.GET)
	public String memberDetail() {
		return "m/detail_정답예시";
	}
	
	@RequestMapping(value="/cart_정답예시" , method=RequestMethod.GET)
	public ModelAndView cart() {
		return new ModelAndView("m/cart_정답예시");
	}
	
	@RequestMapping(value="/myPage_정답예시" , method=RequestMethod.GET)
	public ModelAndView myPage() {
		return new ModelAndView("m/myPage_정답예시");
	}
	
}
