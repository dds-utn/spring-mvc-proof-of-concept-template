package dds.error;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
class ExceptionHandler {

  @org.springframework.web.bind.annotation.ExceptionHandler(value = Exception.class)
  public ModelAndView exception(Exception exception, WebRequest request) {
    ModelAndView modelAndView = new ModelAndView("error/general");
    modelAndView.addObject("errorMessage", exception);
    return modelAndView;
  }
}