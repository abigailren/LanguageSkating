package verlierer;

import acm.graphics.*;
import acm.program.*;
import java.awt.*;
import acm.util.RandomGenerator;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.KeyListener;
import java.util.List;


public class MiniGame extends GraphicsProgram{


    /**
     * The GOvals for the checkpoints needed in the game.
     * The GObject is the image of the skater that is controlled by the player.
     * The Gimage is used for the background image that resembles an ice skating rink.
     * The GRect is for the pop-up question box that holds the questions on the language for the player.
     * The language chosen at the beginning will be continued in the minigame.
     * The final GLabel is created as the correct answer to the question in the popup box.
     */
    private GOval checkpoint1, checkpoint2;
    private final GObject skater;
    private final GImage rink;
    private boolean skatingAlong;
    private GRect questionBox;
    Language language;
    GLabel answer;


    /**
     * We call MiniGame() in order to declare what the images for the skater and the rink are
     * and declare the language that will be used throughout.
     * It also declares the coordinates for rink.
     */
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
     *
     * 5 checkpoints should be reached in order to finish.
     * setUpGame() called before the game is run, so that the background image
     * of the ice rink is uploaded before the game is started.
     * Everytime that the player has not yet reached 5 checkpoints run the game again.
     * Each time the game runs again it has to reach one less checkpoint in total than in the round before.
     *
     * Once the player has to reach no more check points a message appears, congratulating them for finishing
     * When the message appears the skater disappears and after a mouse click the message does as well.
     *
     */
    public void run () {
        int checkpoints = 5;
        setUpGame();
        for(int i = 0; i < checkpoints; i++){
            runGame();
        }
        GLabel victoryMessage =
                new GLabel("YOU MADE IT!", 100, 300);
        victoryMessage.setFont("SansSerif-36");
        victoryMessage.setColor(Color.MAGENTA);
        add(victoryMessage);
        skater.setVisible(false);
        waitForClick();
        victoryMessage.setVisible(false);
    }


    /**
     * setUpGame:
     * Add  rink as the background image, and sets the size of the rink to be equal to the window
     * Rink is sent to the back so that it doesn't interfer.
     * Add keyListeners.
     * Add a GLabel asking the player if they are ready and once they click the skater appears in the top left corner,
     * starting the game for the player.
     */
    private void setUpGame() {
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
        GLabel getReady =
                new GLabel("Are You Ready?", 100, 300);
        getReady.setFont("SansSerif-36");
        getReady.setColor(Color.MAGENTA);
        add(getReady);
        waitForClick();
        getReady.setVisible(false);
        add(skater,150, 150);
    }


    /**
     * The runGame method calls two other methods, one to position the checkpoints on the rink
     * and one to find out when the task has been achieved.
     */
    private void runGame(){
        setCheckpoints();
        letsSkate();
    }


    /**
     * The letsSkate method has a while loop that checks for whether or not the skater is still in the game
     * In order to break out from the loop and therefore from the game running the skater has to reach or
     * pass by the point from checkpoint 2.
     * Once it reaches checkpoint 2 the checkpoints disappear, the questionTime method is called and
     * once it is also completed we can break out of the while loop and complete a round of the game.
     */
    private void letsSkate(){
        while(skatingAlong = true){
            double c2x = checkpoint2.getX();
            double c2y = checkpoint2.getY();

            skater.sendToFront();
            if(skater.contains(c2x,c2y)){
                checkpoint1.setVisible(false);
                checkpoint2.setVisible(false);
                questionTime();
                break;
            }
        }
    }

    /**
     * The questionTime method calls a method to create a pop-up box for the question to be in
     * and a method to add the question to that box.
     */
    private void questionTime() {
        createQuestionBox();
        addQuestion();

    }

    /**
     * The createQuestionBox method creates a GRect that fills up roughly half of the screen and
     * is filled out in white.
     */
    private void createQuestionBox(){
        questionBox = new GRect(250, 200, 500, 400);
        questionBox.setFilled(true);
        questionBox.setFillColor(Color.white);
        add(questionBox);
    }

