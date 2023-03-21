package main.java.traits;

import java.util.List;

public abstract class Trait {

    private String traitName;
    private boolean isNegativeTrait;
    private List<String> traitInfo;

    public Trait(String traitName, boolean isNegativeTrait, List<String> traitInfo) {
        this.traitName = traitName;
        this.isNegativeTrait = isNegativeTrait;
        this.traitInfo = traitInfo;
    }
}
