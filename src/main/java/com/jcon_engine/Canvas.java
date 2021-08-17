package com.jcon_engine;

import com.jcon_engine.objects2D.Object2D;
import com.jcon_engine.objects2D.Object2DComparator;

import java.util.ArrayList;
import java.util.Collections;

public class Canvas {
    public int x;
    public int y;
    private ArrayList<Object2D> shapes;
    private char[][] canvas;

    public Canvas(int x, int y){
        this.x = x;
        this.y = y;
        shapes = new ArrayList<>();
        canvas = new char[y][x];
    }

    public char[][] getCanvas(){
        char[][] currentObj;

        orderObjects();

        for (Object2D object : shapes) {
            currentObj = object.getShape();
            for(int i=0;i<currentObj.length;i++){
                for(int j=0;j<currentObj[i].length;j++){
                    canvas[object.y+i][object.x+j] = currentObj[i][j];
                }
            }
        }

        return canvas;
    }

    private void orderObjects(){
        Collections.sort(shapes, new Object2DComparator());
    }

    public void addObj(Object2D obj){
        shapes.add(obj);
    }

    public void clear(char background){
        for (int i = 0; i < canvas.length; i++) {
            for (int j = 0; j < canvas[i].length; j++) {
                canvas[i][j]=background;
            }
        }
    }

    
}
