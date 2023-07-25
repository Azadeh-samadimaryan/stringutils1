package com.strings;

import java.sql.SQLOutput;
import java.util.Locale;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String exercise1 = "Java";
        int exercise1Length = exercise1.length();
        System.out.println("Java string length = "+exercise1Length);

        String exercise2 = "Long example sentence";
        System.out.println("Long example sentence - charAt(6)="+exercise2.charAt(6));

        String exercise3 = "Even Longer Example Sentence";
        System.out.println("Even Longer Example Sentence - indexOf(O)="+exercise3.indexOf('o'));

        String exercise4 = "ok this is not as long!";
        System.out.println("ok this is not as long! - substring(11,22)="+exercise4.substring(11,22));

        String exercise5 = "CAPS EQUALS SCREAMING";
        String exercise6 = exercise5.toLowerCase();
        System.out.println(exercise6);

        String exercise7 = exercise6.toUpperCase();
        System.out.println(exercise7);



    }
}
