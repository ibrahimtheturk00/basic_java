public class Player {
    String name;
    String club;
    String position;
    int age;
    double salary;

    Player(String name, String club, String position, int age, double salary){
        this.name = name;
        this.club = club;
        this.position = position;
        this.age = age;
        this.salary = salary;
    }
    Player(String name, String club){
        this.name = name;
        this.club = club;
    }

    Player(String name, int age){
        this.name = name;
        this.age = age;
    }
}
