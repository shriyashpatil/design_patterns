package null_object_design_pattern.vehicle_details;

public class Bike implements Vehicle {

    @Override
    public Integer getTankCapacity() {
        return 3;
    }

    @Override
    public Integer getSeatCapacity() {
        return 1;
    }
    
}
