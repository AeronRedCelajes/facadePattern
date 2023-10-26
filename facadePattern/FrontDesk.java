package facadePattern;

public class FrontDesk {
    public void specificService (HotelService hotelService){
        hotelService.executeHotelService();
    }
}