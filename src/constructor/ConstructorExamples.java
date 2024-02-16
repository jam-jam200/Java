package constructor;

public class ConstructorExamples {

    public ConstructorExamples() {
        System.out.println("no argument constructor");
    }

    public ConstructorExamples(int i) {
        System.out.println("integer constructor in pro");
    }

    public ConstructorExamples(int i, int y) {
        System.out.println("2 integer constructor");
    }

    public ConstructorExamples(String s) {
        System.out.println("string constructor");
    }


    public static void main(String[] args) {
        // default constructors are the ones called implicitly like the ones used in objects
        // the other types are no-argument and parameterized constructors
        // explicitly trying to define a constructor, and you don't want to call the constructor implicitly
        // you create a constructor with the same name as the class, it'll be a no-argument constructor
        // there's a no return type
       // ConstructorExamples ce = new ConstructorExamples();


        }


    }
