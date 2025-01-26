import java.util.Scanner;

public class Demo035 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the 1st number1: ");
        int number1 = scan.nextInt();
        System.out.println("Enter the 2nd number2: ");
        int number2 = scan.nextInt();
        if (number1 > number2) {
            System.out.println("The number1 is greater then number2 that you have entered.Thank you");

        } else if (number1 < number2) {
            System.out.println("The number2 is greater then number1 that you have enterd. Thank you");
        } else {
            System.out.println("The both the numbers are same from provided numbers.Thank you");
        }

    }

}