import java.util.Scanner;

public class Demo008 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String loginid = "Arun";
        String pwd = "123456";
        String reply;

        do {
            System.out.println("Welcome to Malla Reddy University");
            System.out.println("Have you visited our site earlier? (yes/no)");
            reply = scan.nextLine();

            if (reply.equalsIgnoreCase("no")) {
                System.out.println("Login here");
                System.out.println("Enter your ID:");
                loginid = scan.nextLine();
                System.out.println("Enter your password:");
                pwd = scan.nextLine();
            } else {
                System.out.println("You are our valued customer.");
            }

        } while (!loginid.equals("Arun") || !pwd.equals("123456")); // Loop until valid credentials

        System.out.println("Login successful!");
        scan.close();
    }
}
