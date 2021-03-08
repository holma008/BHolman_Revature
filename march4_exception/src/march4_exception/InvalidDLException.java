package march4_exception;

public class InvalidDLException extends RuntimeException{
	
	public InvalidDLException() {
		super();
	}

	public InvalidDLException(final String message) {
		super(message);
	}

}
