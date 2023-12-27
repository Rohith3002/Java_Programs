package Programs;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), rev = 0, remainder;

        // store the number to originalNum
        int originalNum = a;
        // get the reverse of originalNum
        // store it in variable
        while (a != 0) {
            remainder = a % 10;
            rev = rev * 10 + remainder;
            a /= 10;
        }

        // check if reversedNum and originalNum are equal
        if (originalNum == rev) {
            System.out.println(originalNum + " is Palindrome.");
        } else {
            System.out.println(originalNum + " is not Palindrome.");

        }

    }
}
