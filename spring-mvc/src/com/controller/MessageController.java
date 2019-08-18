package com.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.User;


/*
 * As you can see from controller methods, logical view names that are returned are “home” and “user” 
 * which means there should be two JSPs home.jsp and user.jsp inside folder /WEB-INF/jsp.
 */

@Controller
public class MessageController {
 @RequestMapping(value = "/", method = RequestMethod.GET)
 public String showHome(Model model) {
  model.addAttribute(new User());
  model.addAttribute("message1", "This is my first MVC page");
  return "home";
 }
 
 @RequestMapping(value = "/showUser", method = RequestMethod.POST)
 public String showUser(@ModelAttribute("user") User user, Model model) {
  model.addAttribute("firstName", user.getFirstName());
  model.addAttribute("lastName", user.getLastName());
  return "user";
 }
}
