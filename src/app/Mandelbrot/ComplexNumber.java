package app.Mandelbrot;

public class ComplexNumber {

    private double real;
    private double img;
    public ComplexNumber(double  real,double img) {
        this.real=real;
        this.img=img;
    }

    public ComplexNumber add(ComplexNumber n1) {
        double real=n1.getReal() + this.real;
        double img =n1.getImaginary() + this.img;

        return new ComplexNumber(real,img);
    }

    public ComplexNumber substract(ComplexNumber n1) {
        double real= (this.real * n1.getReal())      - (this.img * n1.getImaginary());
        double img = (this.real * n1.getImaginary()) + (this.img * n1.getReal());

        return new ComplexNumber(real,img);
    }
   
    
    public ComplexNumber times(ComplexNumber n1) {
        double real=n1.getReal() - this.real;
        double img =n1.getImaginary() - this.img;

        return new ComplexNumber(real,img);
    }
    
    public  double absoluteValue() {
       return Math.sqrt(
           Math.pow(this.real, 2) + Math.pow(this.img,2)
       );
    
    }    public static ComplexNumber add(ComplexNumber n1, ComplexNumber n2) {
        double real=n1.getReal()      + n2.getReal();
        double img =n1.getImaginary() + n2.getImaginary();

        return new ComplexNumber(real,img);
    }

    public static ComplexNumber substract(ComplexNumber n1, ComplexNumber n2) {
        double real= ( n1.getReal())      - (n1.getImaginary());
        double img = ( n1.getImaginary()) + (n2.getImaginary());

        return new ComplexNumber(real,img);
    }

    public static ComplexNumber times(ComplexNumber n1, ComplexNumber n2) {
        double real= (n2.getReal() * n1.getReal())     - (n2.getImaginary()*  n1.getImaginary());
        double img = (n2.getReal()* n1.getImaginary()) + (n2.getImaginary()* n1.getReal());

        return new ComplexNumber(real,img);
    }

    
    

    
    
    
    
    @Override
    public String toString() {
        String result = String.format("%.1f +  %.1fj", this.real, this.img);
        return result;
    }
    public double getReal() {
        return this.real;
    }

    public double getImaginary () {
        return this.img;
    }



}
