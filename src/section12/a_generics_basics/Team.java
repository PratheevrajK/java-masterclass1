package section12.a_generics_basics;

import java.util.ArrayList;
import java.util.List;

record Affiliation(String name, String type, String countryCode) {
    @Override
    public String toString() {
        return "%s (%s in %s)".formatted(type, name, countryCode);
    }
}

public class Team<T extends Player, S> { // extends is an UpperBound.
    private String name;
    private List<T> players;
    private int totalWins = 0;
    private int totalLosses = 0;
    private int totalTies = 0;
    private S affiliation;

    public Team(String name) {
        this.name = name;
        players = new ArrayList<>();
    }

    public Team(String name, S affiliation) {
        this.name = name;
        this.affiliation = affiliation;
        players = new ArrayList<>();
    }

    public String getName() {
        return name + " Players: ";
    }

    public void addMember(T t) {
        if(!players.contains(t)) {
            players.add(t);
        }
    }

    public void listTeamMembers() {
        System.out.print(getName());
        System.out.println(affiliation != null ? "Affiliated to " + affiliation : "");
        for (T t : players) {
            System.out.println(t);
        }
    }

    public int ranking() {
        return (totalLosses * 2) + totalTies + 1;
    }

    public String setScore(int ourScore, int theirScore) {
        String message = "lost to";
        if(ourScore>theirScore){
            totalWins++;
            message = "beat";
        } else if(ourScore==theirScore){
            totalTies++;
            message = "tied";
        } else {
            totalLosses++;
        }
        return message;
    }

    @Override
    public String toString() {
        return name + ": (Ranked at %d)".formatted(ranking());
    }
}
