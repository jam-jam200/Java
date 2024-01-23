package accessModifier;

public class CreateBox {
    //Encapsulation is the wrapping up data under a single unit e.g. medicine capsules

    public static void main(String[] args){
        Common cm = new Common();

       int l = cm.setLength(0);
       int b = cm.setWidth(0);
       int h = cm.setHeight(0);

        cm.setBoxDimension(l, b, h);
    }
}
