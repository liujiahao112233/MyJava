package com.liu.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.liu.model.User;
import com.liu.service.UserService;

@Controller
@RequestMapping("User")
public class UserController {
	@Autowired
	UserService userService;
@RequestMapping("selectAll")
	public String select(HttpServletRequest request){
	
	List<User> userList=userService.selectAll();
	System.out.println(userList);
	request.setAttribute("ul", userList);
	return "index";
	}
	
}
