import java.util.Scanner;
public class TwoDArray {
    public static void main(String[] args) {
        Scanner JK = new Scanner(System.in);
        System.out.println("Enter the number of Row: ");
        int k = JK.nextInt();
        System.out.println("Enter the number of columns: ");
        int l = JK.nextInt();
        String[][] CARS = new String[k][l];
        JK.nextLine();
        System.out.println("enter the cars name:");

        int i;
        int j;
        for(i = 0; i < k; ++i) {
            for(j = 0; j < l; ++j) {
                CARS[i][j] = JK.next();
            }
        }

        System.out.println("outPut: ");

        for(i = 0; i < CARS.length; ++i) {
            for(j = 0; j < CARS[i].length; ++j) {
                System.out.print(CARS[i][j] + " ");
            }

            System.out.println();
        }

        JK.close();
    }
}