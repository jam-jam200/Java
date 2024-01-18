package accessModifierB;

import accessModifier.*;

public class ClassB {
    public static void main(String[] args){
        ClassA ca = new ClassA();
        ca.publicMethod();

        ClassAA caa = new ClassAA();
        caa.methodAA();
    }
}
