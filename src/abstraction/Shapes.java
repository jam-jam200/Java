package abstraction;

public abstract class Shapes {

    public abstract void drawShape();

    public void colorShape(){
        System.out.println("Coloring shape...");
    }

    public void moveShape(){
        System.out.println("Shape is moving...");
    }
}
