package inheritance;

public class IvTruckBrand extends Truck{
    public static void main(String[] args){
        IvTruckBrand iv = new IvTruckBrand();
        iv.loadCapacity();
        iv.Stop();
        iv.Start();
        //multi-level inheritance is when a
        // subclass of another class inheritances the properties of that class
        // that's inheriting from the parent class

    }
}
