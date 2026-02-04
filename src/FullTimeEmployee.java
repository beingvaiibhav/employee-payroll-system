public class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(int id, String name, int age, double monthlySalary) {
        super(id, name, age);
        this.monthlySalary = monthlySalary;
    }
    @Override
    public double CalculateSalary() {
        return monthlySalary;
    }
}
