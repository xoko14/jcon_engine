package com.example;

import com.jcon_engine.JconInstance;
import com.jcon_engine.objects2D.CharMap2D;
import com.jcon_engine.objects2D.Square2D;

public class DVD extends JconInstance{
    char[][] logo = {
        {'/','⎺','⎺','⎺','\\'},
        {'⎸','D','V','D','⎹'},
        {'\\','⎽','⎽','⎽','/'}
    };
    CharMap2D dvdLogo = new CharMap2D(logo);
    boolean dirX=true, dirY=true;
    Square2D left = new Square2D(1, 22, 'X'),
        right = new Square2D(1, 22, 'X'),
        up = new Square2D(32, 1, 'X'),
        down = new Square2D(32, 1, 'X');

    DVD(){
        setCanvas(32, 22);
    }

    public void load(){
        //fps = 20; //fps can be changed
        canvas.addObj(dvdLogo);
        dvdLogo.x = 0;
        dvdLogo.y = 0;

        canvas.addObj(left);
        left.x = 0;
        left.y = 0;
        canvas.addObj(right);
        right.x = 31;
        right.y = 0;
        canvas.addObj(up);
        up.x = 0;
        up.y = 0;
        canvas.addObj(down);
        down.x = 0;
        down.y = 21;
    }

    public void update(){
        if (dvdLogo.x + dvdLogo.width == canvas.x-1) {
            dirX = false;
        }
        if (dvdLogo.x == 1) {
            dirX = true;
        }

        if (dvdLogo.y + dvdLogo.height == canvas.y-1) {
            dirY = false;
        }
        if (dvdLogo.y == 1) {
            dirY = true;
        }

        if (dirX) {
            dvdLogo.x++;
        } else {
            dvdLogo.x--;
        }

        if (dirY) {
            dvdLogo.y++;
        } else {
            dvdLogo.y--;
        }

        canvas.clear(' ');
    }
}
