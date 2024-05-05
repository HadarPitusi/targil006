import java.util.Objects;

public class HourlyEmployee extends Employee {
    int hours;
    float wage;


    /**
     * hours- num of hours the employee worked per week
     * wage- Hourly payment for this employee
     */
    public HourlyEmployee() {
        this.hours=0;
        this.wage=0;
    }

    public HourlyEmployee(String firstName, String lastName, int id, int hours, float wage) {
        super(firstName, lastName, id);
        if(hours<0||wage<0)
            throw new IllegalArgumentException("ERROR");
        this.hours = hours;
        this.wage = wage;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if(hours<0)
            throw new IllegalArgumentException("ERROR");
        this.hours = hours;
    }

    public float getWage() {
        return wage;
    }

    public void setWage(float wage) {
        if(wage<0)
            throw new IllegalArgumentException("ERROR");
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", id=" + getId() +
                ", hours=" + hours +
                ", wage=" + wage +
                "} ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HourlyEmployee that)) return false;
        if (!super.equals(o)) return false;
        return hours == that.hours && Float.compare(wage, that.wage) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hours, wage);
    }

    /**
     * @return employee's salary= The number of hours times the hourly salary
     */
    @Override
    public float earnings() {
        return (float)(hours*wage);
    }
}
