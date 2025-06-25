class Employee {
    static String companyName = "Tech Solutions";
    static int employeeCount = 0;

    final int id;
    String name, designation;

    Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        employeeCount++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + employeeCount);
    }

    void displayDetails() {
        if (this instanceof Employee) {
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Designation: " + designation);
        }
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Alice", "Developer");
        Employee emp2 = new Employee(2, "Bob", "Manager");
        emp1.displayDetails();
        emp2.displayDetails();
        Employee.displayTotalEmployees();
    }
}