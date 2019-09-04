package app.Graphics;

import javax.swing.JFrame;

public class Window extends JFrame{
    
    public static final int WIDTH;
    public static final int HEIGHT;

    public static int width;
    private static int height;

    private String screenTitle;
  
    static {
        WIDTH=width;
        HEIGHT= height;
    }
 

    public Window(int width, int height) {
        
        Window.width=width;
        Window.height=height;
        this.screenTitle= "Mandelbrot";
       

        //adding JPanel to screen
        this.add(new Screen());

        // Set settings for JFrame window
        this.setTitle(screenTitle);
        this.setSize(width,height);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

    }
    
}