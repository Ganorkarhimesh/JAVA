class Pizza 
{
   String name = "Pizza";
   float price = 250;
   public void bake()
   {
     System.out.println("Pizza Bake");
   }
   public void cut()
   {
     System.out.println("Pizza cut");
   }
   public void pack()
   {
     System.out.println("Pizza Packs");
   }
   public static void main(String args[])
   {
      System.out.println("I am in main method");
      Pizza cornpizza = new Pizza();
      cornpizza.bake();
      cornpizza.cut();
      cornpizza.pack();
      System.out.println("name = "+cornpizza.name);
      System.out.println("price = "+cornpizza.price);
      
   }

}