package main.java;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //TODO: Ezeket kiszervezni az UI-ba

        LeaderBuild leaderBuild = new LeaderBuild();
        List<String> filter = new ArrayList<>();

        leaderBuild.readTraits("src/main/resources/traits.txt");
        leaderBuild.readLeaders("src/main/resources/leaders.txt");
        leaderBuild.writeLeaders(filter);
    }
}
