package Programs;

import java.util.Scanner;

public class VowelsandConsonants {

    public static void main(String[] args) {
        int vCount = 0, cCount = 0;
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        a = a.toLowerCase();
        for (int i = 0; i < a.length(); i++) {
            char ch= a.charAt(i);
            if (a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o' || a.charAt(i) == 'u') {
                vCount++;
                System.out.print(ch+" ");
            } else if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z') {
                cCount++;
            }
        }
        System.out.println("");
        System.out.println("Number of vowels: " + vCount);
        System.out.println("Number of consonants: " + cCount);
    }
}
