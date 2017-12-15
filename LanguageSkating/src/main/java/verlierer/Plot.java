package verlierer;

import acm.graphics.*;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Plot extends GCompound{

    Language language;
    ArrayList<String> words;
    ArrayList<String> engWords;

    String[] firstScene;

    String[] secondScene;

    String[] thirdScene;



    public Plot(Language language){
        this.language = language;
        this.words = language.getWordList();
        this.engWords = language.getList();
        System.out.println(engWords.indexOf("Hello"));
        System.out.println(engWords.indexOf("Yes"));
        firstScene = new String[]{words.get(engWords.indexOf("Hello")) + " my favoritest trainer. How are you?",
                "I am doing well. You know, it’s kind of strange. I’ve been your trainer for 5 years, "+
                        "but I haven’t really been able to pick up on much of your language. You seem to "+
                        "speak in English the majority of the time. "+words.get(engWords.indexOf("Hello"))+
                        " obviously means hello, but is there anything else you can teach me?",
                "Of course my secret love.  We’ll start you off with some basic words. "+
                       words.get(engWords.indexOf("Yes"))+  " means yes,  and "+words.get(engWords.indexOf("No"))+
                        " means no. Easy enough right?\n",
                words.get(engWords.indexOf("Yes")) + " and "+words.get(engWords.indexOf("No"))+
                        ". I think I can remember at least that much. *Phone rings, answers call*. "+
                        "Well I have to run. Some turtles got onto the ice again. Can you teach me the "+
                        "word for goodbye before I go.\n","Naturally. It’s "+words.get(engWords.indexOf("Goodbye")) +".\n",
                words.get(engWords.indexOf("Goodbye")) +
                                " to you.\n"};

        secondScene = new String[]{words.get(engWords.indexOf("How"))+" have you been, my most favoritest trainer?\n",
                words.get(engWords.indexOf("How"))+"?\n",
                "How of course, my dear.\n",
                "That makes sense. I probably should have been able to see that from context. Questions are pretty "+
                        "important for languages. Can you teach me how to question authority?\n",
                "By all means, my now less secret love. "+words.get(engWords.indexOf("How"))+
                        " you now know to be how, "+ words.get(engWords.indexOf("Who"))+" is  who, "+
                        words.get(engWords.indexOf("What"))+" is what, "+
                        words.get(engWords.indexOf("When"))+" is when, " +
                        words.get(engWords.indexOf("Where"))+" is where, and " +
                        words.get(engWords.indexOf("Why"))+" is why. ",
                "That’s a lot to remember. "+ "Could you go over that once more?\n",
                "Sure thing. "+words.get(engWords.indexOf("How"))+" is how, "+
                        words.get(engWords.indexOf("Who"))+" is  who, "+
                        words.get(engWords.indexOf("What"))+" is what, "+
                        words.get(engWords.indexOf("When"))+" is when, " +
                        words.get(engWords.indexOf("Where"))+" is where, and " +
                        words.get(engWords.indexOf("Why"))+" is why. \n",
                words.get(engWords.indexOf("How"))+" is how, "+
                        words.get(engWords.indexOf("Who"))+" is  who, "+
                        words.get(engWords.indexOf("What"))+" is what, "+
                        words.get(engWords.indexOf("When"))+" is when, " +
                        words.get(engWords.indexOf("Where"))+" is where, and " +
                        words.get(engWords.indexOf("Why"))+" is why. ",
                        "Thank you so much for teaching me.\n",
                words.get(engWords.indexOf("Thanks"))+" for taking the time to try and learn.\n"};

        thirdScene = new String[]{"Hi\n","How are you?\n",words.get(engWords.indexOf("Happy")) + ".",
                words.get(engWords.indexOf("Happy")) + "?",
                "It means happy. I'm happy because I had a "+
                        words.get(engWords.indexOf("Good")) + " showing.",
                words.get(engWords.indexOf("Good")) + "?",
                "It means good. I had a good showing.",
                "Yeah you definitely didn’t have a  bad showcase.",
                "It was definitely not a "+words.get(engWords.indexOf("Bad")) + " showcase. So I don’t feel "+
                        words.get(engWords.indexOf("Sad")) + ".",
                words.get(engWords.indexOf("Bad")) + "? "+
                words.get(engWords.indexOf("Sad")) + "?","Bad and sad my friend.",
                words.get(engWords.indexOf("Thanks")) + "."};
        //addScene(scene(secondScene));
        //addScene(scene(thirdScene));
    }


    public List<Paragraph> scene(String[] a, int fontSize){
        List<Paragraph> scene = new ArrayList<Paragraph>();
        for (int i=0;i<a.length;i++){
            Paragraph p = new Paragraph(80,a[i]);
            p.setFont(fontSize);
            if (i%2==0){
                p.setColor(Color.BLACK);
            }
            else{
                p.setColor(Color.BLUE);
            }
            scene.add(p);

        }
        return scene;
    }



}
