package login;

public class ValidateUser {

	public static boolean validateUser(String username, String password) {
		if((username.equals("James") || username.equals("Josh") || username.equals("James1")) && password.equals("Password")){
			return true;
		}
		return false;
	}
}
