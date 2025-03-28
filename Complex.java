class Complex {
    int real,imag;
    Complex(int real, int imag)
    {
        this.real = real;
        this.imag = imag;
    }
    void add(Complex ab)
    {
        this.real = this.real + ab.real ;
        this.imag = this.imag + ab.imag ;
    }
    void display()
    {
        System.out.println("real: " + this.real + " imag" + this.imag);
    }
}