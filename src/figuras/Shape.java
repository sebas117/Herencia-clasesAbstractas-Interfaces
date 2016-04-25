package figuras;

public abstract class Shape {
    protected int numSides;

    public Shape(int numSides) {
        this.numSides = numSides;
    }

    public int getNumSides() {
        return numSides;
    }

    public abstract void getPerimeter();

    public abstract void getArea();   
    
}
