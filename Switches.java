import java.util.Scanner;
public class Switches {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("enter the day");
        switch (a.nextLine()) {
            case "saturday":
                System.out.println("it is saturday");
                break;
            case "sunday":
                System.out.println("it is sunday");
                break;
            case "Monday":
                System.out.println("it is Monday");
                break;
            case "tuesday":
                System.out.println("it is tuesday");
                break;
            case "wednesday":
                System.out.println("it is wednesday");
                break;
            case "thursday":
                System.out.println("it is thursday");
                break;
            case "fridayday":
                System.out.println("it is fridayday");
                break;
            default:
                System.out.println("that is not a day");
        }

    }
}
