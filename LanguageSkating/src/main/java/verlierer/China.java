package verlierer;

import acm.graphics.*;

/**
 * China class, implements Character
 */
public class China implements Character{
    /**
     * The GImage labelled appearance refers to the images we made of each character,
     * that is used in this version of the game.
     * Each country is represented by a character of who we have drawn an image and written a bio for.
     */
    GImage appearance;
    GLabel bio;
    /**
     * The China gathers what is needed for the introductoduction the player has to the chinese skater,
     * of his image and bio.
     * The GImage is gotten from added files, but the bio is gotten from the Bios class.
     */
    public China(){
        appearance = new GImage("China.png");
        bio = new GLabel(new Bios().getBio("china"));
    }
    /**
     * The method just returns the image of china as his appearance.
     * @return
     */
    public GImage getAppearance() {
        return appearance;
    }
    /**
     * The method returns the biography of the chinese skater
     * @return
     */
    public GLabel getSummary() {
        return bio;
    }
}
