package org.Study;

public class StringLiteral {
    public static void main(String[] args) {


        //String literal
        String s1 = "Java8";
        String s2 = "Java8";


        //String Object
        String s3 = new String("Java8");
        String s4 = new String("Java8");

     /*   System.out.printf(s1 == s2);
        System.out.printf(s1 == s3);
        System.out.printf(s3 == s4);*/
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s3 == s4);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4));


    }
}
