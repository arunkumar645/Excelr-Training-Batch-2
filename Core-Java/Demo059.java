import java.util.Scanner;

public class Demo059 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = s1.nextInt();

        if (num % 2 != 0) {
            System.out.println("The given Number " + num + " is prime.");
        } else {
            System.out.println("The number " + num + " is not Prime");
        }
    }

}