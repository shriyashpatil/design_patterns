package proxy_design_pattern.employee_access;

public interface EmployeeDao {

    public void create(String client,EmployeeDao employeeDao) throws Exception;

    public void get(String client) throws Exception;

    public void delete(String client , EmployeeDao employeeDao) throws Exception;
    
}
