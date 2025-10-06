import java.util.Scanner;

public class Adventure {
    public static void main() {
        System.out.print("Welcome to Eon's Great Adventure! This is a text-based adventure game that will lead you through the wonderful world of Oceth!\n");
        startLearnMore();
    }

    public static void startLearnMore() {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Would you like to learn more about the world of Oceth \nY-Yes\nN-No");
        String learnMore = myObj.nextLine();

        if (learnMore.equals("Y") || learnMore.equals("y")) {
            //description of the world, main characters, and basic lore
            System.out.println("Oceth was a land discovered not too long ago by a prince named Tero. Upon discovering this land, he found it inhabited by various creatures, from elves and nymphs to griffins and wyverns. ");
            startTutorial();
        } else if (learnMore.equals("N") || learnMore.equals("n")) {
            startTutorial();
        } else {
            System.out.println("Please enter either Y or N.");
            startLearnMore();
            }
    }

    public static void startTutorial() {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Would you like to start the tutorial? \nY-Yes\nN-No");
        String tutorial = myObj.nextLine();

        if (tutorial.equals("Y") || tutorial.equals("y")) {
            //tutorial with controls, rules, how to play, etc.
            startAdventure();
        } else if (tutorial.equals("N") || tutorial.equals("n")) {
            startAdventure();
        } else {
            System.out.println("Please enter either Y or N.");
            startTutorial();
            }
    }

    public static void startAdventure() {
        //placeholder
        //welcome
    }

    public static void meetOri() {
        //placeholder
        //Ori will give a quest to the player. Quest will be to find his twin, Devyn.
    }

    public static void meetDevyn() {
        //placeholder
        //Devyn will give a quest to the player. Quest will be to help her in her mini adventure.
    }

    public static void meetEstarAndQuill() {
        //placeholder
        //
    }

    public static void questDevyn() {
        //placeholder
        //Quest to find her 
    }

    public static void questOri() {
        //placeholder
        //Quest to find Devyn, will lead to meetDevyn()
    }

}