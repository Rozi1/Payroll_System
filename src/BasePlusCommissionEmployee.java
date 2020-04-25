public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;
    public BasePlusCommissionEmployee(String first, String last, String ssn, double sales, double rate, double bSalary) {
        super(first, last, ssn, sales, rate);
        setBaseSalary(bSalary);
    }
    public void setBaseSalary(double salary)
    {
        if(salary > 0.0 )
        {
            baseSalary = salary;
        }
        else
            throw new IllegalArgumentException("Salary must be greater than 0.0");
    }
    public double getBaseSalary()
    {
        return baseSalary;
    }

    @Override
    public double earnings() {
        return getBaseSalary() + super.earnings();
    }

    @Override
    public String toString() {
        return String.format("%s: %s\n%s: $%,.2f","Base Salaried", super.toString(), "Base Salary", getBaseSalary());
    }
}
