import java.util.Scanner;

public class profitCalculator
{
    public static void main ( String[] args )
    {
        Scanner scan = new Scanner ( System.in );  // Create a Scanner object
        Double saleValue, productValue, profitValue;

        System.out.println ( "\n\n\n<EV> \"Hello, Sir. Please provide me the value of the sale. ;)\" \n\n\n" );
        saleValue = scan.nextDouble();
        System.out.println ( "\n\n<EV> \"So " + saleValue + " is the sale value? What was the cost of the product to buy in?\" \n\n\n");
        productValue = scan.nextDouble();
        saleValue -- productValue = profitValue;
        if ( profitValue >= 0 )
        {
            System.out.println ( "\n\n<EV> \"So we lost money?! D:\"");
        }
        else ( profitValue > 0 )
        {

            System.out.println ( "\n\n<EV> \"Amazing! Our total profit was\"");
        }
    }
}