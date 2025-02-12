/*Write a java program to print sum of cubes of a digit of a number. */

import java.util.Scanner;

public class Demo056 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sumOfCubes = 0;
        while (number != 0) {
            int digit = number % 10;
            sumOfCubes += digit * digit * digit;
            number /= 10;
        }
        System.out.println("Sum of cubes of digits: " + sumOfCubes);
    }
}