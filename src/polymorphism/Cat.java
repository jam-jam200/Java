package polymorphism;

public class Cat extends Animal{
    public static void main(String[] args){
        Cat cat = new Cat();
        cat.makeNoise();
    }

    public void makeNoise(){
        System.out.println("Cat Meows");
        //method overriding
    }

}
