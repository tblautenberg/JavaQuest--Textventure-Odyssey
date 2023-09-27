import java.util.Random;
import java.util.Scanner;
import playerClasses.Enemy;
import playerClasses.Hunter;


public class BetaCombat {

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
        Scanner input = new Scanner(System.in);
        Hunter Player = new Hunter(100, 100, 0, 0, 0, 0, 0);
        Enemy Dragon = new Enemy();

        while (Player.currentHP > 0 && Dragon.currentHP > 0) {
            // Display menu for player actions
            System.out.println();
            System.out.println(ANSI_GREEN + "Player's Turn:" + ANSI_RESET);
            System.out.println("1. Basic Attack");
            System.out.println("2. Hunter's Mark");
            System.out.println("3. Aimed Shot");
            System.out.println("4. Arcane Shot");
            System.out.print("Choose an action (1-4): ");


            // Read player's choice
            int playerChoice = input.nextInt();
            input.nextLine(); // Consume the newline character

            switch (playerChoice) {
                case 1:
                    // Perform basic attack
                    System.out.println();
                    System.out.println("The player shoots!");
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
                        DialogPrinter.printDialog("The player performs Aimed Shot!\n");
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
                        DialogPrinter.printDialog("The player casts Arcane Shot!\n");
                        int arcaneShotDamage = Player.arcaneShot();
                        Dragon.currentHP -= arcaneShotDamage;
                    } else 
                    {
                        DialogPrinter.printDialog("Not enough mana for Arcane Shot.");
                    }
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
            DialogPrinter.printDialog(ANSI_RED + "\nPlayer's HP: " + Player.currentHP + ANSI_RESET);
            DialogPrinter.printDialog(ANSI_BLUE + "\nPlayer's mana pool: " + Player.currentMana + ANSI_RESET);
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
            System.out.print("Press ENTER to advance to the player's turn");
            input.nextLine(); // Wait for player to press Enter
        }

        input.close();
    }
}
