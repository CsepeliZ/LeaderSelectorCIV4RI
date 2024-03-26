package main.java.trait;

import java.util.List;

public class Trait {

    private TraitName traitName;
    private boolean isNegativeTrait;
    private String traitInfo;

    public Trait(TraitName traitName, boolean isNegativeTrait, String traitInfo) {
        this.traitName = traitName;
        this.isNegativeTrait = isNegativeTrait;
        this.traitInfo = traitInfo;
    }

    public Trait(TraitName traitName, boolean isNegativeTrait) {
        this.traitName = traitName;
        this.isNegativeTrait = isNegativeTrait;
    }


    public TraitName getTraitName() {
        return traitName;
    }

    public void setTraitName(TraitName traitName) {
        this.traitName = traitName;
    }

    public boolean isNegativeTrait() {
        return isNegativeTrait;
    }

    public void setNegativeTrait(boolean negativeTrait) {
        isNegativeTrait = negativeTrait;
    }

    public String getTraitInfo() {
        return traitInfo;
    }

    public void setTraitInfo(String traitInfo) {
        this.traitInfo = traitInfo;
    }

    @Override
    public String toString() {
        return traitName.getDisplayName() + '\'' +
                "Effects: " + '\'' +
                traitInfo;
    }
}
