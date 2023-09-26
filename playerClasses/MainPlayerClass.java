package playerClasses;

public class MainPlayerClass {

    
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public int currentHP;
    public int currentMana;
    public int Intelligence;
    public int Strenght;
    public int Agility;
    public int Spirit;
    public int Stamnina;

    public MainPlayerClass(int currentHP, int currentMana, int Intelligence, int Strenght, int Agility, int Spirit, int Stamnina) {
        this.currentHP = currentHP;
        this.currentMana = currentMana;
        this.Intelligence = Intelligence;
        this.Strenght = Strenght;
        this.Agility = Agility;
        this.Spirit = Spirit;
        this.Stamnina = Stamnina;
    }


    public void currentPlayerStats() 
    {
        System.out.println(ANSI_RED + "Current HP: " + currentHP + ANSI_RESET);
        System.out.println(ANSI_BLUE + "Current MANA: " + currentMana + ANSI_RESET);
    }

        public void manaPotion() {
        System.out.println("You drink a mana potion, and it has added 20 mana to your pool");
        currentMana += 20;
        System.out.println("Your current MANA: " + ANSI_BLUE + currentMana + ANSI_RESET);
    }

        public void healthPotion() {
        System.out.println("You drink a mana potion, and it has added 20 health to your pool");
        currentHP += 20;
        System.out.println("Your current MANA: " + ANSI_RED + currentHP + ANSI_RESET);
    }
}