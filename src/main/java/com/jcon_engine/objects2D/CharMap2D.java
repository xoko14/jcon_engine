package com.jcon_engine.objects2D;

public class CharMap2D extends Object2D{
    public CharMap2D(char[][] chars){
        this.shape = chars;
        this.height = chars.length;
        this.width = chars[0].length;
    }

    public char[][] getShape(){
        return shape;
    }
}
