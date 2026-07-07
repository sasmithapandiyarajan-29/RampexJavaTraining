package day7.classtask;

import java.util.Arrays;
public class arrayeven {
        public static void main(String[] args){
            int[] arr =new int[5];
            for(int index = 0; index <= 4; index++){
                arr[index] = index*2;
                System.out.println("Running");
            }
            System.out.println(Arrays.toString(arr));

        }
    }

