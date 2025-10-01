import java.util.Scanner;

public class Adventure {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Welcome to Eon's Great Adventure! This is text-based adventure game that will lead you through the wonderful world of Ocewara! ");

        System.out.println("Would you like to learn more about the world of Ocewara? \nY-Yes\nN-No");
        String learnMore = myObj.nextLine();
        if (learnMore.equals("Y") || learnMore.equals("y")) {
            System.out.println("Ocewara is a world filled with magic and mystery. It is home to many different");
        } else if (learnMore.equals("N") || learnMore.equals("n")) {
            System.out.print("Then let's get started!");
        } else {
            System.out.println("Invalid input. Please enter Y or N.");
            //Ask again, not full restart
            main(null); // Restart the process
            } 

        System.out.print("What's your name? ");

        }
    }