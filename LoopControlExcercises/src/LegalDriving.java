import java.util.Scanner;

public class LegalDriving
{
    public static void main(String[] args)
    {
        System.out.println("Enter travelled distance (a positive value): ");
        double distance = 0;
        double time = 0.5;

        try
        {
            Scanner input = new Scanner(System.in);
            distance = input.nextInt();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        while(true)
        {
            if(distance <= 0)
            {
                System.out.println("Enter correct value: ");
                Scanner input = new Scanner(System.in);
                distance = input.nextInt();
            }
            else
            {
                break;
            }
        }

        double speed = distance/time;

        if(speed <= 70)
        {
            System.out.println("Driver's speed was " + speed + " and was legal");
        }
        else
        {
            System.out.println("Driver's speed was " + speed + " and they were speeding");
        }
    }
}
