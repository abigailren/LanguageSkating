package verlierer;
import acm.graphics.*;
import java.util.*;

public class Question extends GCompound{

    String english, translation, languageName;
    List<String> words = new ArrayList();
    List<String> translationWordList, learnedWords, learnedTranslatedWords;

    public Question(Language language) {
        this.learnedWords = language.getQuizzedEnglishWords();
        this.learnedTranslatedWords = language.getQuizzedWords();
        this.translationWordList = language.getWordList();
        this.languageName = language.getLanguageName();
    }

    public void selectEnglish() {
        Random rand = new Random();
        int n = rand.nextInt(learnedWords.size());
        english = learnedWords.get(n);
    }

    public void arrayOfWords() {
        words.add(learnedTranslatedWords.get(learnedWords.indexOf(english)));
        Random rand = new Random();
        List<String> gwords = translationWordList;
        translation = words.get(0);
        gwords.remove(translation);
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

    public String printQuestion() {
        selectEnglish();
        arrayOfWords();
        String word = english.toLowerCase();
        return "What is \"" + word + "\" translated into " + languageName+"?";
    }

    public List<String> getWords(){
        return words;
    }

    public String getTranslation() {
        return translation;
    }
}
