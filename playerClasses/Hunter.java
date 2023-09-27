package playerClasses;

import java.util.Random;

public class Hunter extends MainPlayerClass {
    public Hunter(int currentHP, int currentMana) {
        // Call the constructor of the parent class (MainPlayerClass)
        super(currentHP, currentMana);
    }


    public int basicAttack() 
    {
        Random basicAttackDmgRand = new Random();
        int basicAttackUpperBound = 7;
        int basicAttackDmg = basicAttackDmgRand.nextInt(basicAttackUpperBound);
        DialogPrinter.printDialog("The shot does " + basicAttackDmg + " DMG!");
        return basicAttackDmg; // Return the damage value
    }
    

    public void huntersMark()
    {
        DialogPrinter.printDialog("The hunter casts hunters mark on target \n");
        DialogPrinter.printDialog("The roll has been increased by 5 pr. ability");
        Boolean huntersMarkActive = true;
    }

    public int aimedShot()
    {
        Random aimedShotDmgRand = new Random();
        int aimedUpperBound = 25;
        int aimedShotDmg = aimedShotDmgRand.nextInt(aimedUpperBound);
        DialogPrinter.printDialog("The hunter carefully aims at his target, releasing a powerfull shot!");
        System.out.println();
        DialogPrinter.printDialog("The aimed shot does " + aimedShotDmg + " DMG!");
        currentMana -= 35;
        return aimedShotDmg;

    }

    public int arcaneShot()
    {
        Random arcaneShotDmgRand = new Random();
        int arcaneUpperBound = 10;
        int arcaneShotDmg = arcaneShotDmgRand.nextInt(arcaneUpperBound);
        DialogPrinter.printDialog("The shot deals " + arcaneShotDmg + " DMG!");
        currentMana -=25;
        return arcaneShotDmg;
    }
}