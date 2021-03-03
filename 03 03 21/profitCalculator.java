import java.util.Scanner;

public class profitCalculator
{
    public static void main ( String[] args )
    {
        Scanner scan = new Scanner ( System.in );
        Double saleValue, productValue, profitValue;

        System.out.println ( "\n\n\n\n<EV> \"Hello, Sir. Please provide me the value of the sale. ;)\" \n\n" );

        saleValue = scan.nextDouble();
        
        System.out.println ( "\n<EV> \"So " + saleValue + " is the sale value? What was the cost of the product to buy in?\" \n\n");

        productValue = scan.nextDouble();
        profitValue = saleValue - productValue;

        if ( profitValue < 0 )
        {
            String.format("%.2f", saleValue );
            System.out.println ( "\n<EV> \"So we lost money?! D:\" \n\n");
        }
        else if ( profitValue > 0 )
        {
            String.format("%.2f", saleValue );
            System.out.println ( "\n<EV> \"Amazing! Our total profit was" + profitValue + "\" \n\n");
        }
        else if ( profitValue == 0 )
        {
            String.format("%.2f", saleValue );
            System.out.println ( "\n<EV> \"Amazing! Our total profit was...\"\n<EV> \"Um...\" \n<EV>\"Nothing!\" \n\n");
        }
        else
        {
            System.out.println ( "\n<EV> \"I've no idea what's happened...\" \n\n");
        }
    }
}