class Shapex
{
    double getArea()
    {
        return 0.0;
    }
}
class Rectanglex extends Shapex
{
    double length, breadth;
    Rectanglex(double length, double breadth )
    {
        this.length = length;
        this.breadth = breadth;
    }

    double getArea()
    {
        return length*breadth;
    }
}
public class LAB6Q2
{
    public static void main(String args[])
    {
        Shapex obj = new Rectanglex(5,3);
        double result= obj.getArea();
        System.out.println("The Area of Rectangle is = " + result);
    }
}
