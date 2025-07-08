import java.util.Scanner;
public class NestedLoops {
    public static void main(String[] args) {
        Scanner jk = new Scanner(System.in);
        String symbol = "";
        System.out.println("enter the number of row");
        int row = jk.nextInt();
        System.out.println("enter the number of column");
        int column = jk.nextInt();
        System.out.println("enter the number of symbol");
        symbol = jk.next();

        for(int i = 1; i <= row; ++i) {
            System.out.println();

            for(int j = 1; j <= column; ++j) {
                System.out.print(symbol);
            }
        }

    }
}
