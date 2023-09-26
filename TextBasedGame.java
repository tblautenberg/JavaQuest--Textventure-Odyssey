import playerClasses.Hunter;
import java.util.*;
public class TextBasedGame
{
    public static void main(String[] args)
    {
        Scanner scannerObj = new Scanner(System.in);

        // Create player class
        
        Hunter player = new Hunter(100, 100, 10, 10, 10, 10, 10);

        // Class array

        String[] classes = {"Warrior", "Paladin", "Mage", "Hunter"};

        System.out.println("Welcome to the 'KINGS ROAD' game!");
        System.out.println("For new game press: 1");
        System.out.println("To see the rulings press: 2");

        while(true)
        {
            try
            {
                int welcomePrompt = Integer.parseInt(scannerObj.nextLine());

                if(welcomePrompt == 1)
                {
                    System.out.print("Greetings wandere! Please give us your name: ");
                    String C_name = scannerObj.nextLine();
                    System.out.print("Please enter your age: ");
                    int C_age = Integer.parseInt(scannerObj.nextLine());
                    System.out.println("Please select your class (0 = Warrior, 1 = Paladin, 2 = Mage, 3 = Hunter");
                    int C_class = Integer.parseInt(scannerObj.nextLine());
                    System.out.println("Okay " + C_name + " the " + classes[C_class] + ", so this is the story about you....");
                    System.out.println("After weeks of gathering materiels in the mountians, you ara headed down the Kings Road, to trade your goods for coin at the market");
                    player.currentPlayerStats();
                    player.aimedShot();
                    player.currentPlayerStats();
                    player.arcaneShot();
                    player.currentPlayerStats();
                    player.manaPotion();
                    player.healthPotion();
                }
                else if(welcomePrompt == 2)
                {
                    System.out.println("Here are the official ruleings");
                    System.out.println("Print ruling 1");
                    System.out.println("Print ruling 2");
                    System.out.println("Print ruling 3");
                    System.out.println("Print ruling 4");
                    System.out.println("Print ruling 5");
                    System.out.println("***************");
                    System.out.println("Press 1 to start the game, or 3 to close the game");
                }
                else if(welcomePrompt == 3)
                {
                    System.out.println("You have chosen to go back to the start menu.");
                    break;
                }
                else
                {
                    System.out.println("You must select a valid input (1/2/3)!");
                }
            }

            catch(NumberFormatException e)
            {
                System.out.println("You must select a valid option (1/2/3)!");
            }

            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("You must select a valid option (1/2/3)!");
            }
        }
    }
}