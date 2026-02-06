import java.util.Scanner;

class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctUsername = "adddmin";
        String correctPassword = "1002";

        int attempts = 0;

        while (attempts < 3) {
            String username = sc.next();
            String password = sc.next();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Login Successful");
                break;
            } else {
                attempts++;
                System.out.println("Wrong Credentials");
            }
        }

        if (attempts == 3) {
            System.out.println("Account Locked");
        }
    }
}
