package verlierer;
import java.util.*;

public class German implements Language{
    public String[] wordArray = new String[] {"Hallo", "Auf Wiedersehen", "Ja",
            "Nien", "Danke", "Gut", "Schlecht", "Nicht", "gl\u00FCcklich",
            "traurig", "Wer", "Was", "Wo", "Wann", "Wieso", "Wie"};

    public  ArrayList<String> germanWordList = new ArrayList(Arrays.asList(wordArray));
    public ArrayList<String> learnedWords = new ArrayList<String>();
    public ArrayList<String> learnedGermanWords = new ArrayList<String>();
    public German(){

    }

    public Character createCharacter() {
        return new Germany();
    }

    public Language setLanguage() {
        return this;
    }

    public ArrayList<String> genRandList() {
        for (int i=0; i<3; i++) {
            Random rand = new Random();
            int  n = rand.nextInt(wordList.size());
            System.out.println(wordList.get(n));
            learnedWords.add(wordList.get(n));
            wordList.remove(n);
            System.out.println(germanWordList.get(n));
            learnedGermanWords.add(germanWordList.get(n));
            germanWordList.remove(n);
        }
        return learnedWords;
    }
}
