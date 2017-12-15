package verlierer;
import acm.graphics.*;
import acm.program.*;

import java.awt.event.MouseEvent;
import java.util.*;

public class Main extends GraphicsProgram{
    private GObject gobj;
    String selection;
    Opening open = new Opening();
    ArrayList<String> englishWords = new ArrayList<String>();
    ArrayList<String> learnedWords = new ArrayList<String>();


    public static void main(String[] args){
        new Main().start(args);
    }

    public void run(){

        this.setSize(1000,800);
        /*Language language = new German();
        ArrayList<String> wordList = language.genRandList();
        System.out.println(wordList.get(0));*/
        add(open.instructions);
        add(open.germany);
        add(open.japan);
        add(open.china);
        add(open.spain);
        System.out.println(selection);
        addMouseListeners();
        waitForClick();
        removeAll();
        System.out.println("AHHHHHH");
       // while (selection.equals(null)){
        //    removeAll();
        //}
        Language language = setLanguage(selection);
        language.genRandList();
        englishWords = language.getLearnedEnglishWords();
        learnedWords = language.getLearnedWords();
        GLabel english = new GLabel("English",50,100);
        english.setFont("*-*-60");
        add(english);
        GLabel foreign = new GLabel(language.getLanguageName(),350,100);
        foreign.setFont("*-*-60");
        add(foreign);
        for (int i = 0; i< 3; i++) {
            GLabel engWord = new GLabel(englishWords.get(i));
            GLabel foreignWord = new GLabel(learnedWords.get(i));
            engWord.setFont("*-*-40");
            add(engWord, 50, i * 70 + 170);
            foreignWord.setFont("*-*-40");
            add(foreignWord, 350, i * 70 + 170);
        }
        Question question = new Question(language);
        GLabel qImage = new GLabel(question.printQuestion(),200,400);
        qImage.setFont("*-*-30");
        add(qImage);
    }

    public void mouseClicked(MouseEvent e) {
        GPoint last = new GPoint(e.getPoint());
        gobj = getElementAt(last);
        if (gobj.equals(open.germany)||gobj.equals(open.germanyBio)) {
            selection="germany";
        }
        else if (gobj.equals(open.japan)||gobj.equals(open.japanBio)) {
            selection="japan";
        } else if (gobj.equals(open.china)||gobj.equals(open.chinaBio)) {
            selection="china";
        } else if (gobj.equals(open.spain)||gobj.equals(open.spainBio)) {
            selection="spain";
        }

    }

    public void mouseMoved(MouseEvent e) {
        if (e == null) {
            remove(open.germanyBio);
            remove(open.japanBio);
            remove(open.chinaBio);
            remove(open.spainBio);
        } else {
            GPoint last = new GPoint(e.getPoint());
            if (last != null) {

                gobj = getElementAt(last);
                if (gobj == null) {
                    remove(open.germanyBio);
                    remove(open.japanBio);
                    remove(open.chinaBio);
                    remove(open.spainBio);
                } else {
                    if (gobj.equals(open.germany)) {

                        add(open.germanyBio);

                    } else if (gobj.equals(open.japan)) {
                        add(open.japanBio);
                    } else if (gobj.equals(open.china)) {
                        add(open.chinaBio);
                    } else if (gobj.equals(open.spain)) {
                        add(open.spainBio);
                    }
                }
            }

        }

    }

    public Language setLanguage(String s){
        if (s.equals("germany")){
            return new German();
        }
        else if (s.equals("japan")){
            return new Japanese();
        }
        else if (s.equals("china")){
            return new Chinese();
        }
        else if (s.equals("spain")){
            return new Spanish();
        }
        else{
            return null;
        }
    }
}
