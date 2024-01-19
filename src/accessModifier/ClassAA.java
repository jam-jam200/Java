package accessModifier;

public class ClassAA {
    public static void main(String[] args){
        ClassA ca = new ClassA();
        ca.protectedMethod();
        ca.defaultMethod();
        ca.publicMethod();
        System.out.println("___________New methods___________");
        System.out.println(ca.addition(2,3));
        ca.subtraction();
        System.out.println(ca.division(4,2));
    }

    public void methodAA(){
        System.out.println("A method from ClassAA");
    }

}
