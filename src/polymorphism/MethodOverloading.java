package polymorphism;

public class MethodOverloading {
    //method overloading is basically same method name but different method signature
    //The method signature is the parameter of the method

    public static void main(String[] args){

    }

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
