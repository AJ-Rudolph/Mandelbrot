package app.Graphics;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class Pixel extends JComponent {

    private int x;
    private int y;
    private Color color;
    public Pixel(Color color, int x, int y) {
        this.x=x;
        this.y=y;
        this.color =color;
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        
        //draw pixel
        g.setColor(this.color);
        g.fillRect(x,y,1,1);
    }
}