package com.example;

import com.jcon_engine.*;
import com.jcon_engine.objects2D.*;

public class Shapes extends JconInstance{

    public Square2D sq;
    boolean dir = true;

    Shapes(){
        setCanvas(20, 10);
    }

    public void load(){
        sq = new Square2D(2, 3, 'X');
        sq.x = 1;
        sq.y = 2;
        canvas.addObj(sq);
    }

    public void update(){
        if(sq.x+sq.height==canvas.x){
            dir = false;
        }
        if(sq.x==0){
            dir=true;
        }

        if(dir){
            sq.x++;
        }
        else{
            sq.x--;
        }
        
        canvas.clear(' ');
        //System.out.println("--------------------");
    }
}
