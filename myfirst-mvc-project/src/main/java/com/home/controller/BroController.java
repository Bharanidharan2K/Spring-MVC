package com.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BroController {
	
	@ResponseBody
	@RequestMapping("/cricketbat")
	public String giveCricketBat() {
		return "Here is my cricket bat";
	}
}
