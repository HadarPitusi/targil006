public class BasePlusCommissionEmployee extends  CommissionEmployee{
    float baseSalary;

    /**
     * baseSalary- the basic salary of the employee
     */
    public BasePlusCommissionEmployee() {
        this.baseSalary = 0;
    }

    public BasePlusCommissionEmployee(String firstName, String lastName, int id, float grossSales, int commision, float baseSalary) {
        super(firstName, lastName, id, grossSales, commision);
        if(baseSalary < 0)
            throw new IllegalArgumentException("ERROR");
        this.baseSalary = baseSalary;
    }

    public float getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(float baseSalary) {
        if(baseSalary < 0)
            throw new IllegalArgumentException("ERROR");
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return "BasePlusCommissionEmployee{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", id=" + getId() +
                ", grossSales=" + grossSales +
                ", commision=" + commision +
                ", baseSalary=" + baseSalary +
                "} ";
    }

    /**
     * @return employee's salary= Base salary + commission divided by 100 times sales
     */
    @Override
    public float earnings() {
        return (float) (super.earnings()+baseSalary);
    }
}
