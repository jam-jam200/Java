public class Methods {
    public static void main(String[] args){

        Methods md = new Methods();
       int sum = md.Addition(3,4);

        System.out.println(sum);

    }
    public String doIt() {
        return "Yes I'll do it";
    }
    public double sayNo() {
        return 12.45;
    }
    public int Addition(int a, int b) {
        return a + b;
    }
}
