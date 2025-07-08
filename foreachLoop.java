import java.util.ArrayList;
import java.util.Iterator;

    public class foreachLoop {

        public static void main(String[] args) {

           // String[]animals ={"cat","dog","rat","bird"};
          //  for(String i : animals ){
            //    System.out.println(i);
            //}
            ArrayList<String> animal = new ArrayList();
            //ArrayList<String> animal = new ArrayList<String>();
            animal.add("lion");
            animal.add("Tiger");
            animal.add("Eagle");

            //for(String i : animal) {
              //  System.out.println(i);
           // }
            Iterator var2 = animal.iterator();

            while(var2.hasNext()) {
                String i = (String)var2.next();
                System.out.println(i);
            }

        }
    }
