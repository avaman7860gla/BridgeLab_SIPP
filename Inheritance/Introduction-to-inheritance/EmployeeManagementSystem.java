
class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println(name + " | ID: " + id + " | Salary: $" + salary);
    }
}

class Manager extends Employee {
    int teamSize;

    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, int id, double salary, String language) {
        super(name, id, salary);
        this.programmingLanguage = language;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Language: " + programmingLanguage);
    }
}

class Intern extends Employee {
    int internshipDuration;

    Intern(String name, int id, double salary, int duration) {
        super(name, id, salary);
        this.internshipDuration = duration;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration: " + internshipDuration + " months");
    }
}
