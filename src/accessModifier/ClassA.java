package accessModifier;

public class ClassA {

    public int publicVariable = 1;
    int defaultVariable = 2;
    private int privateVariable = 3;
    protected int protectedVariable = 4;

    public void publicMethod(){
        System.out.println("Public Method");
    }

    void defaultMethod(){
        System.out.println("Default Method");
    }
}
