package com.jcon_engine.objects2D;

public class Square2D extends Object2D {
    public int width;
    public int height;
    public char filler;

    public char[][] getShape() {
        char[][] shape = new char[y][x];
        for (int i = 0; i < shape.length; i++) {
            for (int j = 0; j < shape[i].length; j++) {
                shape[i][j] = filler;
            }
        }
        return shape;
    }
}
