package facadePattern;

public class Cart implements HotelService {
    private int numberOfCarts;

    public Cart(int numberOfCarts){
        this.numberOfCarts = numberOfCarts;
    }

    @Override
    public void executeHotelService(){
        requestCart(numberOfCarts);
    }

    //this is where implementation of requestCart occurs
    public void requestCart(int numberOfCarts){
        System.out.println("Guest requested " + numberOfCarts + " carts. Carts incoming.");
    }
}