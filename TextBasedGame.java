import playerClasses.Hunter;
import java.util.*;
public class TextBasedGame
{
    public static void main(String[] args)
    {
        Scanner scannerObj = new Scanner(System.in);    


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
                    DialogPrinter.printDialog("Greetings wanderer! Please give us your name: ");
                    String p_Name = scannerObj.nextLine();
                    DialogPrinter.printDialog(p_Name + ", nice to meet you. You have a bow. May I assume you are a hunter? (Y/N) \n");
                    String playerPrompt1 = scannerObj.nextLine();

                    if(playerPrompt1.equals("Y"))
                    {
                        DialogPrinter.printDialog("Cool");
                    }
                    else if(playerPrompt1.equals("N"))
                    {
                        DialogPrinter.printDialog("Not cool man");
                    }
                    else
                    {
                        System.out.println("Invalid input - please select either, Y or N");
                    }

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