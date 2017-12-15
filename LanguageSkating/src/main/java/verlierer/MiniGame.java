package verlierer;

import acm.graphics.*;
import acm.program.*;
import java.awt.*;
import acm.util.RandomGenerator;

//The minigame

public class MiniGame extends GraphicsProgram{

    private RandomGenerator rgen;
    //The GOvals for the checkpoints needed in the game
    private GOval checkpoint1, checkpoint2;
    private final GObject skater;
    private final GImage rink;




    //5 checkpoints should be reached in order to finish.
    private final int CHECKPOINTS = 5;

    public MiniGame() {
        this.skater = new GImage("skaterIcon.png");
        this.rink = new GImage("rink.png",0,0);
    }


    /**
     * run:
     *
     * Invoked by the start method in main,
     * causes execution to continue from here.
     */
    public void run () {
        //setUpGame() called before the game is run, so that the background image
        //of the ice rink is uploaded before the game is started
        setUpGame();
        //everytime that the player has not yet reached 5 checkpoints run the game
        for(int i = 0; i < CHECKPOINTS; i++){
            runGame();

        }
//next count how many checkpoints have been passed, if it has reached 5 then the skater has finished

        GLabel victoryMessage =
                new GLabel("YOU MADE IT!", 100, 300);
        victoryMessage.setFont("SansSerif-36");
        victoryMessage.setColor(Color.MAGENTA);
        add(victoryMessage);
        skater.setVisible(false);
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
        rink.setSize(1000,800);
        rink.sendToBack();
        //add KeyListeners to navigate the rink
        addKeyListeners();
        //skater starts in center
        add(skater,500, 400);
    }


    private void runGame(){
        setCheckpoints();

    }

    private GOval createCheckpoint(){
        GOval tempCheckpoint =  new GOval(20,20);
        tempCheckpoint.setFilled(true);
        tempCheckpoint.setColor(Color.YELLOW);
        return tempCheckpoint;

    }

    private void setCheckpoints(){
        //find the location of the skater
        double randyX;
        double randyY;
        double skaterX = skater.getX();
        double skaterY = skater.getY();
        //find a random
        rgen = new RandomGenerator();
        randyX = rgen.nextDouble(50,950);
        randyY = rgen.nextDouble(50,750);

        checkpoint1 = createCheckpoint();
        checkpoint2 = createCheckpoint();

        add(checkpoint1,skaterX,skaterY);
        add(checkpoint2,randyX,randyY);

        //checkpoint1.setLocation(skaterLocation);
        //checkpoint2.setLocation(randyX,randyY);

    }



}