package main.util;

@SuppressWarnings("serial")
public class CustomException extends Exception {
	public CustomException(String errorMessage) {
        super(errorMessage);
    }
}
