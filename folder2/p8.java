class Course {
    String courseName;  
    int duration;        
    double fee;         
    static String instituteName = "Default Institute";  

   
    Course(String name, int dur, double f) {
        courseName = name;
        duration = dur;
        fee = f;
    }

    
    void displayCourseDetails() {
        System.out.println("Course: " + courseName + 
                           ", Duration: " + duration + " months" +
                           ", Fee: " + fee +
                           ", Institute: " + instituteName);
    }

   
    static void updateInstituteName(String newName) {
        instituteName = newName;
        System.out.println("✅ Institute name updated to: " + instituteName);
    }
}

public class p8 {
    public static void main(String[] args) {
        
        Course c1 = new Course("Java Programming", 3, 5000.0);
        Course c2 = new Course("Data Science", 6, 15000.0);

        
        c1.displayCourseDetails();
        c2.displayCourseDetails();

       
        Course.updateInstituteName("Tech Academy");

       
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}