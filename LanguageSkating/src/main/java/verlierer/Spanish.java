package verlierer;

import java.util.*;

public class Spanish extends Language{
    /**
     * String declaring that this language is spanish, followed by the wordArray listing all
     * the spanish equivalents to the english words being taught,
     * having to use unicode for letters not used in the english alphabet.
     * That wordArray is put into an ArrayList.
     */
    String languageName = "Spanish";
    public static String[] wordArray = new String[] {"Hola", "Adi\u00F3s", "S\u00ED",
            "No", "Gracias", "Bueno/a", "Malo/a", "No", "Contento/a",
            "Triste", "Qui\u00E9n", "Qu\u00E9", "Cu\u00E1ndo", "D\u00F3nde", "Por Qu\u00E9", "C\u00F3mo"};

    public ArrayList<String> translatedWordList = new ArrayList(Arrays.asList(wordArray));
    /**
     * Next the method Spanish when called sets the languageName in the main method as spanish and
     * sets the spanish translatedWordList as the one to be used in the main method for the rest of the program.
     */
    public Spanish(){
        super.languageName = this.languageName;
        super.translatedWordList = this.translatedWordList;
    }
    /**
     * The createCharacter method then returns the Spanish character
     * @return
     */
    public Character createCharacter() {
        return new Germany();
    }
    /**
     * Lastly the getWordList() returns the Spanish translatedWordList
     * @return
     */
    @Override
    public ArrayList<String> getWordList() {
        return translatedWordList;
    }
}
