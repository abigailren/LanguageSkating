package verlierer;
import java.util.*;

public class Japanese extends Language{
    public String[] wordArray = new String[] {{"\u3053\u3093\u306B\u3061\u306F", 
      "\u3055\u3088\u306A\u3089", "\u306F\u3044", "\u3044\u3044\u3048", 
      "\u3042\u308A\u304C\u3068\u3046", "\u3044\u3044", "\u308F\u308B\u3044", 
      "\u306A\u3044", "\u3046\u308C\u3057\u3044","\u304B\u306A\u3057\u3044", 
      "\u3060\u308C","\u306A\u306B", "\u3044\u3064", "\u3069\u3053\u3067", 
      "\u3069\u3046\u3057\u3066", "\u3069\u3046\u3084\u3063\u3066"};

    public  ArrayList<String> japanWordList = new ArrayList(Arrays.asList(wordArray));

    public Japanese(){

    }

    public Character createCharacter() {
        return new Japan();
    }

    @Override
    public ArrayList<String> getWordList() {
        return japanWordList;
    }
}

