package com.jcon_engine.objects2D;

public abstract class Object2D {
    public int drawOrder = 0;
    public int x;
    public int y;
    public int width;
    public int height;
    public char[][] shape;

    public abstract char[][] getShape();
}
