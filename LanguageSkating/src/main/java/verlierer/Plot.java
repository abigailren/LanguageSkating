package verlierer;

import acm.graphics.*;
import java.util.*;

public class Plot extends GCompound{
    String[] firstScene = {"(hello) my favoritest trainer. How are you?",
            "I am doing well. You know, it’s kind of strange. I’ve been your trainer for 5 years, "+
                    "but I haven’t really been able to pick up on much of your language. You seem to "+
                    "speak in English the majority of the time. (hello) obviously means hello, but is there "+
                    "anything else you can teach me?",
            "Of course my secret love.  We’ll start you off with some basic words. (yes) means yes, "+
                    "and (no) means no. Easy enough right?\n",
            "(yes) and (no). I think I can remember at least that much. *Phone rings, answers call*. "+
                    "Well I have to run. Some turtles got onto the ice again. Can you teach me the "+
                    "word for goodbye before I go.\n","Naturally. It’s (goodbye).\n","(goodbye) to you.\n"};

    String[] secondScene = {"(how) have you been, my most favoritest trainer?\n","(how)?\n",
            "How of course, my dear.\n",
            "That makes sense. I probably should have been able to see that from context. Questions are pretty "+
                    "important for languages. Can you teach me how to question authority?\n",
            "By all means, my now less secret love. (how) you now know to be how,  (who) is the word for who, "+
                    "(what) for what, (when) for when, (where) for where, and (why) for why.\n",
            "That’s a lot to remember. "+ "Could you go over that once more?\n",
            "Sure thing. (how) is how,  _____ is  who, (what) is what, ____ is when, ____ is where, and _____ is why.\n",
            "(how) is how,  _____ is  who, (what) is what, ____ is when, ____ is where, and _____ is why. "+
                    "Thank you so much for teaching me.\n","(thanks) for taking the time to try and learn.\n"};

    String[] thirdScene = {"Hi\n","How are you?\n","(happy)\n","(happy)?",
            "It means happy. I'm happy because I had a  _____ showing.","_____?","It means good. I had a good showing.",
            "Yeah you definitely didn’t have a  bad showcase.",
            "It was definitely not a ____ showcase. So I don’t feel ___.","___?___?","Bad and sad my friend.",
            "(thanks)"};



    public Plot(){
        addScene(scene(firstScene));
        //addScene(scene(secondScene));
        //addScene(scene(thirdScene));
    }


    public List<Paragraph> scene(String[] a){
        List<Paragraph> scene = new ArrayList<Paragraph>();
        for (int i=0;i<a.length;i++){
            scene.add(new Paragraph(100,a[i]));
        }
        return scene;
    }

    public void addScene(List<Paragraph> scene){
        for (int i=0;i<scene.size();i++){
            add(scene.get(i),50,50+i*50);
        }
    }
}
