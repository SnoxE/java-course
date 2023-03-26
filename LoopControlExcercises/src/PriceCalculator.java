import java.util.Scanner;

public class PriceCalculator
{
    public static void main(String[] args)
    {
        System.out.println("Enter  price (a positive value): ");
        double price = 0;

        try
        {
            Scanner input = new Scanner(System.in);
            price = input.nextInt();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        while(true)
        {
            if(price <= 0)
            {
                System.out.println("Enter correct value: ");
                Scanner input = new Scanner(System.in);
                price = input.nextInt();
            }
            else
            {
                break;
            }
        }

        if(price <= 100)
        {
            price *= 0.95;
            System.out.println("Price after 5% discount: " + price);
        }
        else if (price <= 200)
        {
            price *= 0.9;
            System.out.println("Price after 10%  discount: " + price);
        }
        else
        {
            price *= 0.85;
            System.out.println("Price after 15% discount: " + price);
        }
    }
}
