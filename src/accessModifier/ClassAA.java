package accessModifier;

public class ClassAA {
    public static void main(String[] args){
        ClassA ca = new ClassA();
        ca.protectedMethod();
        ca.defaultMethod();
        ca.publicMethod();
    }

    public void methodAA(){
        System.out.println("A method from ClassAA");
    }

}
