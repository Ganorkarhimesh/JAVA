class Employee {
    float Salary = 20000 ;
    void display() 
    {
        System.out.println("Salary"+Salary);
    }
}
class Program extends Employee 
{
    int bonus = 15000 ;
    void displaybonus()
    {
        System.out.println("bonus="+bonus);
    }
}
class Text 
{
    public static void main(String args[])
    {
        Program P1 = new Program() ;
        P1.display();
        P1.displayname() ;
    }
}