    /**
     * The addQuestion method creates the multiple choice question for the player based on
     * the language they chose in the beginning.
     * It creates a GLabel that prints out the question in black from one of the words from our list.
     * Then we have a for loop in order to randomize the location of the correct answer,
     * the correctly translated from english into the chosen language will be surrounded by three other possible,
     * yet incorrect answers and the player has to click one of the answers.
     * If it clicks the correct answer he is supposed to be awarded points,
     * but will be able to continue the game regarless of whether they choose the right or wrong answer.
     */
    private void addQuestion(){
            Question question = new Question(language);
            GLabel qImage = new GLabel(question.printQuestion(), 300, 250);
            qImage.setFont("*-*-30");
            qImage.setColor(Color.black);
            qImage.sendToFront();
            add(qImage);
            List<String> words = question.getWords();
            for (int i = 0; i < words.size(); i++) {
                GLabel randAnswer = new GLabel(words.get(i));
                randAnswer.setFont("*-*-30");
                if (i % 2 == 0) {
                    add(randAnswer, 200, 450 + (i / 2) * 50);
                } else {
                    add(randAnswer, 500, 450 + (i / 2) * 50);
                }
                if (words.get(i).equals(question.getTranslation())) {
                    answer = randAnswer;
                }
            }
        }

    /**
     * The createCheckpoint method creates a temporary checkpoint that is taken over after as checkpoints 1 and 2,
     * it is created in order to keep the the same qualities for each checkpoint.
     * @return
     */
    private GOval createCheckpoint(){
        GOval tempCheckpoint =  new GOval(20,20);
        tempCheckpoint.setFilled(true);
        return tempCheckpoint;
    }

    /**
     * The setCheckpoints method adds the checkpoints to the game.
     * We find the X and Y coordinates of the skater and use a random generator to calculate
     * a random X and random Y coordinate.
     * The randomized coordinates are choosen from between any X and Y values that are at least
     * 100 pixels from the borders of the application window.
     * The createCheckpoint method is called in order to create both checkpoints 1 and 2.
     * Checkpoint 1 is filled out in red and Checkpoint 2 is filled out in yellow in order to to distinguish them.
     * Then the checkpoints are added to the game, checkpoint 1 is placed below right where the skater is,
     * and checkpoint 2 is added at the randomized coordinates.
     */
    private void setCheckpoints(){
        double skaterX = skater.getX();
        double skaterY = skater.getY();
        double randyX;
        double randyY;
        RandomGenerator rgen;
        rgen = new RandomGenerator();
        randyX = rgen.nextDouble(100,900);
        randyY = rgen.nextDouble(100,700);
        checkpoint1 = createCheckpoint();
        checkpoint1.setColor(Color.RED);
        checkpoint2 = createCheckpoint();
        checkpoint2.setColor(Color.YELLOW);
        add(checkpoint1,skaterX,skaterY);
        add(checkpoint2,randyX,randyY);
        //checkpoint1.setLocation(skaterLocation);
        //checkpoint2.setLocation(randyX,randyY);
    }

    /**
     * The KeyListeners are used to call the keyPressed Method in order to control
     *  the skater with the arrow keys.
     *  The skaters coordinates are found .
     *  Switch statements are used for the four cases, up, down, left and right.
     *  For each the skater is removed, moved by 15 pixels in the correct direction and
     *  then added again to the rink, folllowing which you can break out of the case.
     * @param e
     */
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

    /**
     * The mouseClicked method makes the boolean statement, skatingAlong true.
     * @param e
     */
 public void mouseClicked(MouseEvent e) {
     skatingAlong = true;
 }

    /**
     *The main method calls the miniGame to start.
     * @param args
     */
 public static void main(String[] args) {
     new MiniGame().start();
 }

}