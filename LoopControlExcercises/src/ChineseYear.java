import java.util.Scanner;

public class ChineseYear {
    public static void main(String[] args)
    {
        System.out.println("Enter your year of birth (positive value between 0 and 10000): ");
        int year = 0;

        try
        {
            Scanner input = new Scanner(System.in);
            year = input.nextInt();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        while(true)
        {
            if(year <= 0 || year >= 10000)
            {
                System.out.println("Enter correct value: ");
                Scanner input = new Scanner(System.in);
                year = input.nextInt();
            }
            else
            {
                break;
            }
        }

        int remainder = year % 12;

        switch (remainder) {
            case 0 -> System.out.println(year + " - The year of the Monkey");
            case 1 -> System.out.println(year + " - The year of the Rooster");
            case 2 -> System.out.println(year + " - The year of the Dog");
            case 3 -> System.out.println(year + " - The year of the Pig");
            case 4 -> System.out.println(year + " - The year of the Rat");
            case 5 -> System.out.println(year + " - The year of the Ox");
            case 6 -> System.out.println(year + " - The year of the Tiger");
            case 7 -> System.out.println(year + " - The year of the Rabbit");
            case 8 -> System.out.println(year + " - The year of the Dragon");
            case 9 -> System.out.println(year + " - The year of the Snake");
            case 10 -> System.out.println(year + " - The year of the Horse");
            case 11 -> System.out.println(year + " - The year of the Goat");
        }


    }
}