class shape2
{
    double length, breadth, radius;
   shape2( double length, double rectangle)
    {
        this.length = length;
        this.breadth = breadth;
    }
    shape2( double radius)
    {
        this.radius = radius;
    }
    void calculate( shape2 obj)
    {
        if(obj.radius == 0) {
            System.out.println("Radius of rectangle: " + (obj.length * obj.breadth));
        }
        else
        {
            System.out.println("Radius of square: "+ ( Math.PI*obj.radius*obj.radius));
        }
    }
}
public class Lab5Q3
{
    public static void main( String args[])
    {
        shape2 rect = new shape2(10,5);
        shape2 circle = new shape2(5);
    }
}