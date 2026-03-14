package task1;
import java.util.Scanner;

public class LoginSystem {

    public static boolean login() {
        Scanner sc = new Scanner(System.in);

        String user = "admin";
        String pass = "1234";

        System.out.println("===== LOGIN FORM =====");
        System.out.print("Enter Login ID: ");
        String id = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        if(id.equals(user) && password.equals(pass)) {
            System.out.println("Login Successful!\n");
            return true;
        }
        else {
            System.out.println("Invalid Login Details!");
            return false;
        }
    }
}
