public class PayRollTest {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("Adnan", "Khan",
                "11111-11111111-1", 500);
        System.out.println();
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Aadarsh", "Haideri",
                "22222-22222222-2", 50, 40);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Haroon", "Bhatti", "22222-1234567-3",
                400, 0.9);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Ayehsa", "Naeem",
                "2222-33456789-1", 450, 0.9, 300);

        System.out.println("Employees Processed");

        System.out.printf("%s\n%s: $%, .2f", salariedEmployee, "Earned", salariedEmployee.earnings());
        System.out.println();
        System.out.printf("%s\n%s: $%, .2f", hourlyEmployee, "Earned", hourlyEmployee.earnings());
        System.out.println();
        System.out.printf("%s\n%s: $%, .2f", commissionEmployee, "Earned", commissionEmployee.earnings());
        System.out.println();
        System.out.printf("%s\n%s: $%, .2f", basePlusCommissionEmployee, "Earned", basePlusCommissionEmployee.earnings());

    }
}
