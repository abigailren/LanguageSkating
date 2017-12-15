package verlierer;

import acm.graphics.*;
import acm.program.*;
import java.awt.*;
import acm.util.*;
import java.util.*;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.KeyListener;
import java.util.List;

//The minigame

public class MiniGame extends GraphicsProgram{


    //The GOvals for the checkpoints needed in the game
    private GOval checkpoint1, checkpoint2;
    private final GObject skater;
    private final GImage rink;
    private boolean skatingAlong;
    private GRect questionBox;
    private Question question;
    Language language;
    GLabel answer;
    int score;
    ArrayList<String> englishWords;
    ArrayList<String> learnedWords;




    public MiniGame() {
        this.skater = new GImage("skaterIcon.png");
        this.rink = new GImage("rink.png",0,0);
        this.language = new German();
    }


    /**
     * run:
     *
     * Invoked by the start method in main,
     * causes execution to continue from here.
     */

    public void run () {
        //5 checkpoints should be reached in order to finish.
        int checkpoints = 5;
        //setUpGame() called before the game is run, so that the background image
        //of the ice rink is uploaded before the game is started
        setUpGame();

        addMouseListeners();
        //everytime that the player has not yet reached 5 checkpoints run the game
        for(int i = 0; i < checkpoints; i++){
            runGame();
        }
//next count how many checkpoints have been passed, if it has reached 5 then the skater has finished

        GLabel victoryMessage =
                new GLabel("YOU MADE IT!", 100, 300);
        victoryMessage.setFont("SansSerif-36");
        victoryMessage.setColor(Color.MAGENTA);
        add(victoryMessage);
        skater.setVisible(false);
        System.out.println("score " +score);
        waitForClick();
        victoryMessage.setVisible(false);

    }
    //if 30 seconds have gone by and the skater hasn't moved then game over
    //A message is displayed saying game over


    /**
     * setUpGame:
     *
     * Called by the run method to set up the initial scene.
     * Creates the background image and adds KeyListeners
     */
    private void setUpGame() {
        //set rink as the background image, and set the location at the origin
        //as the size of the image rink is the same as that of the application
        // in order to cover the the full background
        add(rink);
        rink.setSize(1000,800);
        rink.sendToBack();
        addKeyListeners();
        //add KeyListeners to navigate the rink
        /*this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                skateAlong(e);
            }
        });*/
        //skater starts in center
        GLabel getReady =
                new GLabel("Are You Ready?", 100, 300);
        getReady.setFont("SansSerif-36");
        getReady.setColor(Color.MAGENTA);
        add(getReady);
        waitForClick();
        getReady.setVisible(false);
        add(skater,150, 150);
        language.genRandList();
        englishWords = language.getQuizzedEnglishWords();
        learnedWords = language.getQuizzedWords();
        score=0;
    }


    private void runGame(){

        setCheckpoints();
        letsSkate();

    }

    private void letsSkate(){
        while(skatingAlong = true){
            double c2x = checkpoint2.getX();
            double c2y = checkpoint2.getY();

            skater.sendToFront();
            if(skater.contains(c2x,c2y)){
                checkpoint1.setVisible(false);
                checkpoint2.setVisible(false);
                questionTime();

                waitForClick();
                break;
            }
        }
    }

    private void questionTime() {
        createQuestionBox();
        addQuestion();

    }

     private void createQuestionBox(){
        questionBox = new GRect(250, 200, 500, 400);
        questionBox.setFilled(true);
        questionBox.setFillColor(Color.white);
        add(questionBox);
    }
        private void addQuestion(){

            question = new Question(language);
            System.out.println(language.getWordList().size());
            GLabel qImage = new GLabel(question.printQuestion(), 300, 250);
            qImage.setFont("*-*-30");
            qImage.setColor(Color.black);
            qImage.sendToFront();
            question.add(qImage);
            List<String> words = question.getWords();
            for (int i = 0; i < words.size(); i++) {
                GLabel randAnswer = new GLabel(words.get(i));
                randAnswer.setFont("*-*-30");
                if (i % 2 == 0) {
                    question.add(randAnswer, 200, 450 + (i / 2) * 50);
                } else {
                    question.add(randAnswer, 500, 450 + (i / 2) * 50);
                }
                if (words.get(i).equals(question.getTranslation())) {
                    answer = randAnswer;
                }
            }
            englishWords.remove(question.getEnglish());
            learnedWords.remove(question.getTranslation());
            add(question);
        }

    private GOval createCheckpoint(){
        GOval tempCheckpoint =  new GOval(20,20);
        tempCheckpoint.setFilled(true);
        tempCheckpoint.setColor(Color.YELLOW);
        return tempCheckpoint;

    }

    private void setCheckpoints(){
        //find the location of the skater

        RandomGenerator rgen;
        double randyX;
        double randyY;
        double skaterX = skater.getX();
        double skaterY = skater.getY();
        //find a random
        rgen = new RandomGenerator();
        randyX = rgen.nextDouble(100,900);
        randyY = rgen.nextDouble(100,700);

        checkpoint1 = createCheckpoint();
        checkpoint1.setColor(Color.RED);
        checkpoint2 = createCheckpoint();

        add(checkpoint1,skaterX,skaterY);
        add(checkpoint2,randyX,randyY);


        //checkpoint1.setLocation(skaterLocation);
        //checkpoint2.setLocation(randyX,randyY);

    }

    public void keyPressed(KeyEvent e) {
        double dx = skater.getX();
        double dy = skater.getY();
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                remove(skater);
                skater.move(0, -15);
                add(skater);
                break;
            case KeyEvent.VK_DOWN:
                skater.move(0, 15);
                add(skater);
                break;
            case KeyEvent.VK_LEFT:
                skater.move(-15, 0);
                add(skater);
                break;
            case KeyEvent.VK_RIGHT:
                skater.move(15, 0);
                add(skater);
                break;
        }
    }
    /*
    public void skateAlong (KeyEvent e) {
        double dx = skater.getX();
        double dy = skater.getY();
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                remove(skater);
                skater.move(dx, (dy - 5));
                add(skater);
                break;
            case KeyEvent.VK_DOWN:
                skater.move(dx, (dy + 5));
                break;
            case KeyEvent.VK_LEFT:
                skater.move((dx - 5), dy);
                break;
            case KeyEvent.VK_RIGHT:
                skater.move((dx + 5), dy);
                break;
        }
    }*/


 public void mouseClicked(MouseEvent e) {
     GPoint last = new GPoint(e.getPoint());
     GObject gobj = getElementAt(last);
     if (gobj.equals(answer)) {
         score+=5;
         /*GLabel eh = new GLabel("YOU WIN!", 450, 350);
         eh.setFont("*-*-50");
         add(eh);
         */
     } else {
         score+=1;

     }
     remove(question);
     remove(questionBox);
 }

 public static void main(String[] args) {
     new MiniGame().start();
 }

}