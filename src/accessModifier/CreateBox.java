package accessModifier;

public class CreateBox {
    //Encapsulation is the wrapping up data under a single unit e.g. medicine capsules

    public static void main(String[] args){
        Common cm = new Common();

       int l = cm.setLength(10);
       int b = cm.setWidth(20);
       int h = cm.setHeight(50);

        cm.setBoxDimension(l, b, h);
    }
}
