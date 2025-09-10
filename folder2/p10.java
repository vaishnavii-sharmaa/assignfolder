class Student1 {
    public int rollNumber;
    protected String name;
    private double CGPA;

    Student1(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
}

class PostgraduateStudent extends Student1 {
    String specialization;

    PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    public void displayDetails() {
        System.out.println("Roll No: " + rollNumber + ", Name: " + name +
                           ", CGPA: " + getCGPA() + ", Specialization: " + specialization);
    }
}

public class p10 {
    public static void main(String[] args) {
        Student1 s1 = new Student1(101, "Alice", 8.5);
        System.out.println("Student Roll No: " + s1.rollNumber + ", Name: " + s1.name + ", CGPA: " + s1.getCGPA());
        s1.setCGPA(9.0);
        System.out.println("Updated CGPA: " + s1.getCGPA());

        PostgraduateStudent pg = new PostgraduateStudent(201, "Bob", 9.2, "Computer Science");
        pg.displayDetails();
    }
}