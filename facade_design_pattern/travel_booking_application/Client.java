package facade_design_pattern.travel_booking_application;

public class Client {

    public static void main(String args[]){

        TravelBookingFacade travelBookingFacade = new TravelBookingFacade();

        travelBookingFacade.bookMyTrip("Kashmir", "26/08/2023", "10/09/2023", "SUV", "Taj");

    }
    
}
