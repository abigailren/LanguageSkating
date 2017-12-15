package verlierer;

import acm.graphics.*;

/**
 * Spain class, implements Character
 */
public class Spain implements Character{
    /**
     * The GImage labelled appearance refers to the images we made of each character,
     * that is used in this version of the game.
     * Each country is represented by a character of who we have drawn an image and written a bio for.
     */
    GImage appearance;
    GLabel bio;
    /**
     * The Spain method gathers what is seen by the player about the spanish skater,
     * his image and bio.
     * The GImage is gotten from added files, but the bio is gotten from the Bios class.
     */
    public Spain(){
        appearance = new GImage("spain.png");
        bio = new GLabel(new Bios().getBio("spain"));
    }
    /**
     * The method just returns the image of the spanish skater as his appearance.
     * @return
     */
    public GImage getAppearance() {
        return appearance;
    }
    /**
     * The method returns the biography of the spanish skater
     * @return
     */
    public GLabel getSummary() {
        return bio;
    }
}
