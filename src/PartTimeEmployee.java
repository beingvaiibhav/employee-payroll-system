public class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    PartTimeEmployee(int id, String name, int age, int hourlyRate, double hoursWorked) {
        super(id, name, age);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hourlyRate;
    }
    @Override
    public double CalculateSalary() {
        return hourlyRate * hoursWorked;
        System.out.println("The salary is " + CalculateSalary() );
    }
}
