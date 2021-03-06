package verlierer;
import java.util.*;

/**
 * Implements array of Japanese words corresponding to that of Language
 */
public class Japanese extends Language{
    /**
     * String declaring that this language is Japanese, followed by the wordArray listing all
     * the japanese equivalents to the english words being taught,
     * having to use unicode for letters not used in the english alphabet.
     * The Japanese we write is in hirigana.
     * That wordArray is put into an ArrayList.
     */
    String languageName = "Japanese";
    /*public String[] wordArray = new String[] {"\u3053\u3093\u306B\u3061\u306F",
            "\u3055\u3088\u306A\u3089", "\u306F\u3044", "\u3044\u3044\u3048",
            "\u3042\u308A\u304C\u3068\u3046", "\u3044\u3044", "\u308F\u308B\u3044",
            "\u306A\u3044", "\u3046\u308C\u3057\u3044","\u304B\u306A\u3057\u3044",
            "\u3060\u308C","\u306A\u306B", "\u3044\u3064", "\u3069\u3053\u3067",
            "\u3069\u3046\u3057\u3066", "\u3069\u3046\u3084\u3063\u3066"};*/
    public static String[] wordArray = new String[] {"\u3053\u3093\u306B\u3061\u306F (konnichiwa)",
            "\u3055\u3088\u3046\u306A\u3089 (say\u014Dnara)", "\u306F\u3044 (hai)", "\u3044\u3044\u3048 (iie)",
            "\u3042\u308A\u304C\u3068\u3046 (arigat\u014D)", "\u3044\u3044 (ii)", "\u308F\u308B\u3044 (warui)",
            "\u306A\u3044 (nai)", "\u3046\u308C\u3057\u3044 (ureshii)", "\u304B\u306A\u3057\u3044 (kanashii)",
            "\u3060\u308C (dare)", "\u306A\u306B (nani)", "\u3044\u3064 (itsu)", "\u3069\u3053\u3067 (dokode)",
            "\u3069\u3046\u3057\u3066 (d\u014Dshite)", "\u3069\u3046\u3084\u3063\u3066 (d\u014Dyatte)"};  ;
    public  ArrayList<String> translatedWordList = new ArrayList(Arrays.asList(wordArray));

    /**
     * Next the method Japanese when called sets the languageName in the main method as japanese and
     * sets the japanese translatedWordList as the one to be used in the main method for the rest of the program.
     */
    public Japanese(){
        super.languageName = this.languageName;
        super.translatedWordList = this.translatedWordList;
    }
    /**
     * The createCharacter method then returns the Japanese character
     * @return
     */
    public Character createCharacter() {
        return new Japan();
    }
    /**
     * Lastly the getWordList() returns the Japanese translatedWordList
     * @return
     */
    @Override
    public ArrayList<String> getWordList() {
        return translatedWordList;
    }
}