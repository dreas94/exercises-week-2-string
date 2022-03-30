package se.lexicon.dreas94;

import java.util.Locale;

public class Exercises
{
    private String str = "";

    public void exercise1()
    {
        str = "Java";
        System.out.println("1. What is the length of the String: '" + str + "' ?");
        System.out.println(str.length() + "\n");
    }

    public void exercise2()
    {
        str = "Long example sentence";
        System.out.println("2. What char is at index position 6 in the following String: '" + str + "' ?");
        System.out.println(str.charAt(6) + "\n");
    }

    public void exercise3()
    {
        str = "Even longer example sentence";
        System.out.println("3. What is the index position of 'o' in the following String: '" + str + "' ?");
        System.out.println(str.indexOf("o") + "\n");
    }

    public void exercise4()
    {
        str = "Ok this is not as long!";
        System.out.println("4. Given the following String: '" + str + "' create a substring of only 'not as long' (excluding the exclamation point) and print it out.");
        String subStr = str.substring(11,22);
        System.out.println(subStr + "\n");
    }

    public void exercise5()
    {
        str = "CAPS EQUALS SCREAMING";
        System.out.println("5. Convert the following String: '" + str + "' to lowercase and print it out. Then convert it back to uppercase and print it out again");
        str = str.toLowerCase();
        System.out.println(str);
        str = str.toUpperCase();
        System.out.println(str + "\n");
    }

    public void exercise6()
    {
        str = "\tJ\ta\tv\ta\t";
        System.out.println("6. What is the output of the following String: '" + str + "' after you trim it?");
        str = str.trim();
        System.out.println(str);
    }
}
