package com.aig.dms.ExceptionHandlers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalControllerExceptionHandler {
	
	
	private static String DEFAULT_ERROR_PAGE = "error";
	
	@ExceptionHandler(Exception.class)
	public ModelAndView defaultErrorHandler(HttpServletRequest req, Exception e) {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName(DEFAULT_ERROR_PAGE);
		return mv;
	}

}
