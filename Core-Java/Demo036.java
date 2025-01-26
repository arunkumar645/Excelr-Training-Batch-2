import java.util.Scanner;

public class Demo036 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the 1st number: ");
        int number1 = scan.nextInt();

        System.out.println("Enter the 2nd number: ");
        int number2 = scan.nextInt();

        System.out.println("Enter the 3rd number: ");
        int number3 = scan.nextInt();

        if (number1 >= number2 && number1 >= number3) {
            System.out.println("The 1st number (" + number1 + ") is the biggest.");
        } else if (number2 >= number1 && number2 >= number3) {
            System.out.println("The 2nd number (" + number2 + ") is the biggest.");
        } else {
            System.out.println("The 3rd number (" + number3 + ") is the biggest.");
        }

        scan.close();
    }
}