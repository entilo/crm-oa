package com.crm.www.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *@author:12
 *@Time:2017年2月21日下午11:42:17
 *@Description:TODO
 *@FileInfo:com.crm.www.controller.LoginAndSignController.java
 */
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
