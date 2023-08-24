package proxy_design_pattern.employee_access;

public class Client {
    
    public static void main(String args[]){


        EmployeeDao employeeDao = new EmployeeDaoProxy();

        try{
            
            employeeDao.create("USER", employeeDao);
            System.out.println("Success");    

        }catch(Exception e){
            System.out.println(e.getMessage());
        }    
    }

}
