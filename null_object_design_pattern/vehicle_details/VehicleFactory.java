package null_object_design_pattern.vehicle_details;

public class VehicleFactory {

    public static Vehicle getVehicle(String vehicle){

        if(vehicle.equals("car")){

            return new Car();
        }

        else if(vehicle.equals("bike")){

            return new Bike();
        }


        return new NullObject();
    }

    
}
