package me.DeliciousShoesHD.cgol;

import java.awt.Canvas;

public class Game extends Canvas {

    private static final long serialVersionUID = 1L;

    public static int WIDTH, HEIGHT;
    public static final String TITLE = "Conway's Game of Life";
    
    public static void main(String[] args) {
        Game game = new Game();
        JFrame frame = new JFrame(TITLE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setUndecorated(true);
        frame.add(game);
        frame.pack();
        frame.setVisible(true);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        WIDTH = frame.getWidth();
        HEIGHT = frame.getHeight();
        
        Dimension size = new Dimension(WIDTH, HEIGHT);
        game.setPreferredSize(size);
        game.setMaximumSize(size);
        game.setMinimumSize(size);
    }
}
