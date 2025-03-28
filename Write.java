class Write {
    public static void main(String[] args) {
        Complex C1 = new Complex(3,2) ;
        Complex C2 = new Complex(5,3);
        C1.display();
        C2.display();
        C1.add(C2);
        C1.display(); 
    }
}
