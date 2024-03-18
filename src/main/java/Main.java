package main.java;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //TODO: Ezeket kiszervezni az UI-ba

        LeaderBuild leaderBuild = new LeaderBuild();
        List<String> filter = new ArrayList<>();

        leaderBuild.readTraits("src/main/resources/TraitFullData.csv");
        leaderBuild.readLeaders("src/main/resources/LeaderFullData.csv");
        leaderBuild.writeLeaders(filter);
    }
}
