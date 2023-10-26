//********************************************************************
//  CheckStrings.java       Java Foundations
//
//********************************************************************

import java.util.Scanner;

public class CheckStrings
{
    //-----------------------------------------------------------------
    //  Creates an exception object and throws it when appropriate.
    //-----------------------------------------------------------------
    public static void main(String[] args) throws StringTooLongException
    {
        final int MAX = 20;
        String input = "NOT DONE";

        Scanner scan = new Scanner(System.in);

        StringTooLongException lengthException =
            new StringTooLongException("String has too many characters");

        System.out.println("Enter strings, enter DONE when finished:");

        while (!input.equals("DONE"))
        {
            input = scan.nextLine();

            if (!input.equals("DONE"))
                if (input.length() > MAX) {
                    throw lengthException;
                }
                else {
                    System.out.println("You entered: " + input);
                }
        }

        System.out.println("Program successfully completed");
    }
}
