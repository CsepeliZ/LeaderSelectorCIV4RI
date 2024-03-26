package main.java;

import main.java.trait.Trait;

import java.util.List;

public class Leader {

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

    public Leader(String leaderName, String leaderNation, List<Trait> leaderTraits) {
        this.leaderName = leaderName;
        this.leaderNation = leaderNation;
        this.leaderTraits = leaderTraits;
    }

    public String getLeaderName() {
        return leaderName;
    }

    public void setLeaderName(String leaderName) {
        this.leaderName = leaderName;
    }

    public String getLeaderNation() {
        return leaderNation;
    }

    public void setLeaderNation(String leaderNation) {
        this.leaderNation = leaderNation;
    }

    public List<Trait> getLeaderTraits() {
        return leaderTraits;
    }

    public void setLeaderTraits(List<Trait> leaderTraits) {
        this.leaderTraits = leaderTraits;
    }

    public List<String> getLeaderInfo() {
        return leaderInfo;
    }

    public void setLeaderInfo(List<String> leaderInfo) {
        this.leaderInfo = leaderInfo;
    }

    @Override
    public String toString() {
        return leaderName +
                " of the " + leaderNation + '\'' +
                "(" + leaderTraits +
                ")";
    }
}
