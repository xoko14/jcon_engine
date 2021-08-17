package com.example;

import com.jcon_engine.JconInstance;

public class runner {
    private static JconInstance shapes = new Shapes();
    private static JconInstance dvd = new DVD();
    public static void main(String[] args) {
        dvd.run();
    }
}
