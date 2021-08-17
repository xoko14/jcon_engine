package com.example;

import com.jcon_engine.*;
import com.jcon_engine.objects2D.*;

public class Shapes extends JconInstance{

    public Square2D sq;

    Shapes(){
        setCanvas(20, 10);
    }

    public void load(){
        sq = new Square2D(2, 2, 'X');
        sq.x = 1;
        sq.y = 1;
        canvas.addObj(sq);
    }

    public void update(){
        if(sq.x>=canvas.x){
            sq.x--;
        }
        else{
            sq.x++;
        }
    }
}
