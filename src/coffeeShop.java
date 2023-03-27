public class coffeeShop {

    public static void main(String[] args){
        coffee ("cappucino", 4.50);
        coffee ("Moccha", 3.50);
        coffee ("Flat White", 4.00);
    }
    static void coffee (String orderName, double price){
        System.out.println("You've ordered " + orderName + " and the price is  " + price);
    }
}
