package Programs;

import java.util.Scanner;

public class StringRevTemp {
    public static void main(String[] args) {
        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] b= a.toCharArray();
        int left=0;
        int right= b.length-1;
        while(left<right){
            char temp= b[left];
            b[left]=b[right];
            b[right]= temp;
            left++;
            right--;
        }
        String s= new String(b);
        System.out.println(s);
    }
}
