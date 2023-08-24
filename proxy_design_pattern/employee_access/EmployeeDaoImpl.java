package proxy_design_pattern.employee_access;

public class EmployeeDaoImpl implements EmployeeDao{

    @Override
    public void create(String client,EmployeeDao employeeDao) {
        
        System.out.println("employeedao created successfully");

    }

    @Override
    public void get(String client) {
        
        System.out.println("get employee");

    }

    @Override
    public void delete(String client,EmployeeDao employeeDao) {
        
        System.out.println("delete employee");

    }
    
}
