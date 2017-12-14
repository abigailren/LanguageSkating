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
        /*Language language = new German();
        ArrayList<String> wordList = language.genRandList();
        System.out.println(wordList.get(0));*/
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
        add(new GLabel("English",100,70));
        add(new GLabel(language.getLanguageName(),200,70));
        for (int i = 0; i< 3; i++) {
            add(new GLabel(englishWords.get(i)), 100, i * 20 + 100);
            add(new GLabel(learnedWords.get(i)), 200, i * 20 + 100);
        }
    }

    public void mouseClicked(MouseEvent e) {
        GPoint last = new GPoint(e.getPoint());
        gobj = getElementAt(last);
        if (gobj.equals(open.germany)) {
            selection="germany";
            System.out.println(selection);
        }
        else if (gobj.equals(open.japan)) {
            selection="japan";
            System.out.println(selection);
        } else if (gobj.equals(open.china)) {
            add(new GLabel("Yolo", 450, 300));
            selection="china";
            System.out.println(selection);
        } else if (gobj.equals(open.spain)) {
            add(new GLabel("Lol", 650, 300));
            selection="spain";
            System.out.println(selection);
        }

    }

    public void mouseMoved(MouseEvent e) {
        if (e == null) {
            remove(open.yo);
            remove(open.yo1);
            remove(open.yo2);
            remove(open.yo3);
        } else {
            GPoint last = new GPoint(e.getPoint());
            if (last != null) {

                gobj = getElementAt(last);
                if (gobj == null) {
                    remove(open.yo);
                    remove(open.yo1);
                    remove(open.yo2);
                    remove(open.yo3);
                } else {
                    if (gobj.equals(open.germany)) {

                        add(open.yo);

                    } else if (gobj.equals(open.japan)) {
                        add(open.yo1);
                    } else if (gobj.equals(open.china)) {
                        add(open.yo2);
                    } else if (gobj.equals(open.spain)) {
                        add(open.yo3);
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
        }/*
        else if (s.equals("china")){
            return new China();
        }
        else if (s.equals("spain")){
            return new Spain();
        }*/
        else{
            return null;
        }
    }
}
