package verlierer;
import acm.graphics.*;
/**
 * Created by abigailren on 11/28/17.
 */
public abstract class Character {
    GImage appearance;
    GLabel bio;


    public GImage getAppearance(){
        return appearance;
    }
    public GLabel getSummary(){
        return bio;
    }

}
