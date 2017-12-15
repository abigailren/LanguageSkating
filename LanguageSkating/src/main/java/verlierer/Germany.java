package verlierer;
import acm.graphics.*;

public class Germany implements Character {
    /**
     * The GImage labelled appearance refers to the images we made of each character,
     * that is used in this version of the game.
     * Each country is represented by a character of who we have drawn an image and written a bio for.
     */
    GImage appearance;
    GLabel bio;
    /**
     * The Germany method gathers what is seen by the player about the German skater,
     * his image and bio.
     * The GImage is gotten from added files, but the bio is gotten from the Bios class.
     */
    public Germany(){
        appearance = new GImage("German.png");
        bio = new GLabel(new Bios().getBio("germany"));
    }
    /**
     * The method just returns the image of german as his appearance.
     * @return
     */
    public GImage getAppearance() {
        return appearance;
    }
    /**
     * The method returns the biography of the german skater
     * @return
     */
    public GLabel getSummary() {
        return bio;
    }


}
