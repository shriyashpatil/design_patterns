package null_object_design_pattern.vehicle_details;

public class NullObject implements Vehicle{

    @Override
    public Integer getTankCapacity() {
        
        return 0;
        
    }

    @Override
    public Integer getSeatCapacity() {
       
        return 0;
    }
    
}
