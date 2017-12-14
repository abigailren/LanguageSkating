package verlierer;
import acm.graphics.*;

public class Germany implements Character {

    GImage appearance;
    GLabel bio;

    public Germany(){
        appearance = new GImage("German.png");
        bio = new GLabel(new Bios().getBio("germany"));
    }

    public GImage getAppearance() {
        return appearance;
    }

    public GLabel getSummary() {
        return bio;
    }
}
