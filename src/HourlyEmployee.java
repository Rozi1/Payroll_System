public class HourlyEmployee extends Employee {
    private double wage;
    private double hours;
    public HourlyEmployee(String first, String last, String ssn, double wages, double hour) {

        super(first, last, ssn);
        setHours(hour);
        setWage(wages);
    }
    public void setWage(double hourlyWage)
    {
        if(hourlyWage >= 0.0)
        {
            wage = hourlyWage;
        }
        else
            throw new IllegalArgumentException("Wages must be greater than or equal to 0.0");
    }
    public double getWage()
    {
        return wage;
    }
    public void setHours(double hour)
    {
        if(hour >= 0.0 && hour <= 168)
        {
            hours = hour;
        }
        else
            throw new IllegalArgumentException("Hours must be between 0 - 168");
    }
    public double getHours()
    {
        return hours;
    }

    @Override
    public double earnings() {
        if(getHours() <= 40)
        {
            return getWage() * getHours();
        }
        else
        {
            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
        }


    }

    @Override
    public String toString() {
        return String.format("Hourly Employee: %s\n%s: $%,.2f; %s: %,.2f", super.toString(),
                "Wages", getWage(), "Hours worked", getHours());
    }
}
