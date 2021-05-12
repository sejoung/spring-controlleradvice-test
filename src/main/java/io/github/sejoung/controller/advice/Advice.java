package io.github.sejoung.controller.advice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@ControllerAdvice(annotations = Controller.class)
public class Advice {
  @ExceptionHandler(Exception.class)
  public ModelAndView handleException(Exception exception) {
    log.error(exception.getMessage(), exception);
    return new ModelAndView("error");
  }
}
