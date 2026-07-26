class vehicle
{
    void drive()
    {
        System.out.println(" he drives a vehicle");
    }
}
class Car extends vehicle{
    void drive()
    {
        System.out.println(" Repairing a car");
    }
}
public class LAB6Q1 {
    public static void main(String[] args)
    {
        vehicle obj = new vehicle();
        obj.drive();

        Car obj2 = new Car();
        obj.drive();
    }
}
