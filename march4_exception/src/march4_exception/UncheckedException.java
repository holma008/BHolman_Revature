package march4_exception;

public class UncheckedException {

	public static void main(String[] args) {
		
		Validator v = new Validator();
		try {
			if(v.isValidDL("E4982312")) {
				System.out.println("valid dl number");
			}

		}
		catch(InvalidDLException e) {
			System.out.println(e.getMessage());
		}
	}
}
