package com.tistory.jimin.twitter.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import com.tistory.jimin.twitter.model.User;
import com.tistory.jimin.twitter.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController 
@RequestMapping("user")
public class UserController {
  
  private UserService userService;

  @PostMapping
  public void insertUser(@Valid @NonNull @RequestBody User user) {
    userService.insertUser(user);
  }

  @GetMapping
  public List<User> selectAllUser() {
    return userService.selectAllUser();
  }

  @GetMapping(path="{id}")
  public User selectUSerById(@PathVariable("id") UUID id) {
    return userService.selectUserById(id)
                      .orElse(null);
  }

  @PutMapping(path="{id}")
  public void updateUserById(@PathVariable("id") UUID id, @Valid @NonNull @RequestBody User updateUser) {
    userService.updateUserById(id, updateUser);
  }

  @DeleteMapping(path="{id}")
  public void deleteUserById(@PathVariable("id") UUID id) {
    userService.deleteUserById(id);
  }
  
}
