package polymorphism;

public class MethodOverloading {
    //compile time polymorphism
    //method overloading is basically same method name but different method signature
    //The method signature is the parameter of the method
    //Early binding, static binding, and method overloading are also known as compile time polymorphism

    public static void main(String[] args){
        MethodOverloading md = new MethodOverloading();
        md.Login(90, "Water");
        md.Login(9, "people", 20);
        md.Login("dry", "wet");
    }

    //runtime polymorphism only happens when dealing with inheritance
    //runtime you need to have the same method signature and method name, it's also known
    //as method overriding, late binding, and dynamic binding

    public void Login(String s, String p){
        System.out.println("Login successful, using username and password");
    }

    public void Login(int num, String p){
        System.out.println("Login successful, using phone number and password");
    }

    public void Login(int s, String p, int t){
        System.out.println("Login successful, using username, token, and password");
    }
}
