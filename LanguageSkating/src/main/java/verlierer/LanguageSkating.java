package verlierer;

/**
 * Created by abigailren on 11/28/17.
 */
import acm.program.*;
import acm.graphics.*;
import acm.util.*;
import acm.io.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author abigailren
 */
public class LanguageSkating extends GraphicsProgram{

    /**
     * @param args the command line arguments
     */
    GObject germany = new GImage("germany.png");
    GObject japan = new GImage("japan.png");
    GObject china = new GImage("china.jpeg");
    GObject spain = new GImage("spain.png");

    public void init(){


        //japan.scale(.5, .5);
        //china.scale(.5, .5);
        //spain.scale(.5, .5);

        add(germany,50,100);
        add(japan,250,100);
        add(china,450,100);
        add(spain,650,100);
        addMouseListeners();
    }
    // public static void main(String[] args) {
    //  new LanguageSkating().start(args);
    //}

    public void mousePressed(MouseEvent e) {
        last = new GPoint(e.getPoint());
        gobj = getElementAt(last);
    }


    public void mouseClicked(MouseEvent e) {
        if (gobj.equals(germany)){
            add(new GLabel("Yooooo",50,300));
        }
        else if (gobj.equals(japan)){
            add(new GLabel("Yo",250,300));}
        else if (gobj.equals(china)){
            add(new GLabel("Yolo",450,300));}
        else if (gobj.equals(spain)){
            add(new GLabel("Lol",650,300));}
    }
    private GObject gobj;           /* The object being dragged */
    private GPoint last;
}
