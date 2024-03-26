package main.java.trait;

public enum TraitName {
    ADMINISTRATOR("Administrator"), AGRARIAN("Agrarian"), ANTI_CLERICAL("Anti-clerical"),
    ARROGANT("Arrogant"), BARBARIC("Barbaric"), CHARISMATIC("Charismatic"),
    CONQUEROR("Conqueror"), CREATIVE("Creative"), CRUEL("Cruel"),
    EXCESSIVE("Excessive"), EXPANSIVE("Expansive"), FANATICAL("Fanatical"),
    FINANCIAL("Financial"), FOREIGN("Foreign"), HUMANIST("Humanist"),
    IDEALISTIC("Idealistic"), IMPERIALISTIC("Imperialistic"), INDUSTRIOUS("Industrious"),
    ISOLATIONIST("Isolationist"), LEGISLATOR("Legislator"), MEGALOMANIAC("Megalomaniac"),
    MILITARISTIC("Militaristic"), PHILOSOPHICAL("Philosophical"), POLITICAL("Political"),
    POOR_COMMANDER("Poor commander"),POPULIST("Populist"), PROGRESSIVE("Progressive"),
    PROTECTIVE("Protective"), REVOLUTIONARY("Revolutionary"), SCHEMER("Schemer"),
    SEAFARER("Seafarer"), SPIRITUAL("Spiritual"), TEMPERAMENTAL("Temperamental"),
    NONE("Trait error");

    private final String displayName;

    TraitName(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }


}
