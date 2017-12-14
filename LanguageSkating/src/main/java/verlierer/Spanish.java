package verlierer;
import java.util.*;

public class Spanish extends Language{
    public String[] wordArray = new String[] {"Hola", "Adi\u00F3s", "S\u00ED",
     "No", "Gracias", "Bueno/a", "Malo/a", "No", "contento/a", 
     "triste", "Qui\u00E9n", "Qu\u00E9", "Cuando", "Donde", "Por Qu\u00E9", "C\u00F3mo"};

    public  ArrayList<String> spanishWordList = new ArrayList(Arrays.asList(wordArray));

    public Spanish(){

    }

    public Character createCharacter() {
        return new Spain();
    }

    @Override
    public ArrayList<String> getWordList() {
        return spanishWordList;
    }
}
