package day7.classtask;

import java.util.Arrays;
import java.util.Scanner;
public class arrayuser {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0; i < 5; i++){
            System.out.print("Enter the value of position: " + i+1);
            arr[i] = sc.nextInt();
            System.out.println(Arrays.toString(arr));
        }

    }
}
