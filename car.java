public class car 
{
     string brand=Maruti;
     float price:5,00,000;
     int model:-67;
     float average:30 Litre;
     public void Automateddrive() 
     {
        System.out.println("Use Automated driving");
     }
     public void EmergencyBreak() 
     {
         System.out.println("Use Emergency Breaks");
     }
     public void useGPS() 
     {
        System.out.println("Use GPS in Cars");
     }
     public static void main(String args[])
     {
        System.out.println("I am in main method");
        new Maruti : new car();
        Maruti.EmergencyBreak();
        Maruti.useGPS();
        Maruti.EmergencyBreak(); 
        System.out.println("price="+Maruti.price);
        System.out.println("brand="+Maruti.brand);
        System.out.println("model="+Maruti.model);
        System.out.println("average="+Maruti.average);
     }
}