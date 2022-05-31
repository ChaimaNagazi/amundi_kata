package org.amundi.exceptions;

/**
 * create new checked exception thrown in order to indicate that a method has
 * been passed an illegal argument
 *
 */
public class IllegalArgumentException extends Exception {
	public IllegalArgumentException(String message) {
		super(message);
	}
}
