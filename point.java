class point {
    double x,y;
    static double distance(point p1, point p2)
    {
        return Math.sqrt(Math.pow(p2.x-p2.y,2)+Math.pow(p2.x-p2.y,2));
    }
    public static void main(String args[])
    {
        point p1 = new point();
        p1.x=3;
        p1.y=4;
        point p2 = new point();
        p2.x=5;
        p2.y=6;
        double dist = point.distance(p1,p2);
        System.out.println(dist);
    }
}
