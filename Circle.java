class Circle {
    int radius = 5;
    public double Area() 
    {
        return (3.14*radius*radius);
    }
    public double Perimeter()
    {
        return(2*3.14*radius);
    }
    public static void main(String args[])
    {
        System.out.println("I am in main method");
        Circle objcir1 = new Circle();
        double Area = objcir1.Area();
        double Perimeter = objcir1.Perimeter();
        System.out.println("Area is"+) 
    }
}
