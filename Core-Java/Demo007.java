import java.util.Scanner;

public class Demo007 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your user_name : ");
        String user_name = scan.nextLine();
        System.out.print("Enter the phno: ");
        int phno = (int) scan.nextLong();
        System.out.println("Enter your age: ");
        int age = scan.nextInt();
        System.out.println("Welcome: " + user_name);
        System.out.println("Your phno is " + phno);
        System.out.println("Your age is: " + age);

    }
}
