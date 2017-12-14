package verlierer;
import acm.graphics.*;

public class China implements Character {

    GImage appearance;
    GLabel bio;

    public China(){
        appearance = new GImage("Chinese.png");
        bio = new GLabel(new Bios().getBio("china"));
    }

    public GImage getAppearance() {
        return appearance;
    }

    public GLabel getSummary() {
        return bio;
    }
}
