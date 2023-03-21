package main.java.leaders;

import main.java.traits.Trait;

import java.util.List;

public abstract class Leader {

    private String leaderName;
    private String leaderNation;
    private List<Trait> leaderTraits;
    private List<String> leaderInfo;

    public Leader(String leaderName, String leaderNation, List<Trait> leaderTraits, List<String> leaderInfo) {
        this.leaderName = leaderName;
        this.leaderNation = leaderNation;
        this.leaderTraits = leaderTraits;
        this.leaderInfo = leaderInfo;
    }
}
