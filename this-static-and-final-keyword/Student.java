class Student {
    static String universityName = "GLA University";
    static int totalStudents = 0;

    final int rollNumber;
    String name;
    char grade;

    Student(int rollNumber, String name, char grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    void displayDetails() {
        if (this instanceof Student) {
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student(101, "Alice", 'A');
        s1.displayDetails();
        Student.displayTotalStudents();
    }
}