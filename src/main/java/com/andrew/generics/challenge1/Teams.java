package com.andrew.generics.challenge1;


import java.util.ArrayList;

public class Teams <T extends Players> implements Comparable<Teams<T>>{
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Teams(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T  player) {
        if(members.contains(player)) {
            System.out.println(player.getName() + " is already on this team");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " picked for the team " + this.name);
            return true;
        }
    }

    public int numPlayers() {
        return this.members.size();
    }


    public void matchResult(Teams<T> opponent, int ourScore, int theirScore) {

        String text;
        if (ourScore > theirScore) {
            won++;
            text = " beat ";
        } else if (ourScore == theirScore) {
            tied++;
            text = " drew with ";
        } else {
            lost++;
            text = " lost to  ";
        }
        played++;
        if(opponent != null) {
            System.out.println(this.getName() + text + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 3) + tied;
    }

    @Override
    public int compareTo(Teams teams) {
        return Integer.compare(teams.ranking(), this.ranking());
    }
}
