public class OnlineShoppingPortal {
    void checkout(double cartvalue) {
        double discountedAmount;
        double discount;
        if (cartvalue > 1000) {
            discount = cartvalue * 0.30;
        } else {
            discount = cartvalue * 0.20;
        }
        discountedAmount = cartvalue - discount;
        System.out.println("Discounted amount is: " + discountedAmount);
    }

    void checkout(double cartvalue, String promocode) {
        double discount = 0;
        double discountedcartvalue = cartvalue;

        if (cartvalue < 500) {
            discountedcartvalue -= 10;  // Applying flat discount
        } 
        else if (cartvalue > 500 && promocode.equalsIgnoreCase("GET10")) { 
            discount = cartvalue * 0.10;
        }

        double discountedAmount = discountedcartvalue - discount;
        System.out.println("Discounted amount is: " + discountedAmount);
    }
}
