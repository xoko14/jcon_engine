package com.jcon_engine.objects2D;

public abstract class Object2D {
    public int drawOrder;
    public int x;
    public int y;

    public abstract char[][] getShape();
}
