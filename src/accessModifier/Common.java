package accessModifier;

public class Common {

    private int length;
    private int width;
    private int height;

    public void setBoxDimension(int l, int b, int h) {
        System.out.println("Dimension box created with dimensions: " + l + " length " + b + " breadth " + h + " height ");
    }

    public int setLength(int l){
        length = l;
        return length;
    }
    public int setWidth(int w){
        width = w;
        return width;
    }
    public int setHeight(int h){
        height = h;
        return height;
    }

    public int getLength(){
        return length;
    }

}
