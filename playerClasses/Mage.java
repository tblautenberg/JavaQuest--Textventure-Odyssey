package playerClasses;

import java.util.Random;

public class Mage extends MainPlayerClass {
    public Mage(int currentHP, int currentMana) {
        // Call the constructor of the parent class (MainPlayerClass)
        super(currentHP, currentMana);
    }


    public int basicAttack()
    {
        Random basicAttackDmgRand = new Random();
        int basicAttackUpperBound = 7;
        int basicAttackDmg = basicAttackDmgRand.nextInt(basicAttackUpperBound);
        System.out.println("The mage carefully aims at his target, releasing a powerful shot!");
        System.out.println("The aimed shot does " + basicAttackDmg + " DMG!");
        return basicAttackDmg;
    }


    public void spellShield()
    {
        System.out.println("The mage casts a spellshield on itself.");
        System.out.println("The spellshield blocks the next incoming attack.");
        Boolean spellShield = true;
    }

    public int Fireball()
    {

        Random fireballDmgRand = new Random();
        int fireballDmgRandUpperBound = 25;
        int fireballDmg = fireballDmgRand.nextInt(fireballDmgRandUpperBound);
        System.out.println("The mage conjurs and hurls a flaming projectile at the target, causing fiery explosions.");
        System.out.println("The fireball does " + fireballDmg + " DMG!");
        currentMana -= 15;
        return fireballDmg;

    }

    public int Earthquake()
    {
        Random earthquakeDmgRand = new Random();
        int earthquakeDmgRandUpperBound = 10;
        int earthquakeDmg = earthquakeDmgRand.nextInt(earthquakeDmgRandUpperBound);
        System.out.println("The mage sends shockwaves through the ground, causing the ground to shake.");
        System.out.println("The earthquake deals " + earthquakeDmg + " DMG!");
        currentMana -=10;
        return earthquakeDmg;
    }
}

//hej :)