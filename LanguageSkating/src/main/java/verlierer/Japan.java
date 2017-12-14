package verlierer;
import acm.graphics.*;

public class Japan implements Character {

    GImage appearance;
    GLabel bio;

    public Japan(){
        appearance = new GImage("Japanese.png");
        bio = new GLabel(new Bios().getBio("japan"));
    }

    public GImage getAppearance() {
        return appearance;
    }

    public GLabel getSummary() {
        return bio;
    }
}
