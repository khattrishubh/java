class Shape
{
    double area(double length, double breadth)
    {
        return length * breadth;
    }
    double area(double radius)
    {
        return Math.PI * radius * radius;
    }
}
public class Lab5Q2
{
    public static void main(String[] args)
    {
        Shape s = new Shape();
        System.out.println("Area of Rectangle: " + s.area(10, 5));
        System.out.println("Area of Circle: " + s.area(7));
    }
}