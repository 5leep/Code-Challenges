import java.util.Scanner;                                                                                   // Imports Scanner utilization
public class creditHide {
    public static void main( String[] args )
    {
        String cCNumber;                                                                                    // Defines the cc number as an integer
        Scanner scanner = new Scanner( System.in );                                                         // Defines Scanner for the users' input
        System.out.print ( "CREDIT CARD: " );                                                               // Prints a prompt for the users' cCNumber    
        cCNumber = scanner.next();                                                                          // Assigns cCNumber to read the scanner/input

        if(cCNumber.length() > 16 ) {
            System.out.println("ERROR 001, INVALID: TOO MANY VALUES, Please insert 16 values.");            // Error for too many values
        }
        else if(cCNumber.length() < 16 ) {
            System.out.println ("ERROR 002, INVALID: NOT ENOUGH VALUES, Please insert 16 values.");         // Error for too few values
        }
        else if ( cCNumber.length() == 16 ) {
            String cCNumber2 = cCNumber.replace( cCNumber, "************" + cCNumber.substring ( 12 ) );    // Replaces cCNumber to 12 *s and adds the last 4 characters
            System.out.println ( cCNumber2 );                                                               // Prints the result
        }
        else if (cCNumber.matches( "[0-9]{3,}" ) ) {
            System.out.println( "ERROR 003, INVALID: Only numbers are allowed in this field." );
        }
        else {
            System.out.println( "ERROR 004, INVALID: INVALID VALUES, Please insert 16 values." );           // Error for anything else
        }
    }
}