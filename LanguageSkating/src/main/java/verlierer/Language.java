package verlierer;
import java.util.*;

public abstract class Language {
    String languageName;
    final String[] words = new String[] {"Hello", "Goodbye", "Yes",
            "No", "Thanks", "Good", "Bad", "Not", "Happy",
            "Sad", "Who", "What", "When", "Where", "Why", "How"};

    ArrayList<String> wordList = new ArrayList(Arrays.asList(words));
    ArrayList<String> translatedWordList;
    ArrayList<String> quizzedEnglishWords = new ArrayList<String>();
    ArrayList<String> quizzedWords = new ArrayList<String>();

    public abstract Character createCharacter();

    /**
     * randomly generates a list of words to be used in Question
     * learnedEnglishWords has a list of words to be tested on
     * learnedWords is the corresponding list of words of learnedEnglishWords
     */


    public void genRandList() {
        ArrayList<String> temp1 = wordList;
        ArrayList<String> temp2 = new ArrayList<String>(translatedWordList);

        for (int i=0; i<5; i++) {

            Random rand = new Random();
            int  n = rand.nextInt(temp1.size());
            System.out.println(temp1.get(n));
            quizzedEnglishWords.add(temp1.get(n));
            temp1.remove(n);
            System.out.println("Before "+translatedWordList.size());
            System.out.println(temp2.get(n));
            quizzedWords.add(temp2.get(n));
            temp2.remove(n);
            System.out.println("After " +translatedWordList.size());
        }
    }

    /**
     * get getLearnWords
     */

    public ArrayList<String> getQuizzedWords(){
        return quizzedWords;
    }

    /**
     *  get learnedEnglishWords
     */

    public ArrayList<String> getQuizzedEnglishWords() {
                return quizzedEnglishWords;
            }

    /**
     * abstract method to get translated version of String WORDS from subclass
     */

    public abstract ArrayList<String> getWordList();

    /**
     * gets the english list of words wordList
     */

    public ArrayList<String> getList(){
        return wordList;
    }


    /**
     * returns the name of the language
     */

    public String getLanguageName(){return languageName;}


}
