package MapGenerator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MapGenerator {

    public int map[][];
    public int brickWidth;
    public int brickHeight;

    // brick constructor
    public MapGenerator(int row,int col) {
        map = new int[row][col];
        for(int i=0;i<map.length;i++){
            for(int j=0;j<map[0].length;j++){
                map[i][j] = 1;
            }
        }

        brickWidth = 540/col;
        brickHeight = 150/row;
    }

    // draws the brick
    public void draw(Graphics2D g) {
        for(int i=0;i<map.length;i++){
            for(int j=0;j<map[0].length;j++){
                if(map[i][j]>0){
                    g.setColor(Color.PINK); // brick color

                    g.fillRect(j*brickWidth + 60, i*brickHeight + 40, brickWidth, brickHeight);

                    g.setStroke(new BasicStroke(4));
                    g.setColor(Color.BLACK);
                    g.drawRect(j*brickWidth + 60, i*brickHeight + 40, brickWidth, brickHeight);
                }
            }
        }
    }

    //this sets the value of brick to 0 if is hit by the ball
    public void setBrickValue(int value, int row, int col) {
        map[row][col] = value;
    }

}


