public class Main {
    public static void main(String[] args) {

            Garage jk = new Garage();
            Car i = new Car("BMW");
            Car j = new Car("tesla");
            jk.park(i);
            jk.park(j);
    }
}