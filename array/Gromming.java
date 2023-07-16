package array;

import java.util.Scanner;

public class Gromming {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = sc.nextInt();
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
}
