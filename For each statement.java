import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> clubs = new ArrayList<>();
        clubs.add("Barcelona");
        clubs.add("Manchester United");
        clubs.add("Sporting Lisbon");
        for(String i : clubs){
            System.out.println(i.toUpperCase());
        }
        System.out.println();
        String[] animals = {"cat", "dog", "bird", "alligator"};
        for (String i : animals){
            System.out.println(i.toLowerCase());
        }
        }
    }
