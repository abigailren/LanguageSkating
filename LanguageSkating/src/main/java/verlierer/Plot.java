package verlierer;

import acm.graphics.*;

public class Plot extends GCompound{
    Character c;

    public Plot(Character character){
        c = character;
    }

    public GImage setScreen(){
        return c.getAppearance();
    }
}
