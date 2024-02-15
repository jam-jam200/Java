package inter;

public class Circle implements Shapes{

    public static void main(String[] args) throws CloneNotSupportedException {
        Circle c = new Circle();
        c.drawShape();
        c.clone();
        c.colorShape();
        c.moveShape();
    }
    @Override
    public void drawShape() {
        System.out.println("Draw circle");
    }

    @Override
    public void colorShape() {
        System.out.println("Color circle");
    }

    @Override
    public void moveShape() {
        System.out.println("Move circle");
    }
}
