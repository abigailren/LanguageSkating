package wordgameyay;
import wordarrays.*;
import java.util.*;

public class WordGameYay {

    static String word;
    static List<String> words = new ArrayList();
    static List<String> germanwordList = new ArrayList(Arrays.asList(WordArrays.spanishWords));
    static List<String> wordList = new ArrayList(Arrays.asList(WordArrays.words));    
    
    public static void selectEnglish() {
        Random rand = new Random();
        int n = rand.nextInt(wordList.size());
        word = wordList.get(n);
    }
    
    public static void arrayofWords() {
        words.add(germanwordList.get(wordList.indexOf(word)));
        Random rand = new Random();
        List<String> gwords = germanwordList;
        gwords.remove(words.get(0));
        for (int i=1; i<4; i++) {
            int n = rand.nextInt(gwords.size());
            words.add(gwords.get(n));
            gwords.remove(n);
        }
        List<String> temp = new ArrayList();
        for (int i=0; i<4; i++) {
            int n = rand.nextInt(words.size());
            temp.add(words.get(n));
            words.remove(n);
        }
        words = temp;
    }
    
    public static void main(String[] args) {
        selectEnglish();
        arrayofWords();
        System.out.println(word);
        System.out.println(words);
    }
    
}
