public class VirtualPet {
    private String name;
    private int hungerLevel;
    private int thirstLevel;
    private int boredLevel;

    private boolean fedRecently = true;
    private boolean givenWaterRecently = true;
    private boolean playedRecently = true;

    public VirtualPet(String name) {
        this.name = name;
        this.hungerLevel = 5;
        this.thirstLevel = 5;
        this.boredLevel = 5;
    }

    public void feed() {
        this.hungerLevel -= 10;
        if (hungerLevel < 0) {
            hungerLevel = 0;
        }
        fedRecently = true;
    }

    public void giveDrink() {
        this.thirstLevel -= 10;
        if (thirstLevel < 0) {
            thirstLevel = 0;
        }
        givenWaterRecently = true;
    }

    public void play() {
        this.boredLevel -= 10;
        if (boredLevel < 0) {
            boredLevel = 0;
        }
        if (boredLevel > 40) {
            boredLevel -= 5;
        }
        playedRecently = true;
    }

    public void tick() {
        if (!fedRecently) {
            hungerLevel += 5;
        }
        if (!givenWaterRecently) {
            thirstLevel += 5;
        }
        if (!playedRecently) {
            boredLevel += 5;
        }
        fedRecently = false;
        givenWaterRecently = false;
        playedRecently = false;
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
        System.out.println("Your dog has played with it's toy on its own! Bored Level down by 5");
    }

    public void petStats() {
        System.out.println("Name: " + this.name);
        System.out.println("Hunger: " + this.hungerLevel);
        System.out.println("Thirst: " + this.thirstLevel);
        System.out.println("Bored Status: " + this.boredLevel);
    }
    
}