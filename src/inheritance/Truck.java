package inheritance;

public class Truck extends VehicleCommon{
   //single inheritance is like a one to one relationship in which a child inherits from his parent
    public static void main(String[] args){
        Truck tk  = new Truck();
        tk.Start();
        tk.Stop();
    }

    public void loadCapacity(){
        System.out.println("Capacity is loading...");
    }
}
