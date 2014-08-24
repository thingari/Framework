package com.aig.dms.CustomExceptions;

public class NoDataFoundException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoDataFoundException() {
		super();
	}
	
	public NoDataFoundException(String msg, Exception e) {
		super(msg, e);
	}
	

}
