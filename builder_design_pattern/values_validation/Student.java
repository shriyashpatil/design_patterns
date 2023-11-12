package values_validation;
public class Student{

    private String name;
    private int age;
    private int psp;
    private phoneNumber;

    private Student(String name,int age, int psp, int phoneNumber){
        this.name = name;
        this.age = age;
        this.psp = psp;
        this.phoneNumber = phoneNumber;
    }

    public static  Builder builder(){
        return new Builder();
    }

    private class Builder{
        private String name;
        private int age;
        private int psp;
        private String phoneNumber;

        public Builder name(String name){
            this.name = name;
            return this;
        }
        public Builder age(int age){
            this.age = age;
            return this;
        }
        public Builder psp(int psp){
            this.psp = psp;
            return this;
        }
        public Builder phoneNumber(String phoneNumber){
            this.phoneNumber = phoneNumber;
            return this;
        }
        private void validate(){
            if(age>20) throw new Exception();
        }
        public Student build() {
            validate();
            return new Student(String name, int age, int psp, int phoneNumber);
        }
    }


}