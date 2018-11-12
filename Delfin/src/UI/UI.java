package UI;

import java.util.Scanner;

/**
 *
 * @author runin
 */
public class UI
{

    private static Scanner scanner = new Scanner(System.in);

    

    public static void print(String s)
    {
        System.out.print("   " + s);
    }

    public static void println(String s)
    {
        System.out.println("   " + s);
    }

    public static String getString()
    {
        return scanner.nextLine();
    }

    public static int getInteger()
    {
        while (true)
        {
            String sNum = getString();
            try
            {
                return Integer.parseInt(sNum);
            } catch (NumberFormatException e)
            {
                print("Please enter an integer! \n ");
            }
        }
    }

    public static int getInteger(int min, int max)
    {
        if (max < min)
        {
            throw new IllegalArgumentException();
        }
        while (true)
        {
            int i = getInteger();
            if (i >= min && i <= max)
            {
                return i;
            }
            print("Please enter a number between " + min
                    + " and " + max + " (both inclusive): \n");
        }
    }

    public static int choice(String[] choices)
    {
        if (choices == null || choices.length == 0)
        {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < choices.length; ++i)
        {
            println("    " + (i + 1) + ": " + choices[i]);
        }
        // println("\nPlease choose: ");
        return getInteger(1, choices.length);
    }

    
}
