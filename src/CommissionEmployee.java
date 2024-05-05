import java.util.Objects;

public class CommissionEmployee extends Employee{
    float grossSales;
    int commision;

    /**
     * grossSales- Profits from a week's sales
     * commision- Percentage commission the employee receives from his sales
     */
    public CommissionEmployee() {
        this.grossSales=0;
        this.commision=0;
    }

    public CommissionEmployee(String firstName, String lastName, int id, float grossSales, int commision) {
        super(firstName, lastName, id);
        if(grossSales<0||commision<0)
            throw new IllegalArgumentException("ERROR");
        this.grossSales = grossSales;
        this.commision = commision;
    }

    public float getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(float grossSales) {
        if(grossSales<0)
            throw new IllegalArgumentException("ERROR");
        this.grossSales = grossSales;
    }

    public int getCommision() {
        return commision;
    }

    public void setCommision(int commision) {
        if(commision<0)
            throw new IllegalArgumentException("ERROR");
        this.commision = commision;
    }

    @Override
    public String toString() {
        return "CommissionEmployee{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", id=" + getId() +
                ", grossSales=" + grossSales +
                ", commision=" + commision +
                "} ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CommissionEmployee that)) return false;
        if (!super.equals(o)) return false;
        return Float.compare(grossSales, that.grossSales) == 0 && commision == that.commision;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), grossSales, commision);
    }

    /**
     * @return employee's salary= commission divided by 100 times sales
     */
    @Override
    public float earnings() {
        return (float) ((commision*0.01)*grossSales);
    }
}

