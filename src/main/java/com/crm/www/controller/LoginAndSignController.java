package com.crm.www.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/home")
@Controller
public class LoginAndSignController {

	@RequestMapping("/login")
	public String login() {
		return null;
	}

	@RequestMapping("/loginOut")
	public String loginOut() {
		return null;
	}

	@RequestMapping("/sign")
	public String sign() {
		return null;
	}
}
