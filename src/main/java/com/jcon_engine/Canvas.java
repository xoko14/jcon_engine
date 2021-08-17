package com.jcon_engine;

import com.jcon_engine.objects2D.Object2D;
import java.util.ArrayList;

public class Canvas {
    private int x;
    private int y;
    private ArrayList<Object2D> shapes;
    private char[][] canvas;

    public Canvas(int x, int y){
        this.x = x;
        this.y = y;
        shapes = new ArrayList<>();
    }

    public char[][] getCanvas(){
        return canvas;
    }

    
}
