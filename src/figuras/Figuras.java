package figuras;

/**
 *
 * @author Sebastian Gil Y Emmanuel Vanegas
 * @version 1.0
 * @since 18/04/2016
 */

public class Figuras {

     /**
     * Funcio permite la clase ejecutable
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Rectangle r1 = new Rectangle(4, 5);
        Rectangle r2 = new Rectangle(2, 6);
        Triangle t[] = new Triangle[3];
        t[0] = new Triangle(8, 3);
        t[1] = new Triangle(2, 1);
        t[2] = new Triangle(3, 8);
        
        System.out.println("No of sides: " + r1.getNumSides());
            System.out.println("-Rectangulo 1:");
            r1.getArea();
            r1.getPerimeter();
            System.out.println("\n-Rectangulo 2:");
            r2.getArea();
            r2.getPerimeter();
            
        System.out.println("---------------------------------------");
        
        System.out.println("No of sides: " + t[0].getNumSides());
            for (int i = 0; i < 3; i++) {
                System.out.println("-Triangulo " + (i+1) + ":");
                t[i].getArea();
                t[i].getPerimeter();
                System.out.println();
        }
    }
    
}
