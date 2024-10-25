package ru.mirea.lab18;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        try
        {
            int i = Integer.parseInt(intString);
            System.out.println( 2/i );
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
//        catch (ArithmeticException e)
//        {
//            System.out.println( "Division by zero" );
//        }
//        catch (NumberFormatException e)
//        {
//            System.out.println( "Wrong format" );
//        }
    }

    public static void main(String[] args) {
        Exception2 exp = new Exception2();
        exp.exceptionDemo();
    }
}
