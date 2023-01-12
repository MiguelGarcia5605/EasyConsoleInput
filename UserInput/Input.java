package UserInput;

import java.util.Scanner;
import java.lang.String;

public class Input
{
    
    public static Scanner mScanner = new Scanner(System.in);
    
    public static String get_string(String text)
    {
        String response;
        try
        {
            System.out.println(text);
            response = mScanner.nextLine();
            return response;
        }
        catch(Exception e)
        {
            System.out.println("Error: no string found; function returned null");
        }
        return "null";
    }
    
    public static boolean get_bool(String text)
    {
        boolean bool;
        try
        {
            System.out.println(text);
            bool = mScanner.nextBoolean();
            return bool;
        }
        catch(Exception e)
        {
            System.out.println("Error: no boolean found; function returned false");
        }
        return false;
    }
    
    public static long get_long(String text)
    {
        long number;
        try
        {
            System.out.println(text);
            number = mScanner.nextLong();
            return number;
        }
        catch(Exception e)
        {
            System.out.println("Error: no long found; function returned 0");
        }
        return 0;
    }
    
    public static float get_float(String text)
    {
        float number;
        try
        {
            System.out.println(text);
            number = mScanner.nextFloat();
            return number;
        }
        catch(Exception e)
        {
            System.out.println("Error: no float found; function returned 0.0");
        }
        return 0.0f;
    }
    
    public static double get_double(String text)
    {
        double number;
        try
        {
            System.out.println(text);
            number = mScanner.nextDouble();
            return number;
        }
        catch(Exception e)
        {
            System.out.println("Error: no double found; function returned 0.0");
        }
        return 0.0;
    }
    
    public static int get_int(String text)
    {
        int number;
        try
        {
            System.out.println(text);
            number = mScanner.nextInt();
            return number;
        }
        catch(Exception e)
        {
            System.out.println("Error: no int found; function returned 0");
        }
        return 0;
    }
}
