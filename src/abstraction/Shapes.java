package abstraction;

public abstract class Shapes {

    //Abstraction in computer science is like simplifying things by
    // focusing on what's important and ignoring the less important details.
    // It helps in making programs and systems easier to understand and manage.

    public abstract void drawShape();

    public abstract void colorShape();

    public abstract void moveShape();

    public void deleteShape(){
        System.out.println("Deleting shape...");
    }
}
