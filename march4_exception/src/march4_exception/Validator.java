package march4_exception;

public class Validator {

	public boolean isValidPassport(String passport) throws InvalidPassportException{
		if(!passport.matches("[0-9]{9}")) {
			throw new InvalidPassportException("invalid passport number");
		}
		return true;
	}
	
	public boolean isValidDL(String dl) throws InvalidDLException{
		if(!dl.matches("[A-Z]{1}[0-9]{7}")) {
			throw new InvalidDLException("invalid dl number");
		}
		return true;
	}
}
