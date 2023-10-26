package facadePattern;

public class HouseKeeping implements HotelService {
    private String roomNumber;

    public HouseKeeping(String roomNumber){
        this.roomNumber = roomNumber;
    }

    @Override
    public void executeHotelService(){
        cleanRoom(roomNumber);
    }

    //this is where implementation of cleanRoom occurs
    public void cleanRoom(String roomNumber){
        System.out.println("The housekeeper cleaning room number " + roomNumber + " is in process.");
    }
}