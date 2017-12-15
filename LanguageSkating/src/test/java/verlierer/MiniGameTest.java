package verlierer;

import junit.framework.TestCase;

public class MiniGameTest extends TestCase {
    MiniGame miniGame = new MiniGame(new German());


    public void testSetUpGame() throws Exception {
        miniGame.setUpGame();

        assertNull(miniGame.getQuestion());
    }

    public void testRunGame() throws Exception {
    }

    public void testMouseClicked() throws Exception {
    }

    public void testMain() throws Exception {
    }

    public void testCreateCheckpoint(){

    }

}