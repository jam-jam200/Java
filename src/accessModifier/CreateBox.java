package accessModifier;

public class CreateBox {
    //Encapsulation is the wrapping up data under a single unit e.g. medicine capsules

    public static void main(String[] args){
        Common cm = new Common();
        int l = cm.height = 10;
        int b = cm.length = 20;
        int h = cm.width = 30;
        cm.setBoxDimension(l, b, h);
    }
}
