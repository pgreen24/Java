import java.util.Random;

    public class DiceRoller {
        Random ab;
        int number;

        DiceRoller() {
            Random ab = new Random();
            this.lima(ab, this.number);
        }

        void lima(Random ab, int number) {
            number = ab.nextInt(6) + 1;
            System.out.println(number);
        }
    }

