public class Demo014 {
    public static void main(String[] args) {
        int a = 10;
        a++;
        a--;
        System.out.println("Unary operater for postincrement: " + a++);
        System.out.println("Unary operater for postdecrement: " + a--);
        System.out.println("Unary operater for predecrement: " + --a);
        System.out.println("Unary operater for preincrement: " + ++a);
    }
}