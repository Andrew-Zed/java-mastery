package com.andrew.generics.lesson;

public class Main {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> manchesterUnited = new Team<>("Manchester United");
        manchesterUnited.addPlayer(joe);
//        manchesterUnited.addPlayer(pat);
//        manchesterUnited.addPlayer(beckham);

        System.out.println(manchesterUnited.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        Team<SoccerPlayer> brokenTeam = new Team<>("this won't work");
        brokenTeam.addPlayer(beckham);

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(manchesterUnited, 3 , 8);

        manchesterUnited.matchResult(fremantle, 2, 1);
//        manchesterUnited.matchResult(baseballTeam, 1,1);

        System.out.println("Ranking");
        System.out.println(manchesterUnited.getName() + ": " + manchesterUnited.ranking());
        System.out.println(melbourne.getName() + ": " + melbourne.ranking());
        System.out.println(fremantle.getName() + ": " + fremantle.ranking());
        System.out.println(hawthorn.getName() + " : " + hawthorn.ranking());

        System.out.println(manchesterUnited.compareTo(melbourne));
        System.out.println(manchesterUnited.compareTo(hawthorn));
        System.out.println(hawthorn.compareTo(manchesterUnited));
        System.out.println(melbourne.compareTo(fremantle));

    }

}
