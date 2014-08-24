package com.aig.dms.ExceptionHandlers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.aig.dms.CustomExceptions.NoDataFoundException;

@ControllerAdvice
public class PersistanceControllerExceptionHandler {

	@ExceptionHandler(NoDataFoundException.class)
	public ModelAndView handleNoDataFoundException( HttpServletRequest req, Exception e){
		
		String s = "s";
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("error");
		mv.addObject("ErrorType", "No Data found for your request");
		return mv;
		
	}
	
	
	
}
