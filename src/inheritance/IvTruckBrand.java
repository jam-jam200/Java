package inheritance;

public class IvTruckBrand extends Truck{
    public static void main(String[] args){
        IvTruckBrand iv = new IvTruckBrand();
        iv.loadCapacity();
        iv.Stop();
        iv.Start();
        //multi-level inheritance is when a direct class or
        // subclass of the main class inheritances the properties of another main class
        // that's inheriting from the parent class

    }
}
