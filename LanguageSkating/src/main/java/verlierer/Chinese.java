package verlierer;
import java.util.*;

public class Chinese extends Language{
    public String[] wordArray = new String[] {"\u4f60\u597d", "\u518d\u89c1", 
     "\u662f", "\u6c92\u6709", "\u8C22\u8C22", "\u597d", "\u574f", "\u4e0d", 
     "\u5feb\u6a02", "\u50b7\u5fc3", "\u8ab0", "\u4ec0\u9ebc", 
     "\u4ec0\u9ebc\u6642\u5019", "\u54ea\u88e1", "\u70ba\u4ec0\u9ebc", 
     "\u600e\u9ebc\u6a23"};

    public  ArrayList<String> chineseWordList = new ArrayList(Arrays.asList(wordArray));

    public Chinese(){

    }

    public Character createCharacter() {
        return new China();
    }

    @Override
    public ArrayList<String> getWordList() {
        return chineseWordList;
    }
}
