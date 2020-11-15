import org.joda.time.DateTime;
import org.junit.Test;

import AssignmentMain.Course;
import AssignmentMain.Module;
import AssignmentMain.Student;

import static org.junit.Assert.*;

public class StudentTest {
    
    DateTime sampleDOB = new DateTime(1996, 06, 13, 4, 20);
    
    DateTime startDate = new DateTime(2020, 9, 28, 0, 0);
    DateTime endDate = new DateTime(2021, 6, 4, 0, 0);
    
    Student student1 = new Student("Jack", 24, sampleDOB);
    Student student2 = new Student("John", 20, sampleDOB);
    Student student3 = new Student("Mary", 41, sampleDOB);
    
    Module module1 = new Module("Software Engineering 3", "CT417");
    Module module2 = new Module("Machine Learning", "CT4101");
    
    Course course1 = new Course("CS&IT", startDate, endDate);
    
    public StudentTest() {
    }
    

    @org.junit.Test
    public void testGetUserName() {
        System.out.println("getUserName");
        Student instance = student1;
        String expResult = "Jack24";
        String result = instance.getUserName();
        assertEquals(expResult, result);
    }


    @Test
    public void testGetAge() {
        System.out.println("getAge");
        Student instance = student1;
        int expResult = 24;
        int result = instance.getAge();
        assertEquals(expResult, result);
    }


    @Test
    public void testAddModule() {
        System.out.println("addModule");
        Module module = module1;
        Student instance = student1;
        instance.addModule(module);
    }


    @Test
    public void testAddCourse() {
        System.out.println("addCourse");
        Course course = course1;
        Student instance = student1;
        boolean expResult = true;
        boolean result = instance.addCourse(course);
        assertEquals(expResult, result);
    }


    @Test
    public void testPrintStudentDetails() {
        System.out.println("printStudentDetails");
        Student instance = student1;
        student1.addCourse(course1);
        student1.addModule(module1);
        instance.printStudentDetails();
    }
}
