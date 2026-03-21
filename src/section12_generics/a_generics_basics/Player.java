package section12_generics.a_generics_basics;

public interface Player{}

record CricketPlayer(String name, String position) implements Player {}

record FootballPlayer(String name, String position) implements Player {}

record BadmintonPlayer(String name, String position) implements Player {}