package day1;

public class Division {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        int intResult = a / b;
        double floatResult = (double) a / b;

        System.out.println("Integer day1.Division: " + a + " / " + b + " = " + intResult);
        System.out.println("Floating-Point day1.Division: " + a + " / " + b + " = " + floatResult);
    }
}
