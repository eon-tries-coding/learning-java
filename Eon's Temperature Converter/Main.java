import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Welcome to Eon's Temperature Converter!");

        System.out.print("What's your name? ");
        String name = myObj.nextLine();

        System.out.print("Hello, " + name + "! ");

        System.out.println("What temperature do you want to convert? (Enter a number): ");
        int inputTemp = myObj.nextInt();
        myObj.nextLine();

        System.out.println("Convert " + inputTemp + " to (C)elsius or (F)ahrenheit? ");

        String convertTo = myObj.nextLine();
    
        if (convertTo.equals("C") || convertTo.equals("c")) {
            int celsius = (inputTemp - 32) * 5 / 9;
            System.out.println(inputTemp + " degrees Fahrenheit is " + celsius + " degrees Celsius.");
        } else if (convertTo.equals("F") || convertTo.equals("f")) {
            int fahrenheit = (inputTemp * 9 / 5) + 32;
            System.out.println(inputTemp + " degrees Celsius is " + fahrenheit + " degrees Fahrenheit.");
        } else {
            System.out.println("Invalid input. Please enter C or F.");
        }

        System.out.println("Would you like to convert another temperature? (Y/N): ");
        String again = myObj.nextLine();
        myObj.nextLine();

        if (again.equals("Y") || again.equals("y")) {
            main(null); // Restart the process
        } else if (again.equals("N") || again.equals("n")) {
            System.out.println("Goodbye, " + name + "!");
        }

    
    }
}