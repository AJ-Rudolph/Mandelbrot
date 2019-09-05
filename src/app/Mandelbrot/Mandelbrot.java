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
        final int WIDTH = 640;
        final int HEIGHT = 480;
        
        Pixel[][] pixArr = new Pixel[640][480];

        
        for(int x =0; x< WIDTH; x++  ) {
            for(int y= 0; y< HEIGHT; y++) {
                ComplexNumber c = new ComplexNumber(
                    (double)-2.0 + ((double)x/(double)WIDTH) * ((double)(1+2)),
                    (double)-1.0 + ((double)y/(double)HEIGHT) * ((double)(1 +1))
                    );
                int result =this.mandelbrot(c);
                int color = 255 - result * 255/MAX_ITER;
                Pixel p= new Pixel(
                    new Color(color,color,color),x,y);

                pixArr[x][y] = p;
            }
        }

        return pixArr;

    }   
}