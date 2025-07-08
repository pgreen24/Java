import java.util.ArrayList;
public class Arraylist {

        public static void main(String[] args) {
            ArrayList<String> foods = new ArrayList();
            foods.add("pizza");
            foods.add("burger");
            foods.add("hot dog");
            foods.set(0, "biriyani");
           // foods.remove(1);
            //foods.clear();

            for(int i = 0; i < foods.size(); ++i) {
                System.out.println((String)foods.get(i));
            }

        }
    }

