import java.util.Objects;

public abstract class Employee {
    private String firstName;
    private String lastName;
    private int id;


    /**
     * firstName- the first name of the employee
     * lastName- the last name of the employee
     * id- the id of the employee
     */
    public Employee() {
        this.firstName = "plony";
        this.lastName = "almony";
        this.id = 0;
    }

    public Employee(String firstName, String lastName, int id) {
        if(id<0)
            throw new IllegalArgumentException("ERROR");
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return id == employee.id && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                '}';
    }

    /**
     * @return the employee's salary
     */
    public abstract float earnings();
}
