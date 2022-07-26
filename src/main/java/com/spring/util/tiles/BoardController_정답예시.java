package com.spring.util.tiles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/tiles")
public class BoardController_정답예시 {

	@RequestMapping(value = "/boardList_정답예시" , method = RequestMethod.GET)		
	public String boardList() {
		return "board/boardList_정답예시";	
	}
	
	@RequestMapping(value = "/boardWrite_정답예시" , method = RequestMethod.GET)		
	public String boardWrite() {
		return "board/boardWrite_정답예시";
	}
	
	@RequestMapping(value = "/boardUpdate_정답예시" , method = RequestMethod.GET)		
	public ModelAndView boardUpdate() {
		return new ModelAndView("board/boardUpdate_정답예시");
	}
	
	@RequestMapping(value = "/boardDelete_정답예시" , method = RequestMethod.GET)		
	public ModelAndView boardDelete() {
		return new ModelAndView("board/boardDelete_정답예시");
	}
	
}
