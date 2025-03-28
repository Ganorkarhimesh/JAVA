class Shape {
    int Length ;
    int Breadth ;
    int Height ;
    Shape()
    {
        Length = 0 ;
        Breadth = 0 ;
        Height = 0 ;
    }
    void area(int l, int b, int h)
    {
        Length = l;
        Breadth = b;
        Height = h;
        int Result = Length*Breadth*Height ; 
    }
    void area(int l, int b) 
    {
        Length = l;
        Breadth = b;
        int Result = Length*Breadth ;
    }
    void area(int l)
    {
        Length = l;
        int Result = Length*Length ;
    }
}
S