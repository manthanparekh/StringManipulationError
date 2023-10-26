//********************************************************************
//  StringTooLongException.java       Java Foundations
//
//  Solution to Programming Projects 10.2 and 12.3 
//********************************************************************

public class StringTooLongException extends Exception
{
    //-----------------------------------------------------------------
    //  Sets up the exception object with a particular message.
    //-----------------------------------------------------------------
    public StringTooLongException(String message)
    {
        super(message);
    }
}
