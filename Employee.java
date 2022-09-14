public class Employee {
    private int id;
    private int nextid;
    private String name;
    private String surname;
    private Double salary;

    public Employee(){
        name = "None";
        surname = "None";
        salary = 0.0;
        id = 0;
    }
    public Employee (String name,String surname,Double salary,int id) throws FieldLengthLimitException,IncorrectSalaryException{
        if (name.length() <= FieldLengthLimitException.maxleight){
            this.name = name;
        }
        else{
            throw new FieldLengthLimitException("Your String is too long \n");
        }
        if (surname.length() <= FieldLengthLimitException.maxleight){
            this.surname = surname;
        }
        else{
            throw new FieldLengthLimitException("Your String is too long \n");
        }
        if(salary > 0){
            this.salary = salary;
        }
        else{
            throw new IncorrectSalaryException("Salary cant be negative \n");
        }
        if(id > 0){
            this.id = id;
        }
        else{
            throw new IncorrectSalaryException("Id cant be negative \n");
        }
    }

    public void output(){
        System.out.println("Name "+ name + " Surname "+ surname + " Salary " + salary + " ID " + id);
        return;
    }
}
