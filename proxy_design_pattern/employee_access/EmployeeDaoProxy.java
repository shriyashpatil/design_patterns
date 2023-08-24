package proxy_design_pattern.employee_access;

public class EmployeeDaoProxy implements EmployeeDao{

    EmployeeDaoImpl employeeDaoImpl;

    public EmployeeDaoProxy(){

        employeeDaoImpl = new EmployeeDaoImpl();
    }

    @Override
    public void create(String client,EmployeeDao employeeDao) throws Exception {
        
        if(client.equals("ADMIN")){

            employeeDaoImpl.create(client, employeeDao);

        }else{

            throw new Exception("ACCESS-DENIED");
        }

     
    }

    @Override
    public void get(String client) throws Exception{
        
        if(client.equals("USER")||client.equals("ADMIN")){

            employeeDaoImpl.get(client);
            
        }else{

            throw new Exception("ACCESS-DENIED");
        }
    }

    @Override
    public void delete(String client,EmployeeDao employeeDao) throws Exception {
        if(client.equals("ADMIN")){

            employeeDaoImpl.delete(client, employeeDao);
            
        }else{

            throw new Exception("ACCESS-DENIED");
        }
    }
    
}
