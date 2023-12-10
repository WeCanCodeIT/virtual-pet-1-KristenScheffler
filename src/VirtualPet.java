public class VirtualPet {
    private String name;
    private int hungerLevel;
    private int thirstLevel;
    private int boredLevel;

    public VirtualPet(String name) {
        this.name = name;
        this.hungerLevel = 5;
        this.thirstLevel = 5;
        this.boredLevel = 5;
    }

    public void feed() {
        this.hungerLevel -= 15;
    }

    public void giveDrink() {
        this.thirstLevel -= 15;
    }

    public void play() {
        this.boredLevel -= 15;
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
        if (boredLevel > 75) {
            boredLevel -= 5;
            printPlay();
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

    public void printPlay() {
        System.out.println("Your dog has played with it's toy on its own! Bored Level down by 10");
    }

    public void petStats() {
        System.out.println("Name: " + this.name);
        System.out.println("Hunger: " + this.hungerLevel);
        System.out.println("Thirst: " + this.thirstLevel);
        System.out.println("Bored Status: " + this.boredLevel);
    }
    
}