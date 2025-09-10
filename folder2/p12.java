public class p12 {
    static class Employee {
        public int employeeID;
        protected String department;
        private double salary;

        public Employee(int employeeID, String department, double salary) {
            this.employeeID = employeeID;
            this.department = department;
            this.salary = salary;
        }

        public void setSalary(double newSalary) {
            if (newSalary >= 0) {
                this.salary = newSalary;
            } else {
                System.out.println("Salary cannot be negative.");
            }
        }

        public double getSalary() {
            return salary;
        }
    }

    static class Manager extends Employee {
        public Manager(int employeeID, String department, double salary) {
            super(employeeID, department, salary);
        }

        public int getEmployeeID() {
            return this.employeeID;
        }

        public String getDepartment() {
            return this.department;
        }
    }
}
