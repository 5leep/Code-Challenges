import java.util.Scanner;
import java.util.Random;

public class rocketLeague
{
    public static void main ( String[] args )
    {
        Scanner scan = new Scanner ( System.in );
        int action;
        Random r = new Random();
        int low = 1;
        int high = 3;
        int result = r.nextInt(high-low) + low;

        System.out.println ( "\n\n\n\n<EV> \"Game on! ;)\" \n" );
        System.out.println ( "\n<Game> Enter \"1\" to play \n" );
        System.out.println ( "\n<Game> Enter \"2\" to quit  \n" );

        action = scan.nextInt();
        
        if ( action == 1 )
        {
            System.out.println ( "\n<Game> \"You kick the ball...\" \n" );
        }
        else if ( action == 2 )
        {
            System.out.println ( "\n<Game> \"Guess we're not playing then :(\" \n" );
        }
    }
}