import java.util.Scanner;

public class Demo034 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = scan.nextInt();
        if (number % 2 == 0) {
            System.out.println("The number is even.Thank you");
        } else {
            System.out.println("The number is odd.Thank you");
        }
    }
}