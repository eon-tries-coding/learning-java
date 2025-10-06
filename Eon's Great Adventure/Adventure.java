import java.util.Scanner;

public class Adventure {
    public static void main() {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Welcome to Eon's Great Adventure! This is a text-based adventure game that will lead you through the wonderful world of Ocewara!");

        System.out.println("Would you like to learn more about the world of Ocewara? \nY-Yes\nN-No");
        String learnMore = myObj.nextLine();
        if (learnMore.equals("Y") || learnMore.equals("y")) {
            startLearnMore();
        } else if (learnMore.equals("N") || learnMore.equals("n")) {
            System.out.print("Then let's get started!");
            System.out.println("Would you like to start with a tutorial? \nY-Yes\nN-No");
            String tutorial = myObj.nextLine();
            if (tutorial.equals("Y") || tutorial.equals("y")) {
                startTutorial();
            } else if (tutorial.equals("N") || tutorial.equals("n")) {
                startAdventure();
            } else {
                System.out.println("As of right now, this game requires that you select one of the options provided. The program will now restart.");
                main();
            }
        } else {
            System.out.println("As of right now, this game requires that you select one of the options provided. The program will now restart.");
            //change this to a loop later
            main();
            } 
        }

    public static void startLearnMore() {
        //placeholder
        //description
    }

    public static void startTutorial() {
        //placeholder
        //tutorial with controls, rules, how to play, etc.
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