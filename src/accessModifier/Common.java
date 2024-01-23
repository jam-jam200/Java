package accessModifier;

public class Common {

    private int length;
    private int width;
    private int height;

    public void setBoxDimension(int l, int b, int h) {
        int sum = l+b+h;

        if(l >= 0 && b >= 0 && h >= 0) {
            System.out.println("Dimension box created with dimensions: " + l + " length " + b + " breadth " + h + " height " + "multiplied is " + sum);
        }

        else {
            System.out.println("Invalid Parameters provided");
        }

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

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }


}
