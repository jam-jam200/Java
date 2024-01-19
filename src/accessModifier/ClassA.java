package accessModifier;

public class ClassA {

    public int publicVariable = 1;
    int defaultVariable = 2;
    private int privateVariable = 3;
    protected int protectedVariable = 4;


    public static void main(String[] args){
        ClassA cd = new ClassA();
        cd.defaultMethod();
        cd.privateMethod();
        cd.publicMethod();
        cd.protectedMethod();

        System.out.println("___________New methods___________");
        cd.addition(2,3);
        cd.subtraction();
        cd.multiplication(3,2);
        cd.division(4,2);
    }



    public int addition(int a, int b){
        return a + b;
    }

    void subtraction(){
       System.out.println("Subtraction was meant to be done here");
    }

    private int multiplication(int a, int b){
        return a * b;
    }

    protected int division(int a, int b){
        return a / b;
    }



    public void publicMethod(){
        System.out.println("Public Method");
    }

    void defaultMethod(){
        System.out.println("Default Method");
    }

    private void privateMethod(){
        System.out.println("Private Method");
    }

    protected void protectedMethod(){
        System.out.println("Protected Method");
    }
}
