package com.jcon_engine.objects2D;

public class Text2D extends Object2D{
    public String text;
    public Text2D(String text){
        this.text = text;
    }

    public char[][] getShape(){
        shape = new char[1][text.length()];
        for (int i = 0; i < text.length(); i++) {
            shape[0][i] = text.charAt(i);
        }
        return shape;
    }
    
}
