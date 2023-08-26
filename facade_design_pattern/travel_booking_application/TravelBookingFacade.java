package facade_design_pattern.travel_booking_application;

public class TravelBookingFacade {

    CarRental carRental;
    FlightBooking flightBooking;
    HotelReservation hotelReservation;

    public TravelBookingFacade(){

        carRental = new CarRental();
        flightBooking = new FlightBooking();
        hotelReservation = new HotelReservation();

    }

    public void bookMyTrip(String destination,String start_date,String end_date, String carType, String hotelName){

        /// flight booking
        flightBooking.bookFlight("HOME", destination,start_date);

        /// rent a car
        carRental.rentCar(carType, start_date, end_date);

        //. book a hotel
        hotelReservation.bookHotel(start_date, end_date, hotelName);

    }
    
}
