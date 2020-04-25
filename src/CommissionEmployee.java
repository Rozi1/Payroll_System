public class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String first, String last, String ssn, double sales, double rate) {

        super(first, last, ssn);
        setCommissionRate(rate);
        setGrossSales(sales);

    }
    public void setGrossSales(double gSales)
    {
        if(gSales > 0.0)
        {
            grossSales = gSales;
        }
        else
            throw new IllegalArgumentException("Gross sales must be greater than 0.0");

    }
    public double getGrossSales()
    {
        return grossSales;
    }
    public void setCommissionRate(double cRate)
    {
        if(cRate > 0.0 )
        {
            commissionRate = cRate;
        }
        else
            throw new IllegalArgumentException("Commission rate cannot be 0.0 ");
    }
    public double getCommissionRate()
    {
        return commissionRate;
    }

    @Override
    public double earnings() {
        return getGrossSales() * getCommissionRate();
    }

    @Override
    public String toString() {
        return String.format("%s: %s\n%s: $%,.2f; %s: %,.2f", "Commission Employee",
                super.toString(), "Gross Sales", getGrossSales(), "Commission rate", getCommissionRate());
    }
}
