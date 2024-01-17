public class Methods {
    public static void main(String[] args){

        Methods md = new Methods();
       int sum = md.Addition(3,4);

       differentThings("Sugar", 9, true);

        System.out.println(sum);

    }
    public static void differentThings(String word, int num, boolean isTrue ) {

        System.out.println(word);
        System.out.println(num);
        System.out.println(isTrue);
    }
    public int Addition(int a, int b) {
        return a + b;
    }
}
