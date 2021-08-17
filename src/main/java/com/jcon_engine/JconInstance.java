package com.jcon_engine;

import java.util.concurrent.locks.LockSupport;

public abstract class JconInstance {
    private int fps = 30;
    private long time1, time2;
    protected Canvas canvas;
    private boolean run = true;



    public void run() {
        load();
        while (run) {
            time1 = System.nanoTime();
            update();
            renderFrame();
            time2 = System.nanoTime();
            LockSupport.parkNanos(1000000000 / fps - (time2 - time1)); // fps (duration of frame in nanosec - time taken                                                           // to render frame)
        }
    }

    private void renderFrame() {
        char[][] canvasChar = canvas.getCanvas();
        String frame = "";
        for (char[] cs : canvasChar) {
            for (char c : cs) {
                frame += c;
            }
            frame += "\n";
        }
        System.out.print(frame);
    }

    protected void end() {
        run = false;
    }
    
    protected void setCanvas(int x, int y){
        canvas = new Canvas(x, y);
    }

    public abstract void load();

    public abstract void update();

}
