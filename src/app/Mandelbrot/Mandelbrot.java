package app.Mandelbrot;

import java.awt.Color;
import app.Graphics.Pixel;
import app.Graphics.Window;

public class Mandelbrot {
    
    public Mandelbrot() {

    }

    private int mandelbrot(ComplexNumber c) {

        //max amojnt of interations per pixel
        final int MAX_ITER=80;

        
        //A complex number
        ComplexNumber z= new ComplexNumber(0,0);
        int n=0; //amount of times we have run Mendelbrot
        while(((z.absoluteValue()) <=2) && (n < MAX_ITER)){
            z = ComplexNumber.times(z,z);
            z = ComplexNumber.add(z,c);
            n +=1;
        }
    
        return n;
    }
    public Pixel [][] run() {

        final int MAX_ITER= 80;
        
        Pixel[][] pixArr = new Pixel[Window.HEIGHT] [Window.WIDTH];

        
        for(int x =-320, i=0; x< 320; x++, i++  ) {
            for(int y= -240,j=0; y< 240; y++, j++) {
                ComplexNumber c = new ComplexNumber(
                    -2 + (x/(double)Window.WIDTH) * (1+2),
                    -1 + (y/(double)Window.HEIGHT) * (1 +1)
                    );
                int result =this.mandelbrot(c);
                int color = 255 - result * 255/MAX_ITER;
                Pixel p= new Pixel(
                    new Color((float) color, (float)color, (float) color),x,y);
                pixArr[i][j] = p;
            }
        }

        return pixArr;

    }   
}