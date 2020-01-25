package com.tistory.jimin.twitter.controller;

import com.tistory.jimin.twitter.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController 
@RequestMapping(value="/user")
public class UserController {
  
  @Autowired
  private UserService userService;

  @RequestMapping(value="/create", method=RequestMethod.GET)
  public String requestMethodName() {
    return "/user/create";
  }
  
}
