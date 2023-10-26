package facadePattern;

public class Valet implements HotelService {
    private String plateNumber;

    public Valet(String plateNumber){
        this.plateNumber = plateNumber;
    }

    @Override
    public void executeHotelService(){
        pickUpVehicle(plateNumber);
    }

    //this is where implementation of pickUpVehicle occurs
    public void pickUpVehicle(String plateNumber){
        System.out.println("The valet picking up the vehicle with the plate number " + plateNumber + " is in process.");
    }
}