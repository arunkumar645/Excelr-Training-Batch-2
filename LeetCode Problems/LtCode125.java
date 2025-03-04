package LeetCode;

import java.util.Scanner;

public class LtCode125 {

    public boolean isPalindrome(String s) {

        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        System.out.println("Converted and checked: " + s);

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String input = scan.nextLine();

        LtCode125 L1 = new LtCode125();
        boolean result = L1.isPalindrome(input);

        System.out.println("Is palindrome? " + result);

        scan.close();
    }
}
