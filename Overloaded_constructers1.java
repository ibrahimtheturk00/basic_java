public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("levandowski","barcelona", "fw",34, 150000 );
        System.out.printf("Here is the information of %s%nClub:%s%nPosition:%s%nAge:%d%nSalary:%.2f%n",player1.name,player1.club,player1.position,player1.age,player1.salary);

        Player player2 = new Player("tadic","fenerbahce");
        System.out.printf("%nHere is the information of %s%nClub:%s%n",player2.name,player2.club);

        Player player3 = new Player("arda guler", 19);
        System.out.printf("%nHere is the information of %s%nAge:%d%n",player3.name,player3.age);
        }
    }