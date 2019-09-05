package app;

import app.Graphics.Pixel;
import app.Graphics.Window;
import app.Mandelbrot.ComplexNumber;
import app.Mandelbrot.Mandelbrot;

public class App {
    public static void main(String[] args) throws Exception {
       
        //run mandelbrot algorithm
        Mandelbrot mbrot= new Mandelbrot();
        Pixel [][] mbrotResults = mbrot.run();

        //draw to window
        Window window= new Window(640,480, mbrotResults);
    }
}