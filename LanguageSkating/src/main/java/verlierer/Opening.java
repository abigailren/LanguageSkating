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
    GImage china = new GImage("china.png");
    GImage spain = new GImage("spain.png");
    Paragraph germanyBio = new Paragraph(30, bio.getBio("germany"));
    Paragraph japanBio = new Paragraph(30,bio.getBio("japan"));
    Paragraph chinaBio = new Paragraph(30,bio.getBio("china"));
    Paragraph spainBio = new Paragraph(30,bio.getBio("spain"));
    private GObject gobj;
    String selection="";

    public Opening(){
        germany.setSize(150, 300);
        japan.setSize(150, 300);
        china.setSize(150, 300);
        spain.setSize(150, 300);
        germanyBio.move(50,100);
        japanBio.move(250,100);
        chinaBio.move(450,100);
        spainBio.move(650,100);
        add(germany, 50, 100);
        add(japan, 250, 100);
        add(china, 450, 100);
        add(spain, 650, 100);
    }
    public static void main(String[] args) {
        new Opening().start(args);
    }
    public void run(){
        if (selection!=null){

        }
    }/*
    public void init() {
        germany.setSize(150, 300);
        japan.setSize(150, 300);
        china.setSize(150, 300);
        spain.setSize(150, 300);
        yo.move(50,100);
        yo1.move(250,100);
        yo2.move(450,100);
        yo3.move(650,100);
        add(germany, 50, 100);
        add(japan, 250, 100);
        add(china, 450, 100);
        add(spain, 650, 100);
        //addMouseListeners();
        //println("かああああああ");



    }*/
/*

    public void mouseClicked(MouseEvent e) {
        GPoint last = new GPoint(e.getPoint());
        gobj = getElementAt(last);
        if (gobj.equals(germany)) {
            this.stop();//add(new Germany().getSummary(), 50, 300);
        }
        else if (gobj.equals(japan)) {
            add(new GLabel("Yo", 250, 300));
            selection="Japan";
        } else if (gobj.equals(china)) {
            add(new GLabel("Yolo", 450, 300));
            selection="China";
        } else if (gobj.equals(spain)) {
            add(new GLabel("Lol", 650, 300));
            selection="Spain";
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

    }*/
}
