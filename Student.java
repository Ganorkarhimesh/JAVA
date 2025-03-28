class Student {
    int age;
    int marks ;
    Student()
    {
        age = 18;
        marks = 2 ; 
    }
    void Setage(int a)
    {
       age = a;
    }
    void  Setmark(int m)
    {
        marks = m;
    }
    void display()
    {
        System.out.println("marks=","+age",);
    }
}
class Test {
    public Static void main(String args[])
    {
        Student Himesh = new Student() ;
        Student.display();
        Student.Setage();
        Student.Setmark();
    }
}