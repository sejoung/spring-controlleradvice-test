package io.github.sejoung.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import io.github.sejoung.service.TestService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class TestController {

  private final TestService service;

  @RequestMapping("/")
  public ModelAndView home() {
    service.test();
    return new ModelAndView("home");
  }

}
