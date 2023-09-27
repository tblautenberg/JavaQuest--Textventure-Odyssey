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

    public int Claw() 
    {
        Random clawDmgRand = new Random();
        int clawDmgUpperBound = 10;
        int clawDmg = clawDmgRand.nextInt(clawDmgUpperBound);
        DialogPrinter.printDialog("The beast lunges towrads you, with immense force");
        System.out.println();
        DialogPrinter.printDialog("The broad slash of the sharp claws inflict " + clawDmg + " DMG!");
        return clawDmg; // Return the damage value
    }

    public int furyStrikes() 
    {
        Random furyStrikeDmgRand = new Random();
        int furyStrikesUppberBound = 15;
        int furyStrikesLowerBound = 7;
        int furyStrikeDmg = furyStrikeDmgRand.nextInt(furyStrikesUppberBound - furyStrikesLowerBound) + furyStrikesLowerBound;
        DialogPrinter.printDialog("The Dragon strike you with unrealentetd fury,");
        System.out.println();
        DialogPrinter.printDialog("The force of the behemoth hits you, and you take " + furyStrikeDmg + " DMG!");
        return furyStrikeDmg; // Return the damage value
    }

    public int flameBreath() 
    {
        Random flameBreathRand = new Random();
        int flameBreathUpperBound = 25;
        int flameBreathLowerBound = 20;
        int flameBreathDmg = flameBreathRand.nextInt(flameBreathUpperBound - flameBreathLowerBound) + flameBreathLowerBound;
        DialogPrinter.printDialog("The dragon takes a deep breath, and lay the land in a burning glaze");
        System.out.println();
        DialogPrinter.printDialog("The intense fire of the beast does " + flameBreathDmg + " DMG!");
        return flameBreathDmg; // Return the damage value
    }
}