package verlierer;

import acm.graphics.*;
import acm.program.*;

import java.awt.event.*;

/**
 * Created by abigailren on 11/28/17.
 */
public class Opening extends GraphicsProgram {
    GImage germany = new Germany().appearance;
    GImage japan = new GImage("japan.png");
    GImage china = new GImage("china.png");
    GImage spain = new GImage("spain.png");
    GLabel yo = new GLabel("Yoooooooo", 50, 300);
    GLabel yo1 = new GLabel("Yo", 250, 300);
    GLabel yo2 = new GLabel("Yolo", 450, 300);
    GLabel yo3 = new GLabel("lol", 650, 300);
    private GObject gobj;


    public static void main(String[] args) {
        new Opening().start(args);
    }
    public void run(){
        init();
    }
    public void init() {
        germany.scale(.5, .5);
        japan.scale(.5, .5);
        china.scale(.5, .5);
        spain.scale(.5, .5);

        add(germany, 50, 100);
        add(japan, 250, 100);
        add(china, 450, 100);
        add(spain, 650, 100);
        addMouseListeners();
        println("かああああああ");

    }

    public void mouseClicked(MouseEvent e) {
        GPoint last = new GPoint(e.getPoint());
        gobj = getElementAt(last);
        if (gobj.equals(germany)) {
            add(new Germany().getSummary(), 50, 300);
        }
        else if (gobj.equals(japan)) {
            add(new GLabel("Yo", 250, 300));
        } else if (gobj.equals(china)) {
            add(new GLabel("Yolo", 450, 300));
        } else if (gobj.equals(spain)) {
            add(new GLabel("Lol", 650, 300));
        }
    }

    public void mouseMoved(MouseEvent e) {
        if (e == null) {
            remove(yo);
            remove(yo1);
            remove(yo2);
            remove(yo3);
        } else {
            GPoint last = new GPoint(e.getPoint());
            if (last != null) {

                gobj = getElementAt(last);
                if (gobj == null) {
                    remove(yo);
                    remove(yo1);
                    remove(yo2);
                    remove(yo3);
                } else {
                    if (gobj.equals(germany)) {
                        add(yo);
                    } else if (gobj.equals(japan)) {
                        add(yo1);
                    } else if (gobj.equals(china)) {
                        add(yo2);
                    } else if (gobj.equals(spain)) {
                        add(yo3);
                    }
                }
            }

        }

    }
}
