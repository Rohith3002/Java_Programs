package Programs;

import java.util.Scanner;

public class MaxMinNoOfArray {
    public static void main(String[] args) {
        System.out.println("Enter the array size");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] b = new int[a];
        for (int i = 0; i < a; i++) {
            b[i] = sc.nextInt();
        }
        System.out.println("Enter max or min");
        String n = sc.next();
        switch (n) {
            case "Max":
                int max = b[0];
                for (int i = 0; i < b.length; i++) {
                    if (b[i] > max) {
                        max = b[i];
                    }
                }
                System.out.println(max);
                break;
            case "Min":
                int min = b[0];
                for (int i = 0; i < b.length; i++) {
                    if (b[i] < min) {
                        min = b[i];
                    }
                }
                System.out.println(min);
                break;
        }

    }
}



