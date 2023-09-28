package playerClasses;

import java.util.Random;

public class Hunter extends MainPlayerClass {
    public Hunter(int currentHP, int currentMana) {
        super(currentHP, currentMana);
    }


    public int basicAttack() 
    {
        Random basicAttackDmgRand = new Random();
        int basicAttackUpperBound = 7;
        int basicAttackDmg = basicAttackDmgRand.nextInt(basicAttackUpperBound);
        DialogPrinter.printDialog("The shot does " + basicAttackDmg + " DMG!");
        return basicAttackDmg;
    }
    

    public void huntersMark() // Virker ikke som den skal - men kunne være fedt at lave :3
    {
        DialogPrinter.printDialog("The hunter casts hunters mark on target \n");
        DialogPrinter.printDialog("The roll has been increased by 5 pr. ability");
        Boolean huntersMarkActive = true;
    }

 public int arcaneShot()
    {
        Random arcaneShotDmgRand = new Random();
        int arcaneUpperBound = 10;
        int arcaneLowerBound = 6;
        int arcaneShotDmg = arcaneShotDmgRand.nextInt(arcaneUpperBound - arcaneLowerBound) + arcaneLowerBound;
        DialogPrinter.printDialog("The shot deals " + arcaneShotDmg + " DMG!");
        currentMana -=30;
        return arcaneShotDmg;
    }

    public int aimedShot()
    {
        Random aimedShotDmgRand = new Random();
        int aimedUpperBound = 25;
        int aimedLowerBound = 15;
        int aimedShotDmg = aimedShotDmgRand.nextInt(aimedUpperBound - aimedLowerBound) + aimedLowerBound;
        DialogPrinter.printDialog("The hunter carefully aims at his target, releasing a powerfull shot!");
        System.out.println();
        DialogPrinter.printDialog("The aimed shot does " + aimedShotDmg + " DMG!");
        currentMana -= 40;
        return aimedShotDmg;

    }
}