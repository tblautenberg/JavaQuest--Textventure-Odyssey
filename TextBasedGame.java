import playerClasses.Dragon;
import playerClasses.Hunter;
import java.util.*;
public class TextBasedGame
{

        public static final String ANSI_RESET = "\u001B[0m";
        public static final String ANSI_BLACK = "\u001B[30m";
        public static final String ANSI_RED = "\u001B[31m";
        public static final String ANSI_GREEN = "\u001B[32m";
        public static final String ANSI_YELLOW = "\u001B[33m";
        public static final String ANSI_BLUE = "\u001B[34m";
        public static final String ANSI_PURPLE = "\u001B[35m";
        public static final String ANSI_CYAN = "\u001B[36m";
        public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args)
    {
        Scanner scannerObj = new Scanner(System.in);    

        System.out.println(ANSI_YELLOW + "                                                         _____------------___\n" + //
                "                                                    ._--':::::'-------____\n" + //
                "                .___------__       /-.._.    _---_ '|:::::::::::::::::::::---\n" + //
                "           ._--'.---::::::/ `      \\ .-. '-'' *__*|/:::::::::::::::::::::::::\n" + //
                "      .__-'  _-'::::::::/ ._------_| '_'  __--' _'/::::::::::::::::::::::::::\n" + //
                "  _--'    _-'::::::::::|.'  ._----_\\    -'  ._-':::::::::::::::::::::::::::::\n" + //
                "       _-':::::::::::::\\  .'       /  .__--' -':::::::::_--_:::::::::::.-----\n" + //
                "   _-'::::::::::::::::::-_|       /    /   /::::::::::/      \\:::::::/\n" + //
                "  '::::::::::::::::::::::::----__-   .   .  |.--_:::/          \\:::/\n" + //
                ".----_::::::::::::::::::::/                \\  \\\\ \\/             \\/\n" + //
                "._.-_'-_:::.----.:::.:. . .    .         . |  \\\\\n" + //
                ".--..--..--..--..--..--..--..--..--..--..--..--..--..--..--..--..--..--..--..--..--..--..--..--..--..--..--. \n" + //
                "/ .. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\\n" + //
                "\\ \\/\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ \\/ /\n" + //
                "\\/ /`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'\\/ / \n" + //
                "/ /\\      ___                    _____                 _                                                / /\\ \n" + //
                "/ /\\ \\    |_  |                  |  _  |               | |  _                                           / /\\ \\\n" + //
                "\\ \\/ /      | | __ ___   ____ _  | | | |_   _  ___  ___| |_(_)                                          \\ \\/ /\n" + //
                "\\/ /       | |/ _` \\ \\ / / _` | | | | | | | |/ _ \\/ __| __|                                             \\/ / \n" + //
                "/ /\\   /\\__/ / (_| |\\ V / (_| | \\ \\/' / |_| |  __/\\__ \\ |_ _                                            / /\\ \n" + //
                "/ /\\ \\  \\____/ \\__,_| \\_/ \\__,_|  \\_/\\_\\\\__,_|\\___||___/\\__(_)                                          / /\\ \\\n" + //
                "\\ \\/ /                                                                                                  \\ \\/ /\n" + //
                "\\/ /                                                                                                    \\/ / \n" + //
                "/ /\\    _____         _                   _                    _____     _                              / /\\ \n" + //
                "/ /\\ \\  |_   _|       | |                 | |                  |  _  |   | |                            / /\\ \\\n" + //
                "\\ \\/ /    | | _____  _| |___   _____ _ __ | |_ _   _ _ __ ___  | | | | __| |_   _ ___ ___  ___ _   _    \\ \\/ /\n" + //
                "\\/ /     | |/ _ \\ \\/ / __\\ \\ / / _ \\ '_ \\| __| | | | '__/ _ \\ | | | |/ _` | | | / __/ __|/ _ \\ | | |    \\/ / \n" + //
                "/ /\\     | |  __/>  <| |_ \\ V /  __/ | | | |_| |_| | | |  __/ \\ \\_/ / (_| | |_| \\__ \\__ \\  __/ |_| |    / /\\ \n" + //
                "/ /\\ \\    \\_/\\___/_/\\_\\\\__| \\_/ \\___|_| |_|\\__|\\__,_|_|  \\___|  \\___/ \\__,_|\\__, |___/___/\\___|\\__, |   / /\\ \\\n" + //
                "\\ \\/ /                                                                       __/ |              __/ |   \\ \\/ /\n" + //
                "\\/ /                                                                       |___/              |___/     \\/ / \n" + //
                "/ /\\.--..--..--..--..--..--..--..--..--..--..--..--..--..--..--..--..--..--..--..--..--..--..--..--..--./ /\\ \n" + //
                "/ /\\ \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\/\\ \\\n" + //
                "\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `' /\n" + //
                "`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'"+ ANSI_RESET);

        System.out.println("Welcome to the: JavaQuest: Textventure Odyssey!");
        System.out.println("For new game press: 1");
        System.out.println("To see the credits of the awesome creators press: 2");

        while(true)
        {
            try
            {

                int welcomePrompt = Integer.parseInt(scannerObj.nextLine());

                if(welcomePrompt == 1)
                {
                    System.out.println(ANSI_YELLOW + "\n*******************************************\n*****************Chapter 1*****************\n*******************************************\n" + ANSI_RESET);
                    
                    DialogPrinter.printDialog("With your belongings packed and food prepared, you step out onto a great journey.\n");
                    DialogPrinter.printDialog("Before long you cross paths with an old man with a cane.\n");
                    System.out.println("********************************************\n");

                    DialogPrinter.printDialog("Greetings wanderer! May you be the the one I've been looking for?\n");
                    DialogPrinter.printDialog("... Please! What is your name, wanderer?\n\n");
                    System.out.print("- Please enter your name: ");
                    String p_Name = scannerObj.nextLine();

                    DialogPrinter.printDialog("\n" + p_Name + "... That is the name the oracle has spoken of. Thus you must be the chosen one. What an honour to stand in your presence!\n");
                    DialogPrinter.printDialog("I see you have a bow. May I assume you are a hunter?\n");
                    System.out.println();
                    System.out.print("- Please insert either Y or N: ");
                    

                    String playerPrompt1 = null;
                    while (playerPrompt1 != "Y")
                    {
                        playerPrompt1 = scannerObj.nextLine();
                        
                        if(playerPrompt1.equals("Y"))
                        {
                            System.out.println();
                            DialogPrinter.printDialog("Oh, wonderful!\n");
                            break;
                        }
                        else if(playerPrompt1.equals("N"))
                        {
                            System.out.println();
                            DialogPrinter.printDialog("Oh... This is embarrassing. I could've sworn the oracle spoke of a hunter!... Are you one? -(Y/N)-\n");
                        }
                        else
                        {
                            System.out.println("- Invalid input - please select either, Y or N -\n");
                        }
                    }

                    DialogPrinter.printDialog("So, the quest...");
                    DialogPrinter.printDialog(" Oh pardon me, I have not yet introduced myself.\n");
                    DialogPrinter.printDialog("My name is Alfred. I am but a simple villager, but I have been given the task of guiding you on your journey.\n");
                    
                    DialogPrinter.printDialog("May I ask, do you know of the quest ahead?\n");
                    System.out.println();
                    System.out.print("- Please insert either Y or N: ");
                    playerPrompt1 = null;
                    while (playerPrompt1 != "Y" && playerPrompt1 != "N")
                    {   
                        playerPrompt1 = scannerObj.nextLine();
                        
                        if(playerPrompt1.equals("Y"))
                        {
                            System.out.println();
                            DialogPrinter.printDialog("Ah. I that case, I shall bother you no longer.\n");
                            break;
                        }
                        else if(playerPrompt1.equals("N"))
                        {
                            System.out.println();
                            DialogPrinter.printDialog("Blimey! I suppose I must inform you.\n");
                            DialogPrinter.printDialog("Six months ago in a nearby castle, a dragon settled.\n");
                            DialogPrinter.printDialog("It terrorised its surroundings and burnt the surrounding village to the ground!\n");
                            DialogPrinter.printDialog("... My village...\n");
                            DialogPrinter.printDialog("There is no saying where it will strike next, and I fear the entire kingdom is in danger.\n");
                            DialogPrinter.printDialog("I went to the great oracle, begging for a sign of hope.\n");
                            DialogPrinter.printDialog("And it lead me to you... You must go, " + p_Name + ".\n");
                            break;
                        }
                        else
                        {
                            System.out.println("- Invalid input - please select either, Y or N -\n");
                        }
                    }
                    DialogPrinter.printDialog("The quest lies ahead!\n");
                    System.out.println("********************************************\n");
                    DialogPrinter.printDialog("You follow Alfred continue down the path...\n");

                    while(true)
                    {
                    System.out.println(ANSI_YELLOW + "\n*******************************************\n*****************Chapter 2*****************\n*******************************************\n" + ANSI_RESET);

                    DialogPrinter.printDialog("You and Alfred exit the village.\n");
                    DialogPrinter.printDialog("All of the sudden you hear screams in the distance.\n");
                    DialogPrinter.printDialog("You run towards the sounds and find a nearby village covered in fire!\n");
                    DialogPrinter.printDialog("A large reptilian head rises above the chaos.\n");
                    DialogPrinter.printDialog("A desire to kill in its eyes as it unleashes a breath of fire around it.\n");
                    DialogPrinter.printDialog("The time for justice is here! You step forward with all of your courage on your side...\n");



 {
        Scanner input = new Scanner(System.in);
        Hunter Player = new Hunter(100, 100);
        Dragon Dragon = new Dragon(50);

        int healthPotionAmount = 3;
        int manaPotionAmount = 3;

        while (Player.currentHP > 0 && Dragon.currentHP > 0) 
        {
            System.out.println();
            System.out.println(ANSI_GREEN + "Player's Turn:" + ANSI_RESET);
            System.out.println("1. Basic Attack");
            System.out.println("2. Hunter's Mark");
            System.out.println("3. Aimed Shot");
            System.out.println("4. Arcane Shot");
            System.out.println("5. Drink mana potion. Currently you have " + manaPotionAmount + " left");
            System.out.println("6. Drink health potion. Currently you have " + healthPotionAmount + " left");
            System.out.print("Choose an action (1-6): ");



            int playerChoice = input.nextInt();
            input.nextLine(); // Consume the newline character

            switch (playerChoice)
            {
                case 1:
                    // Perform basic attack
                    System.out.println();
                    System.out.println(p_Name + " shoots!");
                    int playerDamage = Player.basicAttack();
                    Dragon.currentHP -= playerDamage;
                    break;
                case 2:
                    // Cast Hunter's Mark
                    System.out.println();
                    Player.huntersMark();
                    break;
                case 3:
                    // Perform Aimed Shot
                    if (Player.currentMana >= 15) 
                    {
                        System.out.println();
                        DialogPrinter.printDialog( p_Name + " performs Aimed Shot!\n");
                        int aimedShotDamage = Player.aimedShot();
                        Dragon.currentHP -= aimedShotDamage;
                    } else 
                    {
                        DialogPrinter.printDialog("Not enough mana for Aimed Shot.");
                    }
                    break;
                case 4:
                    // Perform Arcane Shot
                    if (Player.currentMana >= 10) 
                    {
                        System.out.println();
                        DialogPrinter.printDialog(p_Name + " casts Arcane Shot!\n");
                        int arcaneShotDamage = Player.arcaneShot();
                        Dragon.currentHP -= arcaneShotDamage;
                    } else 
                    {
                        DialogPrinter.printDialog("Not enough mana for Arcane Shot.");
                    }
                    break;

                    case 5:
                    if(manaPotionAmount > 0)
                    {
                    System.out.println();
                    Player.manaPotion();
                    manaPotionAmount --;   
                    }
                    else
                    System.out.println();
                    System.out.println("You have used all your mnana potions.");
                    break;

                    case 6:
                    if(healthPotionAmount > 0)
                    {
                    System.out.println();
                    Player.healthPotion();
                    healthPotionAmount --;   
                    }
                    else
                    System.out.println();
                    System.out.println("You have used all your mnana potions.");
                    break;

                default:
                DialogPrinter.printDialog("Invalid choice. Try again.");
                    break;
            }

            // Check if the Dragon is defeated
            if (Dragon.currentHP <= 0) 
            {
                System.out.println();
                DialogPrinter.printDialog("Dragon defeated! You win!");
                System.out.println();
                break;
            }

            // Dragon's turn


            while(Dragon.currentHP > 0)
            {
                Random dragonAbilityRand = new Random();
                int dragonAbilityUpperBound = 20;
                int dragonAbility = dragonAbilityRand.nextInt(dragonAbilityUpperBound);

                if((dragonAbility >= 0 && dragonAbility <= 10))
                {   
                          System.out.println();
                          DialogPrinter.printDialog(ANSI_PURPLE + "\nEnemy's Turn:" + ANSI_RESET);
                          System.out.println();
                          System.out.println("The enemy rolls: " + dragonAbility + " and casts 'Claw'");
                          int enemyDamage = Dragon.Claw();
                          Player.currentHP -= enemyDamage;
                          break;
                }
                else if((dragonAbility >= 11 && dragonAbility <= 15))
                {
                          System.out.println();
                          DialogPrinter.printDialog(ANSI_PURPLE + "\nEnemy's Turn:" + ANSI_RESET);
                          System.out.println();
                          System.out.println("The enemy rolls: " + dragonAbility + " and casts 'Fury Strikes' (7-15 DMG)");
                          int enemyDamage = Dragon.furyStrikes();
                          Player.currentHP -= enemyDamage;
                          break;  
                }
                else if((dragonAbility >= 16 && dragonAbility <= 20))
                {
                          System.out.println();
                          DialogPrinter.printDialog(ANSI_PURPLE + "\nEnemy's Turn:" + ANSI_RESET);
                          System.out.println();
                          System.out.println("The enemy rolls: " + dragonAbility + " and casts 'Dragon's Breath' (20-25 DMG)");
                          int enemyDamage = Dragon.flameBreath();
                          Player.currentHP -= enemyDamage;
                          break;
                }

            }

            // Display player and enemy HP
            System.out.println();
            System.out.print("********************************************");
            DialogPrinter.printDialog(ANSI_RED + "\n" + p_Name + "'s HP: " + Player.currentHP + ANSI_RESET);
            DialogPrinter.printDialog(ANSI_BLUE +"\n" + p_Name + "'s mana: " + Player.currentMana + ANSI_RESET);
            System.out.println();
            System.out.println();
            DialogPrinter.printDialog(ANSI_RED + "Dragon's HP: " + Dragon.currentHP + ANSI_RESET);
            System.out.println();

            // Check if the player is defeated
            if (Player.currentHP <= 0) 
            {
                DialogPrinter.printDialog("Player defeated! Dragon wins!");
                break;
            }

            System.out.println("********************************************");

            try {
                Thread.sleep(1000); // Pauser scriptet i 1 sekund så det hele ikke er instant
            } catch (InterruptedException e) {

            }

        }

        if (Dragon.currentHP <= 0)
        {
            DialogPrinter.printDialog("\nThe creature's scream of pain fades, as the giant figure collapses over the burnt ruins of its last victim.\n");
            DialogPrinter.printDialog("You and Alfred stand before it, staring at the scene, trying to complehend what you just managed.\n");
            DialogPrinter.printDialog("Scared villagers crawl out from various hiding spots.\n");
            DialogPrinter.printDialog("Several of them approach you, thanking you for your duty with great relief in their voices.\n\n");
            DialogPrinter.printDialog("You have won!");
            break;
        }
        else
        {
            DialogPrinter.printDialog("\nAs your injuries get too bad for you to fight, the roaring flames consume you.\n");
            DialogPrinter.printDialog("You hear a strange voice.\n");
            DialogPrinter.printDialog("This does not have to be the end. Do you wish to try again?\n");
            

            System.out.println("- Y or N ");
            playerPrompt1 = scannerObj.nextLine();

            if(playerPrompt1.equals("Y"))
            {
                DialogPrinter.printDialog("The kingdom depends on you, " + p_Name + ".\n You must not give up!\n");
            }
            else if(playerPrompt1.equals("N"))
            {
                DialogPrinter.printDialog("Goodbye, " + p_Name + "...\n");
                break;
            }
            else
            {
                System.out.println("- Invalid input - please select either, Y or N -\n");
            }
         }
      }
    }
}
                else if(welcomePrompt == 2)
                {
                    System.out.println("Here are the creds!");
                    System.out.println("Made by - Tobias, Sarah, Frey, Rasmus and Alexander");
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