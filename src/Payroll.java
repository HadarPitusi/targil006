public class Payroll {
    public static void main(String[] args) {

        Employee[] employees = new Employee[3];
        try {
            employees[0] = new HourlyEmployee("Hadar", "Pitusi", 111, 50, 75);
            employees[1] = new CommissionEmployee("Ben", "Levi", 222, -7500, 10);
            employees[2] = new BasePlusCommissionEmployee("Shir", "Navon", 333, 9876, 12, 5000);
        } catch (Exception e) {System.out.println(e);}


        for(int i=0; i<3;i++) {
            double number = employees[i].earnings();
            System.out.println(employees[i]);

            /** 10% bonus to BasePlusCommissionEmployee */
            if(employees[i] instanceof BasePlusCommissionEmployee) {
                number = employees[i].earnings() * 1.1; //bonus
            }

            String rightFormat = String.format("%.2f", number);
            System.out.println("The weekly salary: " + rightFormat);
        }

    }
}
