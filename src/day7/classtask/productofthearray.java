         package day7.classtask;

public class productofthearray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int product = 1;
        for (int i = 1; i < 5; i++) {
            product = product*arr[i];
            System.out.println(product);
        }
        System.out.println("Total product: " +product);
    }
}