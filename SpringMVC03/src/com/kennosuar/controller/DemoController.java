package com.kennosuar.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.kennosuar.pojo.Users;

@Controller
public class DemoController {
	@RequestMapping("{page}")
	public String main(@PathVariable String page) {
		return page;
	}
	@RequestMapping("login")
	public String login(Users users,HttpSession session) {
		if (users.getUsername().equals("admin")&&users.getPassword().equals("123")) {
			session.setAttribute("users", users);
			return "main";    //会走自定义视图解析器,而不是控制器(控制器"redirect:/main")
		}else {
			return "redirect:/login.jsp";
		}
	}
}
