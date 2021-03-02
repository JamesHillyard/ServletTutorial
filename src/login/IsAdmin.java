package login;

public class IsAdmin {
    public static boolean checkAdmin(String username) {
        if (username.matches(".*\\d")) {
            return true;
        }
        return false;
    }
}
