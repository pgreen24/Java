import java.util.Scanner;
public class arrays {
    public static void main(String[] args) {
        String[] cars = new String[]{"texla", "tata", "Bmw"};
        cars[0] = "tata nano";
        System.out.println(cars[2]);

        // number of array
        Scanner jk = new Scanner(System.in);
        System.out.println("enter the element of vegetable number");
        int k = jk.nextInt();
        String[] vegetable = new String[k];
        jk.nextLine();

        System.out.println("enter the name of vegetable");


        for(int j = 0; j < vegetable.length; ++j) {
            vegetable[j] = jk.nextLine();
        }

        System.out.println("you enter the following vegetables:");

        for(int j = 0; j < vegetable.length; ++j) {
            System.out.print(vegetable[j]+", ");
        }

        jk.close();
    }
}

