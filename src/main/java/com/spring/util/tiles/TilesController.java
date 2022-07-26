package com.spring.util.tiles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/tiles")
public class TilesController {
	
	@RequestMapping(value="/content1" , method=RequestMethod.GET)
	public String content1() {
		return "/content1"; //tiles설정 파일의 <definition name="/content1">로 return
	}
	
	@RequestMapping(value="/content2" , method=RequestMethod.GET)
	public ModelAndView content2() {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/content2"); //tiles설정 파일의 <definition name="/content2">로 return
		
		return mv; 
	
	}
	
	@RequestMapping(value="/content3" , method=RequestMethod.GET)
	public ModelAndView content3() {
		return new ModelAndView("/content3");	//tiles설정 파일의 <definition name="/content3">로 return
	}
	
	
	
	
}
