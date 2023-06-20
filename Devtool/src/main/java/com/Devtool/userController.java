package com.Devtool;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class userController {

	@RequestMapping("/test")
	@ResponseBody
	public String home() {
		int a=12;
		int b=24;
		int c=88;
		return "Testing the devtools /n some of numbers is: "+(a+b-c);
	}
}
