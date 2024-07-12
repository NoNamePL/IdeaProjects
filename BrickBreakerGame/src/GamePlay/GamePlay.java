package GamePlay;

import MapGenerator.MapGenerator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GamePlay extends JPanel implements KeyListener, ActionListener{
    private boolean play = true;
    private int score = 0;

    private int totalBrick = 21;
    private Timer timer;
    private int delay = 8;

    private int playerX = 310;

    private int ballposX = 120;
    private int ballposY = 350;
    private int ballXdir = -1;
    private int ballYdir = -2;

    private MapGenerator map;

    public GamePlay() {
        map = new MapGenerator(3,7);
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        timer = new Timer(delay,this);
        timer.start();
    }

    public void paint(Graphics g) {

        // background color
        g.setColor(Color.YELLOW);
        g.fillRect(1,1,800,600);

        map.draw((Graphics2D)g);

        g.fillRect(0,0,3,592);
        g.fillRect(0,0,790,3);
        g.fillRect(790,0,3,592);

        g.setColor(Color.blue);
        g.fillRect(playerX,550,100,12);

        g.setColor(Color.RED); // ball color
        g.fillOval(ballposX,ballposY,20,20);

        g.setColor(Color.black);
        g.setFont(new Font("MV Boli",Font.BOLD,25));
        g.drawString("Score: " + score, 520, 30);

        if (totalBrick <= 0) { // if all brick are destroyed then you win
            play = false;
            ballXdir = 0;
            ballYdir = 0;
            g.setColor(new Color(0xFF6464));
            g.setFont(new Font("MV Boli",Font.BOLD,30));
            g.drawString("You Win! You score " + score, 190, 300);

            g.setFont(new Font("MV Boli",Font.BOLD,20));
            g.drawString("Press Enter to Restart", 230, 350);

        }
        g.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        timer.start();
        if(play) {
            // Ball-Pedal interaction
            if (new Rectangle(ballposX, ballposY, 20, 20).intersects(new Rectangle(playerX, 550, 100, 8)))
                ballYdir = -ballYdir;
            A: for (int i = 0; i < map.map.length; i++) { // ball -Brick interaction
                for (int j = 0; j < map.map[0].length; j++) { // map.map[0].length is the number of columns
                    if (map.map[i][j] > 0) {
                        int brickX = j * map.brickWidth + 80;
                        int brickY = j * map.brickHeight + 50;
                        int brickWidth = map.brickWidth;
                        int brickHeight = map.brickHeight;

                        Rectangle rect = new Rectangle(brickX, brickY, brickWidth, brickHeight);
                        Rectangle ballRect = new Rectangle(ballposX, ballposY, 20, 20);
                        Rectangle brickRect = rect;

                        if (ballRect.intersects(brickRect)) {
                            map.setBrickValue(0, i, j);
                            totalBrick--;
                            score += 5;

                            if (ballposX + 5 <= brickRect.x || ballposX >= brickRect.x + brickRect.width) {
                                ballXdir = -ballXdir;
                            } else {
                                ballYdir = -ballYdir;
                            }

                            break A;
                        }
                    }
                }
            }

            ballposX += ballXdir;
            ballposY += ballYdir;
            if(ballposX < 0) // if ball hits the left wall then it bounces back
                ballXdir = -ballXdir;
            if(ballposY < 0) // if ball hits the top wall then it bounces
                ballYdir =-ballYdir;
            if(ballposX > 770) // if ball hits the right wall then it bounces
                ballXdir =-ballXdir;
        }
    repaint();
    }
    @Override
    public void keyTyped(KeyEvent arg0){

    }

    @Override
    public void keyPressed(KeyEvent arg0) {
        if(arg0.getKeyCode() == KeyEvent.VK_RIGHT) { //if right arrow key is pressed then paddle moves right
            if(playerX >= 700) {
                playerX = 700;
            } else {
                moveRight();
            }
        }
        if(arg0.getKeyCode() == KeyEvent.VK_LEFT) { // if left arrow key is pressed then paddle moves left
            if(playerX < 10) {
                playerX = 10;
            } else {
                moveLeft();
            }
        }

        if(arg0.getKeyCode() == KeyEvent.VK_ENTER) { // if enter key is pressed then game result
            if(!play) {
                play=true;
                ballposX=120;
                ballposY=350;
                ballXdir=-1;
                ballYdir=-2;
                score=0;
                totalBrick=21;
                map = new MapGenerator(3,7);

                repaint();
            }
        }
    }
    public void moveRight() { // paddle moves right by 50 pixels;
        play = true;
        playerX+=50;
    }
    public void moveLeft() { // paddle moves left by 50 pixels
        play=true;
        playerX-=50;
    }

    @Override
    public void keyReleased(KeyEvent arg0) {

    }

}


