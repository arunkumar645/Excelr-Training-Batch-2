public class Demo023 {

    public static int isPalindrome(int num) {

        if (num <= 0) {
            return -1;
        }

        int originalNum = num;
        int reversedNum = 0;

        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        if (originalNum == reversedNum) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome(232));
        System.out.println(isPalindrome(345));
        System.out.println(isPalindrome(-123));
        System.out.println(isPalindrome(0));
    }
}