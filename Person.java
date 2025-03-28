
class Person {
    int age ;
    void SetAge(int age) 
    {
        this.age = age ;
    }
    void display() 
    {
        System.out.println("age="+age);
    }
    void checkobject(Person obj)
    {
        if(this age == P2.age)
        {
         System.out.println("We are equal");
        }
        else{
            System.out.println("We are not equal");
        }
    }
}
class Test 
{
    public static void main(String[] args) {
        Person p1  = new Person();
        p1.SetAge(20);
        p1.display();
        Person p2 = new Person();
        p2.SetAge(20);
        p2.display();
        p1.checkobject(p2);
        Person p3 = new Person();
        p3.SetAge(3);
        p3.checkobject(p1);
    }
}
