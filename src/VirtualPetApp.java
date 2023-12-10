import java.util.Scanner;

public class VirtualPetApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Virtual Pet Game!");

        System.out.print("We currently have dogs available to adopt! Enter your dogs name: ");
        String name = scanner.nextLine();

        VirtualPet pet = new VirtualPet(name);
        int duration = 0;
        int userChoice;

        do {

        if (pet.getHungerLevel() > 30) {
            pet.printHungryDog();
            System.out.println(pet.getName() + " is hungry!");
        }
        if (pet.getThirstLevel() > 30) {
            pet.printThirstyDog();
            System.out.println(pet.getName() + " is thirsty!");
        }
        if (pet.getBoredLevel() > 30) {
            pet.printBoredDog();
            System.out.println(pet.getName() + " is bored!");
        }
        if (pet.getBoredLevel() > 40) {
            pet.printPlay();
        }

        System.out.println("\nDuration: " + duration);
        pet.petStats();

        System.out.println("\nWhat would you like to do?");
        System.out.println("Enter 1 to feed " + pet.getName());
        System.out.println("Enter 2 to give water to " + pet.getName());
        System.out.println("Enter 3 to play with " + pet.getName());
        System.out.println("Enter 4 to exit the game");
        System.out.print("\nEnter your choice: ");

        userChoice = scanner.nextInt();

        switch (userChoice) {
            case 1:
                System.out.println("You fed your pet!");
                pet.feed();
                break;
            case 2:
                System.out.println("You gave water to your pet!");
                pet.giveDrink();
                break;
            case 3:
                System.out.println("You played with your pet!");
                pet.play();
                break;
            case 4:
                System.out.println("Good bye, see you next time!");
                break;
            default:
            System.out.println("Invalid choice, please enter 1, 2, 3 or 4!");
                break;
        }

        pet.tick();
        duration++;

        } while (userChoice != 4);

        scanner.close();
    }
}
