package com.example;

import com.jcon_engine.*;
import com.jcon_engine.objects2D.*;

public class Shapes extends JconInstance {

    public Square2D sq;
    public Text2D txt;
    boolean dir = true;
    int counter = 0;

    Shapes() {
        setCanvas(20, 10);
    }

    //code only run once
    public void load() {
        sq = new Square2D(2, 3, '█');
        sq.x = 1;
        sq.y = 2;
        canvas.addObj(sq);

        txt = new Text2D("Hello world");
        txt.x = 3;
        txt.y = 3;
        canvas.addObj(txt);

    }

    //code that executes every frame
    public void update() {

        if (sq.x + sq.height == canvas.x) {
            dir = false;
            sq.drawOrder = 1;
        }
        if (sq.x == 0) {
            dir = true;
            sq.drawOrder=-1;
            counter++;
        }

        if (dir) {
            sq.x++;
        } else {
            sq.x--;
        }

        if(counter==5){
            end();
        }

        canvas.clear(' ');
        // System.out.println("--------------------");
    }
}
