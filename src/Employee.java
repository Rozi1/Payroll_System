public abstract class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public Employee(String first, String last, String ssn)
    {
       setFirstName(first);
       setLastName(last);
       setSocialSecurityNumber(ssn);
    }
    public void setFirstName(String f)
    {
        firstName = f;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public void setLastName(String l)
    {
        lastName = l;

    }
    public String getLastName()
    {
        return lastName;
    }
    public void setSocialSecurityNumber(String s)
    {
        socialSecurityNumber = s;
    }
    public String getSocialSecurityNumber()
    {
        return socialSecurityNumber;
    }

    public String toString()
    {
        return String.format("%s %s\n%s: %s", getFirstName(), getLastName(), "" +
                "Social-Security Number", getSocialSecurityNumber());
    }
    public abstract double earnings();

}
