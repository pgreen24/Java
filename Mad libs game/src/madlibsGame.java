import java.util.Scanner;

public class madlibsGame {
    public static void main(String[]args){
        Scanner a = new Scanner(System.in);
        String adjective1;
        String Noun1;
        String verb1;
        String adjective2;
        String adjective3;
        System.out.print("Enter an adjective(description):");
        adjective1 = a.nextLine();
        System.out.print("Enter an noun(animal or person):");
        Noun1 = a.nextLine();
        System.out.print("Enter an adjective(description):");
        adjective2 = a.nextLine();
        System.out.print("Enter an verb end with -ing (action):");
        verb1 = a.nextLine();
        System.out.print("Enter an adjective(description):");
        adjective3 = a.nextLine();

        System.out.println("\nToday i went to a "+ adjective1 +" Zoo");
        System.out.println("In a exhibition i saw a "+Noun1+ " .");
        System.out.println(Noun1 +" was a "+ adjective2 +" and " +verb1+"!");
        System.out.println("I was "+ adjective3 + "!");

        a.close();
    }
}
