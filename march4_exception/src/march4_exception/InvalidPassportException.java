package march4_exception;

public class InvalidPassportException extends Exception {
	
	public InvalidPassportException() {
		super();
	}

	public InvalidPassportException(final String message) {
		super(message);
	}

}
