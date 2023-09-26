import java.util.*;

import playerClasses.Enemy;
import playerClasses.Hunter;


public class BetaCombat {
    public static void main(String[] args)
    {
        Hunter Player = new Hunter(100, 100, 0, 0, 0, 0, 0);
        Enemy Dragon = new Enemy();

        while (Player.currentHP > 0 && Dragon.currentHP > 0) {
            DialogPrinter.printDialog("The player shoots! \n");
            int playerDamage = Player.basicAttack(); // Calculate player's damage
            DialogPrinter.printDialog("The dragon takes " + playerDamage + "\n");
            Dragon.currentHP -= playerDamage; // Subtract damage from Dragon's HP

            DialogPrinter.printDialog("Dragon's HP: " + Dragon.currentHP + "\n");
            System.out.println("********************************************");
        

            DialogPrinter.printDialog("The enemy strikes!\n");
            int enemyDamage = Dragon.basicAttack(); // Calculate dragons's damage
            Player.currentHP -= enemyDamage; // Subtract damage from players's HP

            DialogPrinter.printDialog("Players's HP: " + Player.currentHP + "\n");
            System.out.println("********************************************");

        }
    }
}
