package com.company;

import java.util.Locale;

public class Strings {
    public static void main(String[] args) {
        String a = new String("Ankit");
        String b = "Ankit";

        int value = b.length();
        System.out.println(value);

        String lowerString = b.toLowerCase();
        String upperString = b.toUpperCase();

        System.out.println(lowerString);
        System.out.println(upperString);

        String nonTrimmedString = "          Ankit          ";
        System.out.println(nonTrimmedString);
        System.out.println(nonTrimmedString.trim());

        System.out.println(b.substring(1));
        System.out.println(b.substring(3));

        System.out.println(b.substring(1,4));
        System.out.println(b.substring(1,5));

        System.out.println(b.replace('k', 'q'));
        System.out.println(b.replace("kit" , "noice"));

        System.out.println(b.startsWith("Ank"));
        System.out.println(b.startsWith("Hell"));

        System.out.println(b.endsWith("kit"));
        System.out.println(b.endsWith("out"));

        System.out.println(b.charAt(0));
        System.out.println(b.charAt(1));
        System.out.println(b.charAt(2));
        System.out.println(b.charAt(3));
        System.out.println(b.charAt(4));

        System.out.println(b.indexOf("kit"));
        System.out.println(b.indexOf("kit" , 3));

        System.out.println(b.equals("Ankit"));
        System.out.println(b.equals("John"));

        System.out.println(b.equalsIgnoreCase("ankit"));
        System.out.println(b.equalsIgnoreCase("ANKIT"));

        System.out.println("I am escaping \"double quote\"");
        System.out.println("I am now printing \\");
    }
}
