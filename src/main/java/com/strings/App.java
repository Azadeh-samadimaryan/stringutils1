package com.strings;

import java.sql.SQLOutput;
import java.util.Locale;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        String exercise1 = "Java";
        int exercise1Length = exercise1.length();
        System.out.println("Java string length = " + exercise1Length);

        String exercise2 = "Long example sentence";
        System.out.println("Long example sentence - charAt(6)=" + exercise2.charAt(6));

        String exercise3 = "Even Longer Example Sentence";
        System.out.println("Even Longer Example Sentence - indexOf(O)=" + exercise3.indexOf('o'));

        String exercise4 = "ok this is not as long!";
        System.out.println("ok this is not as long! - substring(11,22)=" + exercise4.substring(11, 22));

        String exercise5 = "CAPS EQUALS SCREAMING";
        String exercise5ToLowerCase = exercise5.toLowerCase();
        System.out.println(exercise5ToLowerCase);

        String exercise5ToUpperCase = exercise5ToLowerCase.toUpperCase();
        System.out.println(exercise5ToUpperCase);

        String exercise7 = "Java is the worst programming language!";
        System.out.println(exercise7.replace("worst", "best"));

        String exercise8 = "\tJ\ta\tv\ta\t";
        System.out.println(exercise8.trim());

        //String checkTrim = " --Java-- ";
        //System.out.println(checkTrim.trim());

        String exercise9 = "20";
        System.out.println(exercise9+"20");

        String exercise10 = "oil and water";
        String oil = exercise10.substring(0,3);
        String water =exercise10.substring(8);
        String[] array = {oil,water};
        System.out.println(array[0] + " and " + array[1]);

        String exercise11 = "Carl,Susie,Fredrick,Bob,Erik";
        String[] arrayExercise11 = exercise11.split(",");
        System.out.println(arrayExercise11[0] + "  " + arrayExercise11[1] + "  " +
        arrayExercise11[2] + "  " + arrayExercise11[3] + "  " + arrayExercise11[4] );

        for (int i=0; i<arrayExercise11.length; i++){
            System.out.print(arrayExercise11[i] + "  ");
        }

        System.out.println();

        String exercise12 = "ThisShouldBeConverted";
        char[] exercise12ToArr = exercise12.toCharArray();

        for (int i=0; i<exercise12ToArr.length; i++){
            System.out.print(exercise12ToArr[i] );
        }

        System.out.println();

        char[] exercise13 = {'J','a','v','a'};
        String exercise13Str = "";
        for (int i=0; i<exercise13.length; i++){
            exercise13Str+=exercise13[i];
        }
        System.out.println(exercise13Str);

    }
}

