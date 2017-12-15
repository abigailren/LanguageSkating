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
    GLabel answer;
    Plot plot = new Plot();


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
        //while(selection.equals(null)){
        waitForClick();
        //removeAll();
        System.out.println("AHHHHHH");
       // while (selection.equals(null)){
        removeAll();
        //}
        Language language = setLanguage(selection);
        language.genRandList();
        englishWords = language.getQuizzedEnglishWords();
        learnedWords = language.getQuizzedWords();


        addScene(plot.scene(plot.firstScene));
        waitForClick();
        removeAll();
        addScene(plot.scene(plot.secondScene));
        waitForClick();
        removeAll();
        addScene(plot.scene(plot.thirdScene));
        waitForClick();
        removeAll();
        //add(plot);

        //for (int )
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
        List<String> words = question.getWords();
        for (int i = 0;i<words.size();i++){
            GLabel randAnswer = new GLabel(words.get(i));
            randAnswer.setFont("*-*-30");
            if (i%2==0){
                add(randAnswer,200,450+(i/2)*50);
            }
            else{
                add(randAnswer,500,450+(i/2)*50);
            }
            if (words.get(i).equals(question.getTranslation())){
                answer = randAnswer;
            }
        }

    }

    public void mouseClicked(MouseEvent e) {
        GPoint last = new GPoint(e.getPoint());
        gobj = getElementAt(last);
        if (gobj.equals(open.germany) || gobj.equals(open.germanyBio)) {
            selection = "germany";
        } else if (gobj.equals(open.japan) || gobj.equals(open.japanBio)) {
            selection = "japan";
        } else if (gobj.equals(open.china) || gobj.equals(open.chinaBio)) {
            selection = "china";
        } else if (gobj.equals(open.spain) || gobj.equals(open.spainBio)) {
            selection = "spain";
        } else if (gobj.equals(answer)) {
            removeAll();
            GLabel eh = new GLabel("YOU WIN!", 450, 350);
            eh.setFont("*-*-50");
            add(eh);
        } else {
            removeAll();
            add(new GLabel("YOU LOSE!", 500, 400));
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

    public void addScene(List<Paragraph> scene){
        for (int i=0;i<scene.size();i++){
            add(scene.get(i),50,50+i*50);
        }
    }
}
