package section12.a_generics_basics;

public class Main {
    public static void main(String[] args) {
        Team<CricketPlayer, Affiliation> csk = new Team<>("Chennai Super Kings");
        Team<CricketPlayer, Affiliation> mi = new Team<>("Mumbai Indians");

        calculateScore(csk, 180, mi, 145);
//        Chennai Super Kings: (Ranked at 1) beat Mumbai Indians: (Ranked at 3)

        var dhoni = new CricketPlayer("MS Dhoni", "WK Batsman");
        var jadeja = new CricketPlayer("Ravindra Jadeja", "All-rounder");
        csk.addMember(dhoni);
        csk.addMember(jadeja);
        csk.listTeamMembers();
//        Chennai Super Kings Players:
//        CricketPlayer[name=MS Dhoni, position=WK Batsman]
//        CricketPlayer[name=Ravindra Jadeja, position=All-rounder]

        Team<FootballPlayer, Affiliation> barcelona = new Team<>("Barcelona Battledore"); // By using TypeParameter, cricketPlayer dhoni can't be added to FootballTeam.
        var messi = new FootballPlayer("Messi", "Attacker");
        barcelona.addMember(messi);
//        barcelona.addMember(dhoni); Without TypeParameter implementation, this code used to work.
        barcelona.listTeamMembers();
//        Barcelona Battledore Players:
//        FootballPlayer[name=Messi, position=Attacker]

//        Team<String> someTeam = new Team<String>("Dummy Team"); TypeParameter String is accepted here, as we don't have any UpperBound.
//        someTeam.addMember("SomePlayer");
//        someTeam.listTeamMembers();
//        Dummy Team Players:
//        SomePlayer
        Affiliation affiliation = new Affiliation("Chennai", "city", "India");
        Team<BadmintonPlayer, Affiliation> badmintonTeam = new Team<>("Shuttle Smashers", affiliation);
        var chirag = new BadmintonPlayer("ChiragShetty", "Defence");
        var ranki = new BadmintonPlayer("RankiReddy", "Attack");
        badmintonTeam.addMember(chirag);
        badmintonTeam.addMember(ranki);
        badmintonTeam.listTeamMembers();
//        Shuttle Smashers Players: Affiliated to city (Chennai in India)
//        BadmintonPlayer[name=ChiragShetty, position=Defence]
//        BadmintonPlayer[name=RankiReddy, position=Attack]


    }
    public static void calculateScore(Team team1, int score1, Team team2, int score2) {
        String result = team1.setScore(score1, score2);
        team2.setScore(score2, score1);
        System.out.printf("%s %s %s %n", team1, result, team2);
    }
}
