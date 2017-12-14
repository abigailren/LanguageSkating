package verlierer;
import java.util.*;

public class German extends Language{
    String languageName = "German";
    public String[] wordArray = new String[] {"Hallo", "Auf Wiedersehen", "Ja",
            "Nien", "Danke", "Gut", "Schlecht", "Nicht", "Gl\u00FCcklich",
            "Traurig", "Wer", "Was", "Wann", "Wo", "Wieso", "Wie"};

    public  ArrayList<String> germanWordList = new ArrayList(Arrays.asList(wordArray));

    public German(){
        super.languageName = this.languageName;
    }

    public Character createCharacter() {
        return new Germany();
    }

    @Override
    public ArrayList<String> getWordList() {
        return germanWordList;
    }
}
