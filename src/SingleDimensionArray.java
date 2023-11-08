public class SingleDimensionArray {
    public static void main(String[] args){
        // two ways of doing this, method 1:
        int[] myIntArray = new int[5];
        myIntArray[0] = 10;
        myIntArray[1] = 20;
        myIntArray[2] = 30;
        myIntArray[3] = 40;
        myIntArray[4] = 50;

        System.out.println(myIntArray[3]);
        System.out.println(myIntArray.length);

        // method 2
        int[] myIntArray1 = {10, 20, 30, 40, 50};
        System.out.println(myIntArray1[3]);
        System.out.println(myIntArray1[2]);
        System.out.println(myIntArray1.length);
        //done JU

        for (int j : myIntArray1) {
            System.out.println("this is " + j);
        }
        int a = 0;
        while (a < myIntArray1.length){
            System.out.println("while " + myIntArray1[a]);
        }






    }
}
