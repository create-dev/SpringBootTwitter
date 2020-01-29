package com.tistory.jimin.twitter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
public class TwitterApplication {

  @RequestMapping("/index")
  public ModelAndView index() {
    return new ModelAndView("welcome");
  }
  public static void main(String[] args) {
    SpringApplication.run(TwitterApplication.class, args);
  }
}