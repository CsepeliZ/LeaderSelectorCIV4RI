package main.java;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class LeaderBuild {

    List<Leader> leaderList = new ArrayList<>();
    List<Trait> traitList = new ArrayList<>();
    List<String> leaderString = new ArrayList<>();

    public void readTraits(String filePath) {
        //TODO: same as readLeaders
    }

    public void readLeaders(String filePath) {

        //TODO:  paraméterként kapott path String alapján olvasd be soronként a txt fájlt,
        // és minden sorhoz hozz létre egy Leader objektumot, amiket adj hozzá a listához!
        // IO hiba esetén írd ki konzolra a StackTrace-t!;

        try {
            leaderString = Files.readAllLines(Path.of(filePath));
            String leaderName = null;
            String leaderNation = null;
            List<Trait> leaderTraits = new ArrayList<>();
            String[] leaderTraitNames = null;
            //List<String> leaderInfo = null;
            for (String s : leaderString) {
                String[] sArray = s.split(";");
                if (sArray.length > 0) {
                    leaderName = sArray[0];
                }
                if (sArray.length > 1) {
                    leaderNation = sArray[1];
                }
                if (sArray.length > 2) {
                    leaderTraitNames = new String[]{sArray[2], sArray[3], sArray[4]};
                }
                //TODO: leaderTraitNames to leaderTraits
            }
            Leader nextLeader = new Leader(leaderName, leaderNation, leaderTraits); //TODO: leeadeInfo
            leaderList.add(nextLeader);
            leaderNation = null;
            leaderTraitNames = null;
        } catch (IOException e) {
            e.printStackTrace();
        }

        // TODO: A readLeaders metódust módosítsd úgy, hogy képes legyen beolvasni egy hibásan felvett
        //  listát is! A különböző attribútumok feldolgozását szervezd ki külön metódusokba a könnyebb olvashatóság
        //  kedvéért, és azokban kezeld le az esetleges kivételeket!
        //  Ha adott sorban valamilyen adat nem értelmezhető, akkor legyenek default értékek beállítva.
    }

    public void writeLeaders(List<String> filter) {

        //TODO: Hozz létre egy olyan txt fájlt a resources mappába, ami nevében tartalmazza
        // a paraméterként kapott enumot, majd ebbe írd ki külön sorokba azoknak a Leadereknek a neveit, amelyek
        // megfelelnek a filternek! IO hiba esetén csak írd ki konzolra a StackTrace-t!

        try {
            Path leaderOutput = Path.of("src/main/resources/leaderOut" + filter.toString() + ".txt");
            Files.createFile(leaderOutput);
//            for (Leader leader : leaderList) {
//                if (leader.getLeaderTraits().getTraitName().equals(filter)) {
//                    Files.writeString(leaderOutput, leader + "\r\n", StandardOpenOption.APPEND);
//                }
//            }
            //TODO: List listjéből nevet kiolvasni.

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
