package playerClasses;

import java.util.Random;

public class Hunter extends MainPlayerClass {
    public Hunter(int currentHP, int currentMana, int Intelligence, int Strength, int Agility, int Spirit, int Stamina) {
        // Call the constructor of the parent class (MainPlayerClass)
        super(currentHP, currentMana, Intelligence, Strength, Agility, Spirit, Stamina);
    }


    public void basicAttack()
    {
        Random basicAttackDmgRand = new Random();
        int basicAttackUpperBound = 7;
        int basicAttackDmg = basicAttackDmgRand.nextInt(basicAttackUpperBound);
        System.out.println("The hunter carefully aims at his target, releasing a powerfull shot!");
        System.out.println("The aimed shot does " + basicAttackDmg + " DMG!");
    }
    

    public void huntersMark()
    {
        System.out.println("The hunter casts hunters mark on target");
        System.out.println("The roll has been increased by 5 pr. ability");
        Boolean huntersMarkActive = true;
    }

    public void aimedShot()
    {

        Random aimedShotDmgRand = new Random();
        int aimedUpperBound = 25;
        int aimedShotDmg = aimedShotDmgRand.nextInt(aimedUpperBound);
        System.out.println("The hunter carefully aims at his target, releasing a powerfull shot!");
        System.out.println("The aimed shot does " + aimedShotDmg + " DMG!");
        currentMana -= 15;

    }

    public void arcaneShot()
    {
        Random arcaneShotDmgRand = new Random();
        int arcaneUpperBound = 10;
        int arcaneShotDmg = arcaneShotDmgRand.nextInt(arcaneUpperBound);
        System.out.println("The hunter casts arcane shot.");
        System.out.println("The shot deals " + arcaneShotDmg + " DMG!");
        currentMana -=10;
    }
}