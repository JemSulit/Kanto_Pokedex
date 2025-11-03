import java.util.Scanner;
import java.util.Random; 

public class Kanto_PokeDex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random(); 

        System.out.println("_____________________________________________________________________________________");
        System.out.println("|                                                                                   |");
        System.out.println("|                            █▀▄ ▄▀▄ █░▄▀ █▀ █▀▄ █▀ █░█                             |");
        System.out.println("|                            █▄█ █░█ █▀▄░ █▀ █░█ █▀ ▄▀▄                             |");
        System.out.println("|                            ▀░░ ░▀░ ▀░▀▀ ▀▀ ▀▀▀ ▀▀ ▀░▀                             |");
        System.out.println("|___________________________________________________________________________________|");
        System.out.println("|                                                                                   |");
        System.out.println("|   ┌────────────────────────────────────────────┐    ┌───────────────────────────┐ |");
        System.out.println("|   │                                            │    │                           │ |");
        System.out.println("|   │                                            │    │                           │ |");
        System.out.println("|   │                                            │    │                           │ |");
        System.out.println("|   │                                            │    │                           │ |");
        System.out.println("|   │                                            │    │                           │ |");
        System.out.println("|   │                                            │    │                           │ |");
        System.out.println("|   │                                            │    │                           │ |");
        System.out.println("|   │                                            │    │                           │ |");
        System.out.println("|   │                                            │    │                           │ |");
        System.out.println("|   └────────────────────────────────────────────┘    └───────────────────────────┘ |");
        System.out.println("|                                                                                   |");
        System.out.println("|                                            [A] Select   [B] Back   [Start] Menu   |");
        System.out.println("|___________________________________________________________________________________|");
        
        System.out.println("[Professor Oak]: Hello there! Welcome to the world of Pokémon!");
        System.out.println("[Professor Oak]: For some people, Pokémon are pets. Others use them for battles.");
        System.out.println("[Professor Oak]: As for myself... I study Pokémon as a profession.\n");

        System.out.println("[Professor Oak]: Oh! You must be a new trainer, aren’t you?");
        System.out.print("[Professor Oak]: Tell me, what’s your name?\n\n[You]: ");
        String name = scanner.nextLine();

        System.out.println("\n[Professor Oak]: Ah, so your name is " + name + "!");
        System.out.println("[Professor Oak]: Before you head off on your journey, please choose your Pokémon:\n");

        System.out.println("   .-\"\"\"-.     .-\"\"\"-.     .-\"\"\"-.");
        System.out.println("  /  .-.  \\   /  .-.  \\   /  .-.  \\");
        System.out.println(" (--( 1 )--) (--( 2 )--) (--( 3 )--)");
        System.out.println("  \\  `-'  /   \\  `-'  /   \\  `-'  /");
        System.out.println("   `-._.-'     `-._.-'     `-._.-'");
        System.out.println("1. Squirtle");
        System.out.println("2. Charmander");
        System.out.println("3. Bulbasaur\n");

        System.out.print("[Professor Oak]: So, which Pokémon will you choose?\n");
        System.out.print("[" + name + "]: ");
        int choice = scanner.nextInt();
        String pokemon = "";

        switch (choice) {
            case 1:
                pokemon = "Squirtle";
                break;
            case 2:
                pokemon = "Charmander";
                break;
            case 3:
                pokemon = "Bulbasaur";
                break;
            default:
                String[] starters = {"Squirtle", "Charmander", "Bulbasaur"};
                pokemon = starters[random.nextInt(starters.length)];
                System.out.println("[Professor Oak]: Hmm... that’s not a valid choice! I’ll give you " + pokemon + " instead.");
        }

        System.out.println("\n[Professor Oak]: Excellent choice, " + name + "! You’ve chosen " + pokemon + "!");
        System.out.println("[Professor Oak]: Take good care of it and begin your adventure!\n");
        System.out.println("Your Pokémon journey begins now!");

        scanner.close();
    }
}


