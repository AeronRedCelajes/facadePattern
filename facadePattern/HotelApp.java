package facadePattern;
import java.util.Scanner;

public class HotelApp {
    public static void main(String[] args){

        /*
            Aeron Red R. Celajes
            3BSCS-1
            Lab Assignment 7 Facade Pattern
        */

        while (true){

            Scanner userInput = new Scanner(System.in);

            System.out.println("Welcome to Hotel App!");
            System.out.println("Service available:");
            System.out.println("1 - Valet Service");
            System.out.println("2 - HouseKeeping Service");
            System.out.println("3 - Cart Service");

            String serviceChoice = "";
            boolean validChoice = false;
            while (!validChoice) {
                System.out.print("\nFeel free to choose which service do you want, please choose a number: ");
                serviceChoice = userInput.nextLine();

                switch (serviceChoice){
                    case "1":
                    case "2":
                    case "3":
                        validChoice = true;
                        break;
                    default:
                        System.out.println("Invalid input choice. Please choose between 1-3.");
                }
            }

            //instantiate FrontDesk facade
            FrontDesk frontDesk = new FrontDesk();

            switch (serviceChoice){
                case "1":
                    System.out.println("\nVALLET SERVICE");
                    System.out.print("Please enter your plate number: ");
                    String plateNumber = userInput.nextLine();

                    //performs the valet service
                    HotelService valetService = new Valet(plateNumber);
                    frontDesk.specificHotelService(valetService);
                    break;
                case "2":
                    System.out.println("\nHOUSEKEEPING SERVICE");
                    System.out.print("Please enter your room number: ");
                    String roomNumber = userInput.nextLine();

                    //performs the housekeeping service
                    HotelService housekeepingService = new HouseKeeping(roomNumber);
                    frontDesk.specificHotelService(housekeepingService);
                    break;
                case "3":
                    boolean cartInputValid = false;

                    while(!cartInputValid)
                        try{
                            System.out.println("\nCART SERVICE");
                            System.out.print("Please enter the number of carts you wish: ");
                            int numberOfCarts = userInput.nextInt();
                            userInput.nextLine();

                            //performs the cart service
                            HotelService cartService = new Cart(numberOfCarts);
                            frontDesk.specificHotelService(cartService);
                            cartInputValid = true;

                        }catch (Exception e){
                            System.out.println("Invalid input, please try again.");
                            userInput.nextLine();
                        }
            }

            //questions the user to exit the program or not
            String exit = "";
            boolean validChoice2 = false;
            while (!validChoice2) {
                System.out.print("\nDo you still wish to use the program? 1 = yes, 2 = no: ");
                exit = userInput.nextLine();

                switch (exit){
                    case "1":
                    case "2":
                        validChoice2 = true;
                        break;
                    default:
                        System.out.println("Invalid input choice. Please choose between \"1\" or \"2\".");
                }
            }
            if(exit.equals("2")) {
                System.out.println("Thank you for using the program!");
                System.out.println("Exiting the program...");
                System.exit(0);
            }

            System.out.println();
        }
    }
}