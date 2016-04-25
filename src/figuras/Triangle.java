package figuras;

public class Triangle extends Shape {
    
    private int width;
    private int height;

    public Triangle(int width, int height) {
        super(3);
        this.width = width;
        this.height = height;
    }

    public void getPerimeter() {
        double p = Math.sqrt(height*height+width*width/4)*2;
        p = p + (double)width;
        System.out.println("Perimeter = " + p + " u");
    }

    public void getArea() {
        System.out.println("Area = " + width*height/2 + " u^2");
    }

}
