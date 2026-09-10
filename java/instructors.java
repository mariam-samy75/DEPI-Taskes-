


public class instructors extends person {
    private String department; 
    
    public instructors(int id, String name, String email, String department) {
        super(id, name, email); 
        this.department = department;
    }
   
    public String getDepartment() {
        return department;
    }

    public void enrollStudentInCourse(student student, courses course) {
        student.getEnrolledCourses().add(course);
    }

    public void updateStudentData(student student, String name, String email) {
        student.setName(name);
        student.setEmail(email);
    }

   @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Instructor | Department: " + department);
    }

    
}
    
