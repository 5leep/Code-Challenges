import java.util.Scanner;

public class order
{
    public static void main ( String[] args )
    {
        Scanner scan = new Scanner ( System.in );  // Create a Scanner object
        boolean isInOrder;
        
        System.out.println ( "\n\n\n\n\n" + "<EV> \"Hello sir, please enter a string value for me ;)\" " + "\n" );

        String stringInput = scan.nextLine();
        System.out.println ( "\n" + "<EV> \"You entered: " + stringInput + "\"");

        for ( int alpha = 0; alpha != stringInput.length(); ++alpha )
        {
            if ( !Character.isLetter(stringInput.charAt(alpha)))
            {
                isInOrder = false;
            }
            else
            {
                isInOrder = true;
            }
        }

        System.out.println( "<EV> \"It seems that the string you provided is...\"" + "\n" );

        if ( isInOrder = false )
        {
            System.out.println( "<EV> \"NOT alphabetical!\"");
        }
        else if ( isInOrder = true )
        {
            System.out.println( "<EV> \"Alphabetical!\"" + "\n");
        }

        System.out.println( "~~~~~~~~~~~~~~~~~~~~~~");
    }
}