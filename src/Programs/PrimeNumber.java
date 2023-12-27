package Programs;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int flag = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                flag++;
            }
        }
        if (flag ==2) {
            System.out.println(a + " is a prime number");
        } else {
            System.out.println(a + " is not a prime number");
        }
    }
}

