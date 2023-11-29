public class MultidimensionalArray {
    public static void main(String[] args){

        int [][] multiArray = new int[2][3];

        multiArray[0][0] = 2;
        multiArray[0][1] = 3;
        multiArray[0][2] = 8;
        multiArray[1][0] = 5;
        multiArray[1][1] = 6;
        multiArray[1][2] = 7;

        System.out.println(multiArray[1][2] + "one");




        /*
        *   if [4][5] === {{1,2,3,4,5}, {1,2,3,4,5}, {1,2,3,4,5}, {1,2,3,4,5}};  i.e 4 X 5 = 20
         *
         * */

        int[][] multiArray1 = {{2,3,8}, {5,6,7}};
        System.out.println(multiArray1[1][2] + "two ");
    }
}
