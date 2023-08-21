public class TeamTest {
    public static void main(String[] args) {

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham= new SoccerPlayer("Beckham");

//        Team liverpool = new Team("Liverpool");

          Team<SoccerPlayer> liverpool = new Team<>("liverpool");


//          Team<String> brokenteam = new Team<>("this won't work");

//        liverpool.addPlayer(joe);
//        liverpool.addPlayer(pat);
        liverpool.addPlayer(beckham);

        System.out.println(liverpool.numPlayers());



    }
}
