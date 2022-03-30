package se.lexicon.dreas94;

public class Exercises
{
    private String str = "";

    public void exercise1()
    {
        str = "Java";
        System.out.println("1. What is the length of the String: '" + str + "' ?");
        System.out.println("Answer: " + str.length() + "\n");
    }

    public void exercise2()
    {
        str = "Long example sentence";
        System.out.println("2. What char is at index position 6 in the following String: '" + str + "' ?");
        System.out.println("Answer: " + str.charAt(6) + "\n");
    }

    public void exercise3()
    {
        str = "Even longer example sentence";
        System.out.println("3. What is the index position of 'o' in the following String: '" + str + "' ?");
        System.out.println("Answer: " + str.indexOf("o") + "\n");
    }
}
