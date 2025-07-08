import java.util.ArrayList;

public class TwoDarraylist {

    public static void main(String[] args) {
        ArrayList<ArrayList<String>> groceryList = new ArrayList();
        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");
        ArrayList<String> produceList = new ArrayList();
        produceList.add("chips");
        produceList.add("biscuit");
        produceList.add("icecream");
        ArrayList<String> DrinkList = new ArrayList();
        DrinkList.add("cocacola");
        DrinkList.add("pepsi");
        DrinkList.add("fanta");
        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(DrinkList);
        System.out.println((String)((ArrayList)groceryList.get(1)).get(1));
    }
}
