package verlierer;

import acm.graphics.*;
import acm.program.*;

import java.awt.event.*;

/**
 * Created by abigailren on 11/28/17.
 */
public class Opening extends GCompound {
    Bios bio = new Bios();
    GImage germany = new Germany().appearance;
    GImage japan = new Japan().appearance;
    GImage china = new China().appearance;
    GImage spain = new Spain().appearance;
    Paragraph germanyBio = new Paragraph(30, bio.getBio("germany"));
    Paragraph japanBio = new Paragraph(30,bio.getBio("japan"));
    Paragraph chinaBio = new Paragraph(30,bio.getBio("china"));
    Paragraph spainBio = new Paragraph(30,bio.getBio("spain"));
    String instruct = "Welcome to Language Skating! Hover over a character to read their bios "+
            "and click on a character to start the game in the language of your choice.";
    Paragraph instructions = new Paragraph(100, instruct);
    private GObject gobj;

    public Opening(){
        add(instructions,50,50);
        germany.setSize(150, 300);
        japan.setSize(150, 300);
        china.setSize(150, 300);
        spain.setSize(150, 300);
        germanyBio.move(50,420);
        japanBio.move(250,420);
        chinaBio.move(450,420);
        spainBio.move(650,420);
        add(germany, 50, 100);
        add(japan, 250, 100);
        add(china, 450, 100);
        add(spain, 650, 100);
    }
}
