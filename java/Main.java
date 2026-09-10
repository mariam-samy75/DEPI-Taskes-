
    

public class Main {
    public static void main(String[] args) {
       
        instructors drMina = new instructors(1, "Dr. Mina", "mina@example.com", "Testing Track");
        student mariam = new student(101, "Mariam", "mariam@example.com");
        courses javaCourse = new courses("CS101", "Java Fundamentals", 3);

        
        drMina.enrollStudentInCourse(mariam, javaCourse);
        drMina.updateStudentData(mariam, "Mariam Sami", "mariam.sami@example.com");

        
        grades javaGrade = new grades(101, "CS101", 95.0);
        grades testingGrade = new grades(101, "SW202", 88.5);

        mariam.addGrade(javaGrade);
        mariam.addGrade(testingGrade);

        
        System.out.println("\n--- Student Details ---");
        mariam.displayDetails();

        System.out.println("\n--- Student Transcript ---");
        mariam.printTranscript();
    }
}