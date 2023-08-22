package null_object_design_pattern.vehicle_details;

public class Car implements Vehicle{

    @Override
    public Integer getTankCapacity() {
        return 13;
    }

    @Override
    public Integer getSeatCapacity() {
        return 4;
    }
    
}
