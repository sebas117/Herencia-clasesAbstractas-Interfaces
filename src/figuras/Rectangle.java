package figuras;

public class Rectangle extends Shape {
    
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        super(4);
        this.width = width;
        this.height = height;
    }

    public void getPerimeter() {
        System.out.println("Perimeter = " + 2*(width+height) + " u");
    }

    public void getArea() {
        System.out.println("Area = " + width*height + " u^2");
    }

}
