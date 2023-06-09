package main.java;

import java.util.List;

public class Trait {

    private String traitName;
    private boolean isNegativeTrait;
    private List<String> traitInfo;

    public Trait(String traitName, boolean isNegativeTrait, List<String> traitInfo) {
        this.traitName = traitName;
        this.isNegativeTrait = isNegativeTrait;
        this.traitInfo = traitInfo;
    }

    public Trait(String traitName, boolean isNegativeTrait) {
        this.traitName = traitName;
        this.isNegativeTrait = isNegativeTrait;
    }

    public String getTraitName() {
        return traitName;
    }

    public void setTraitName(String traitName) {
        this.traitName = traitName;
    }

    public boolean isNegativeTrait() {
        return isNegativeTrait;
    }

    public void setNegativeTrait(boolean negativeTrait) {
        isNegativeTrait = negativeTrait;
    }

    public List<String> getTraitInfo() {
        return traitInfo;
    }

    public void setTraitInfo(List<String> traitInfo) {
        this.traitInfo = traitInfo;
    }

    @Override
    public String toString() {
        return traitName + '\'' +
                "Effects: " + '\'' +
                traitInfo;
    }
}
