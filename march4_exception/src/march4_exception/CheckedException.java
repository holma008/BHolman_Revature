package march4_exception;

public class CheckedException {

	public static void main(String[] args) {
		
		Validator v = new Validator();
		try {
			if(v.isValidPassport("149182312")) {
				System.out.println("valid passport number");
			}

		}
		catch(InvalidPassportException e) {
			System.out.println(e.getMessage());
		}
	}
}
