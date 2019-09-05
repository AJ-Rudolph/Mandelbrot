package app.Graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.LayoutManager;

import javax.swing.JPanel;

public class Screen extends JPanel{

    private Pixel [][] pixArr;
    public Screen (Pixel [][] pixArr) {
        // this lets J Components anywhere on screen
        this.setLayout(null);
        this.pixArr= pixArr;
    }
    /**
    
     * main draw functions that lets us put pixels on screen
     * @param g- Graphics object that draws to the JPanel
    */
    
   
    @Override
    protected void paintComponent (Graphics g) {
        // goes to parent class and run in super.paint component
        super.paintComponent(g);


        g.setColor(Color.RED);
                //(x,y,width,height)
        Pixel p = new Pixel(Color.RED,100,100);
        p.paintComponent(g);
    }



}