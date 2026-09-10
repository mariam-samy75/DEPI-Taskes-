import java.util.ArrayList;
import java.util.List;

public class student extends person {
    private List<courses> enrolledCourses;

    public student(int id, String name, String email) {
     super(id, name, email);
    
        this.enrolledCourses = new ArrayList<>(); 
    }
public List<courses> getEnrolledCourses() {
        return enrolledCourses;
    }
@Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Registered Courses: " + enrolledCourses.size());

    
}
public void dropCourse(courses course) {
    enrolledCourses.remove(course);
}

// أضيفي هذا المتغير والدالة داخل كلاس student
private List<grades> studentGrades = new ArrayList<>();

public void addGrade(grades grade) {
    this.studentGrades.add(grade);
}

public void printTranscript() {
    System.out.println("=== Academic Grades for " + getName() + " ===");
    for (grades g : studentGrades) {
        System.out.println("Score: " + g.getScore() + 
                           " | Grade: " + g.calculateLetterGrade());
    }
}
}
