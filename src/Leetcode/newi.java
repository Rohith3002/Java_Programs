package Leetcode;

public class newi {


        public static void main(String[] args)
        {
            Thread t1 = new Thread();
            Thread t2 = new Thread();
            Thread t3 = t1;

            String s1 = new String("GEEKS");
            String s2 = new String("GEEKS");
            String s3="Hello";
            String s4="Hello";
            System.out.println(s3 == s4);
            System.out.println(t1 == t3);
            System.out.println(t1 == t2);
            System.out.println(s1 == s2);

            System.out.println(t1.equals(t2));
            System.out.println(s1.equals(s2));
            System.out.println(t3);
        }
    }

