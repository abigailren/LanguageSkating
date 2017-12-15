package verlierer;
import java.util.*;

/**
 * Implements array of German words corresponding to that of Language
 */
public class German extends Language{
    /**
     * String declaring that this language is German, followed by the wordArray listing all
     * the german equivalents to the english words being taught,
     * having to use unicode for letters not used in the english alphabet.
     * That wordArray is put into an ArrayList.
     */
    String languageName = "German";
    public String[] wordArray = new String[] {"Hallo", "Auf Wiedersehen", "Ja",
            "Nein", "Danke", "Gut", "Schlecht", "Nicht", "Gl\u00FCcklich",
            "Traurig", "Wer", "Was", "Wann", "Wo", "Wieso", "Wie"};
    public  ArrayList<String> translatedWordList = new ArrayList(Arrays.asList(wordArray));

    /**
     * Next the method German when calles sets the languageName in the main method as german and
     * sets the german translatedWordList as the one to be used in the main method for the rest of the program.
     */
    public German(){
        super.languageName = this.languageName;
        super.translatedWordList = this.translatedWordList;
    }

    /**
     * The createCharacter method then returns the German character German McGermanFace
     * @return
     */
    public Character createCharacter() {
        return new Germany();
    }

    /**
     * Lastly the getWordList() returns the German translatedWordList
     * @return
     */
    @Override
    public ArrayList<String> getWordList() {
        return translatedWordList;
    }
}
