package com.jcon_engine.objects2D;

public class Square2D extends Object2D {
    public char filler;
    private char[][] shape;

    public Square2D(int width, int height, char filler) {
        this.width = width;
        this.height = height;
        this.filler = filler;
    }

    public char[][] getShape() {
        shape = new char[y][x];
        for (int i = 0; i < shape.length; i++) {
            for (int j = 0; j < shape[i].length; j++) {
                shape[i][j] = filler;
            }
        }
        return shape;
    }
}
