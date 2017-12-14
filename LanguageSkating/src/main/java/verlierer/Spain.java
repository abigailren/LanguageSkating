package verlierer;
import acm.graphics.*;

public class Spain implements Character {

    GImage appearance;
    GLabel bio;

    public Spain(){
        appearance = new GImage("Spanish.png");
        bio = new GLabel(new Bios().getBio("spain"));
    }

    public GImage getAppearance() {
        return appearance;
    }

    public GLabel getSummary() {
        return bio;
    }
}
