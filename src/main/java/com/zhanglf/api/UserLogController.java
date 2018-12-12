package com.zhanglf.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/log")
@Controller
public class UserLogController {

	@RequestMapping(value="/show",method = RequestMethod.GET)
	@ResponseBody
	public String show() {
		System.out.println("-------进入api层的方法了------------");
		return "aaa";
	}

}
