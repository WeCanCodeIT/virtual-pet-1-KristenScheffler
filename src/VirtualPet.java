public class VirtualPet {
    private String name;
    private int hungerLevel = 5;
    private int thirstLevel = 5;
    private int boredLevel = 5;

    public VirtualPet(String name) {
        this.name = name;
    }

    public void feed() {
        hungerLevel -= 15;
        if (hungerLevel < 0) {
            hungerLevel = 0;
        }
    }

    public void giveDrink() {
        thirstLevel -= 15;
        if (thirstLevel < 0) {
            thirstLevel = 0;
        }
    }

    public void play() {
        boredLevel -= 15;
        if (boredLevel < 0) {
            boredLevel = 0;
        }
    }

    public void tick() {
        hungerLevel += 5;
        thirstLevel += 5;
        boredLevel += 5;
        if (hungerLevel > 50) {
            printHungryDog();
        }
        if (thirstLevel > 50) {
            printThirstyDog();
        }
        if (boredLevel > 50) {
            printBoredDog();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public int getThirstLevel() {
        return thirstLevel;
    }

    public int getBoredLevel() {
        return boredLevel;
    }

    public void setBoredLevel(int boredLevel) {
        this.boredLevel = boredLevel;
    }

    public void printHungryDog() {
        System.out.println(" / \\__");
        System.out.println("(    @\\___");
        System.out.println(" /         O");
        System.out.println("/   )____/");
        System.out.println("/_____/   ");
    }

    public void printBoredDog() {
        System.out.println(" / \\__");
        System.out.println("(    @\\___");
        System.out.println(" /         O");
        System.out.println("/   _____/");
        System.out.println("/_____/   ");
    }

    public void printThirstyDog() {
        System.out.println(" / \\__");
        System.out.println("(    @\\___");
        System.out.println(" /         O");
        System.out.println("/   (_____/");
        System.out.println("/_____/   U");
    }

    public void petStats() {
        System.out.println("Name: " + this.name);
        System.out.println("Hunger: " + this.hungerLevel);
        System.out.println("Thirst: " + this.thirstLevel);
        System.out.println("Bored Status: " + this.boredLevel);
    }
    
}