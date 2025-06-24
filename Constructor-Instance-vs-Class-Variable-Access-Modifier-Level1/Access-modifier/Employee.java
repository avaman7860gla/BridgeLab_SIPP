class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void updateSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void showInfo() {
        System.out.println("ID: " + employeeID + ", Department: " + department + ", Salary: ₹" + getSalary());
    }

    public static void main(String[] args) {
        Manager mgr = new Manager(501, "HR", 75000.0);
        mgr.showInfo();
        mgr.updateSalary(80000.0);
        System.out.println("Updated Salary: ₹" + mgr.getSalary());
    }
}
