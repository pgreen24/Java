import java.util.Scanner;

    public class ifstatements {
        public static void main(String[] args) {
            Scanner a = new Scanner(System.in);
            System.out.println("enter the age number:");
            int age = a.nextInt();
            if (age == 18) {
                System.out.println("you are an adult!");
            } else if (age <= 13) {
                System.out.println("you are teenager");
            } else if (age <= 100) {
                System.out.println("you are an older");
            } else {
                System.out.println("your not an adult");
            }

        }
    }

