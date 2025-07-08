import java.util.Scanner;
public class LogicalOperators {
    public static void main(String[] args) {
            int temp = 5;
            if (temp > 30) {
                System.out.println("it's hot outside");
            } else if (temp >= 20 && temp <= 30) {
                System.out.println("it's WARM outside");
            } else {
                System.out.println("it's cold outside");
            }

            Scanner A = new Scanner(System.in);
            System.out.println("you are playing the game ! press q or Q to quite");
            String r = A.next();
            if (!r.equals("q") && !r.equals("Q")) {
                System.out.println("you are still playing");
            } else {
                System.out.println("you quit the game");
            }

            Scanner B = new Scanner(System.in);
            System.out.println("you are playing the game ! press q or Q to quite");
            String j = B.next();
            if (!j.equals("q") && !j.equals("Q")) {
                System.out.println("you are still playing");
            } else {
                System.out.println("you quit the game");
            }

    }
}


