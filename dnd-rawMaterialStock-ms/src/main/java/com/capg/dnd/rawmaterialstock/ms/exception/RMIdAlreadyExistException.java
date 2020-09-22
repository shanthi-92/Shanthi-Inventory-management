package com.capg.dnd.rawmaterialstock.ms.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code=HttpStatus.NOT_FOUND,reason="Raw material Id already exist",value=HttpStatus.NOT_FOUND)
public class RMIdAlreadyExistException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public  RMIdAlreadyExistException(String message)
	{
		super(message);
}

}

