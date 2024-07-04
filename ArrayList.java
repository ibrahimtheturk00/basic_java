import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       ArrayList<String> name = new ArrayList<String>();
       int selection = 1;
       Scanner scanner = new Scanner(System.in);
       while (selection != 2){
           System.out.println("Enter your Decision");
           System.out.println("1.Enter name");
           System.out.println("2.Exit");
           selection = scanner.nextInt();
           scanner.nextLine();
           switch (selection){
               case 1:
                   System.out.println("Enter name");
                   name.add(scanner.nextLine());
                   break;
               case 2:
                   break;
           }
       }
       for (int i = 0; i < name.size(); i++){
           System.out.println(name.get(i));
       }
       name.set(1, "yunan");
       System.out.println(name.get(1));
       name.remove(1);
       name.clear();
        }
    }
