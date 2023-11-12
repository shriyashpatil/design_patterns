package values_validation;

public class Client{
    public static void main(String args[]){
       Student student = Student.builder()
                                .name("shriyash")
                                .age(21)
                                .psp(100)
                                .phoneNumber("9921502351")
                                .build();
    }
}