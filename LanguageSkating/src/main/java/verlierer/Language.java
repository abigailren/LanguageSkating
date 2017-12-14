package verlierer;
import java.util.*;

public interface Language {

    public static String[] words = new String[] {"Hello", "Goodbye", "Yes",
            "No", "Thanks", "Good", "Bad", "Not", "Happy",
            "Sad", "Who", "What", "When", "Where", "Why", "How"};

    public static ArrayList<String> wordList = new ArrayList(Arrays.asList(words));

    public Character createCharacter();
    public Language setLanguage();
    public ArrayList<String> genRandList();
}
