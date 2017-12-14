package verlierer;
import java.util.*;

public abstract class Language {

    public static String[] words = new String[] {"Hello", "Goodbye", "Yes",
            "No", "Thanks", "Good", "Bad", "Not", "Happy",
            "Sad", "Who", "What", "When", "Where", "Why", "How"};

    public static ArrayList<String> wordList = new ArrayList(Arrays.asList(words));
    public ArrayList<String> learnedEnglishWords = new ArrayList<String>();
    public ArrayList<String> learnedWords = new ArrayList<String>();

    public abstract Character createCharacter();
    /*public Language setLanguage(String s){
        if (s.equals("germany")){
            return new German();
        }
        else if (s.equals("japan")){
            return new Japan();
        }
        else if (s.equals("china")){
            return new China();
        }
        else if (s.equals("spain")){
            return new Spain();
        }
        else{
            return null;
        }
    }*/

    public void genRandList() {
        for (int i=0; i<3; i++) {
            Random rand = new Random();
            int  n = rand.nextInt(wordList.size());
            System.out.println(wordList.get(n));
            learnedEnglishWords.add(wordList.get(n));
            wordList.remove(n);
            System.out.println(getWordList().get(n));
            learnedWords.add(getWordList().get(n));
            getWordList().remove(n);
        }
    }

    public ArrayList<String> getLearnedWords(){
        return learnedWords;
    }

    public ArrayList<String> getLearnedEnglishWords() {
        return learnedEnglishWords;
    }

    public abstract ArrayList<String> getWordList();

}
