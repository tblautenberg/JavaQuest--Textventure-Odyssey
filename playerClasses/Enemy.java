package playerClasses;
import java.util.Random;

public class Enemy {

    
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public int currentHP = 50;
    public int currentMana = 50;


    public void currentEnemyStats() 
    {
        System.out.println(ANSI_RED + "Current HP: " + currentHP + ANSI_RESET);
        System.out.println(ANSI_BLUE + "Current MANA: " + currentMana + ANSI_RESET);
    }

    public int basicAttack() {
        Random basicAttackDmgRand = new Random();
        int basicAttackUpperBound = 7;
        int basicAttackDmg = basicAttackDmgRand.nextInt(basicAttackUpperBound);
        DialogPrinter.printDialog("The dragon takes a deep breath, and lay the land in a burning glaze");
        System.out.println();
        DialogPrinter.printDialog("The intense fire of the beast does " + basicAttackDmg + " DMG!");
        return basicAttackDmg; // Return the damage value
    }
}