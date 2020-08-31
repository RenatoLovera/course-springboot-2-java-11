package com.educandoweb.course.services.excetions;

public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(Object id) {
		super("Resorce not founf. Id " + id);
	}

}
