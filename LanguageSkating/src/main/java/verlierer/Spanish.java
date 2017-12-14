package verlierer;

import java.util.*;

public class Spanish extends Language{
    String languageName = "Spanish";
    public static String[] wordArray = new String[] {"Hola", "Adi\u00F3s", "S\u00ED",
            "No", "Gracias", "Bueno/a", "Malo/a", "No", "Contento/a",
            "Triste", "Qui\u00E9n", "Qu\u00E9", "Cu\u00E1ndo", "D\u00F3nde", "Por Qu\u00E9", "C\u00F3mo"};

    public ArrayList<String> spainWordList = new ArrayList(Arrays.asList(wordArray));

    public Spanish(){
        super.languageName = this.languageName;
    }

    public Character createCharacter() {
        return new Germany();
    }

    @Override
    public ArrayList<String> getWordList() {
        return spainWordList;
    }
}
