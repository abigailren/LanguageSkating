package verlierer;
import java.util.*;

public abstract class Language {
    String languageName;
    String[] words = new String[] {"Hello", "Goodbye", "Yes",
            "No", "Thanks", "Good", "Bad", "Not", "Happy",
            "Sad", "Who", "What", "When", "Where", "Why", "How"};

    ArrayList<String> wordList = new ArrayList(Arrays.asList(words));
    ArrayList<String> translatedWordList = new ArrayList<String>();
    ArrayList<String> quizzedEnglishWords = new ArrayList<String>();
    ArrayList<String> quizzedWords = new ArrayList<String>();

    public abstract Character createCharacter();

    //randomly generates a list of words to be used in Question
    //learnedEnglishWords has a list of words to be tested on
    //learnedWords is the corresponding list of words of learnedEnglishWords
    public void genRandList() {
        for (int i=0; i<3; i++) {
            Random rand = new Random();
            int  n = rand.nextInt(wordList.size());
            System.out.println(wordList.get(n));
            quizzedEnglishWords.add(wordList.get(n));
            wordList.remove(n);
            System.out.println(getWordList().get(n));
            quizzedWords.add(getWordList().get(n));
            getWordList().remove(n);
        }
    }

    //get getLearnWords
    public ArrayList<String> getQuizzedWords(){
        return quizzedWords;
    }

    //get learnedEnglishWords
    public ArrayList<String> getQuizzedEnglishWords() {
                return quizzedEnglishWords;
            }

    //abstract method to get translated version of String WORDS from subclass
    public abstract ArrayList<String> getWordList();

    //returns the name of the language
    public String getLanguageName(){return languageName;}

}
