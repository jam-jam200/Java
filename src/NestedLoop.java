public class NestedLoop {
    public static void main(String[] args){
        for (int i = 1; i <= 10; i++){

            int j = 1;
            while(j <= 5) {
                System.out.println("value of i is: " + i + " value of j is: " + j);
                j++;
            }
        }
    }
}
