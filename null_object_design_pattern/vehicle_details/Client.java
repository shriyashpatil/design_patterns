package null_object_design_pattern.vehicle_details;

public class Client {

    public static void main(String args[]){

        Vehicle car = VehicleFactory.getVehicle("car");
        
        printVehilceDetails(car);

        Vehicle bike = VehicleFactory.getVehicle("bike");
        
        printVehilceDetails(bike);

        Vehicle truck = VehicleFactory.getVehicle("truck");

        printVehilceDetails(truck);

    }


    public static void printVehilceDetails(Vehicle v){

        System.out.println("Seat capacity : "+v.getSeatCapacity());
        System.out.println("Tank capacity : "+v.getTankCapacity());

    }
    
}
