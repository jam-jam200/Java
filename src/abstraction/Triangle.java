package abstraction;

public class Triangle {

    public static void main(String[] args) {
        Shapes s = new Shapes() {
            @Override
            public void drawShape() {
                System.out.println("Drawing Circle");
            }

            @Override
            public void colorShape() {
                System.out.println("Coloring Circle");
            }

            @Override
            public void moveShape() {

            }
        };
        s.deleteShape();
    }
}
