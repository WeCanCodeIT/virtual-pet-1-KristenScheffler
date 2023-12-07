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

    public void petStats() {
        System.out.println("Name: " + this.name);
        System.out.println("Hunger: " + this.hungerLevel);
        System.out.println("Thirst: " + this.thirstLevel);
        System.out.println("Bored Status: " + this.boredLevel);
    }
    
}