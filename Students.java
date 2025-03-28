class Student {
    int rollno ;
    int m1 ;
    int m2 ;
    Student(int rollno, int m1, int m2) {
        this.rollno = rollno;
        this.m1 = m1;
        this.m2 = m2 ;
    }
    display() {
        System.out.println("rollno ="+this.rollno + "m1 = " + this.m1 + "m2 =" + this.m2);
    }
}
class Students() {
    public static void main(String[] args) {
        Student S1 = new Student() ;
        Student S2 = new Student() ;        
        S1.display();
        S2.display();
    }
}