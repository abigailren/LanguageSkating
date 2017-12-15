package verlierer;

import junit.framework.TestCase;

public class MiniGameTest extends TestCase {
    MiniGame miniGame = new MiniGame(new German());



    public void testNumQuestions() throws Exception {
        miniGame.run();

        assertEquals(5, miniGame.numQuestions);
    }

    public void testMouseClicked() throws Exception {
    }

    public void testMain() throws Exception {
    }

    public void testCreateCheckpoint(){

    }

}