import java.util.*;
public class Main {
    public static void main(String[] args) {
            ArrayList<ArrayList<String>> list = new ArrayList();
            ArrayList<String> bakery = new ArrayList();
            bakery.add("bread");
            bakery.add("donut");
            ArrayList<String> produce = new ArrayList();
            produce.add("tomato");
            produce.add("cucumber");
            ArrayList<String> coffee = new ArrayList();
            coffee.add("Americano");
            coffee.add("Latte");
            list.add(bakery);
            list.add(produce);
            list.add(coffee);
            System.out.println(list.get(0));
            System.out.println(list.get(0).get(1));
            System.out.println(list.get(2).get(0));
        }
    }
