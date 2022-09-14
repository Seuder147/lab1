public class Main {
    public static void main(String[] arg){
        try{
            Employee man = new Employee("Nick","Black",300.30,45);
            man.output();
        }
        catch (FieldLengthLimitException e) {
            System.out.printf(e.getMessage());
        }
        catch (IncorrectSalaryException e)
        {
            System.out.println(e.getMessage());
        }

        try{
            Employee man = new Employee("Nicklaneloooooooooooooooo","Black",300.30,45);
            man.output();
        }
        catch (FieldLengthLimitException e) {
            System.out.printf(e.getMessage());
        }
        catch (IncorrectSalaryException e)
        {
            System.out.println(e.getMessage());
        }
        try{
            Employee man = new Employee("Nick","Black",-300.30,45);
            man.output();
        }
        catch (FieldLengthLimitException e) {
            System.out.printf(e.getMessage());
        }
        catch (IncorrectSalaryException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
