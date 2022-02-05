import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.Scanner;

class EmailValidator {
	/**
	 * This method validates email address
	 * 
	 * @param email
	 * @return
	 */
	public static boolean isValidEmail(String email) {
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
				+ "A-Z]{2,7}$";

		Pattern pat = Pattern.compile(emailRegex);
		if (email == null)
			return false;
		return pat.matcher(email).matches();
	}

	public static void main(String[] args) {
		// array to store email addresses
		ArrayList<String> address = new ArrayList<>();

		address.add("pradnya.kulkarni@gmail.com");
		address.add("pradnya.kulkarni@simillearn.com");
		System.out.println("Please Enter Email to be searched:");
		// scanner to take input from user
		try (Scanner sc = new Scanner(System.in)) {
			String email = sc.nextLine();

			boolean isValid = isValidEmail(email);
			if (isValid) {
				// if valid email id given then check weather it exist in employee email id list
				if (address.contains(email)) {
					System.out.println(email + " is valid Employee Email");
				}
				
			} else {
				System.out.println(email + " is Not Employee Email");
			}
		} catch (Exception e) {
			System.out.println("Something went wrong: " + e);
		}

	}
}