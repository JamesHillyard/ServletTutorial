package login;

public class ValidateUser {

	public static boolean validateUser(String username, String password) {
		if(username.equals("James") || username.equals("Andi") && password.equals("Password")){
			return true;
		}
		return false;
	}
}
