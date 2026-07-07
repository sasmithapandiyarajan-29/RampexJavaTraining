package day7.hometask;

import java.util.Scanner;

    public class GreaterThanAverage {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter array size: ");
            int n = sc.nextInt();

            int arr[] = new int[n];
            int sum = 0;

            System.out.println("Enter elements:");
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }

            double avg = (double) sum / n;

            int count = 0;

            for(int i = 0; i < n; i++) {
                if(arr[i] > avg)
                    count++;
            }

            System.out.println("Average = " + avg);
            System.out.println("Count = " + count);
        }
    }

