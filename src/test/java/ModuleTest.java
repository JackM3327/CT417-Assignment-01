import static org.junit.Assert.*;

import java.util.ArrayList;

import org.joda.time.DateTime;
import org.junit.Test;

import AssignmentMain.Module;
import AssignmentMain.Student;

public class ModuleTest {
    
	DateTime sampleDOB = new DateTime(1996, 06, 13, 4, 20);
    
    Student student1 = new Student("Jack", 24, sampleDOB);
    Student student2 = new Student("John", 20, sampleDOB);
    Student student3 = new Student("Mary", 41, sampleDOB);
    
    Module module1 = new Module("Software Engineering 3", "CT417");
    Module module2 = new Module("Machine Learning", "CT4101");
    
    public ModuleTest() {
    }
    

    @Test
    public void testAddStudent() {
        System.out.println("addStudent");
        Student student = student1;
        Module instance = module1;
        boolean expResult = true;
        boolean result = instance.addStudent(student);
        assertEquals(expResult, result);
    }


    @Test
    public void testPrintStudentList() {
        System.out.println("printStudentList");
        Module instance1 = module1;
        instance1.addStudent(student1);
        instance1.addStudent(student2);
        instance1.printStudentList();
    }


    @Test
    public void testGetModuleDetails() {
        System.out.println("getModuleDetails");
        Module instance = module1;
        String expResult = "Software Engineering 3";
        String result = instance.getModuleDetails();
        assertEquals(expResult, result);
    }


    @Test
    public void testPrintStudentDetails() {
        System.out.println("printStudentDetails");
        Module instance = module2;
        instance.printStudentDetails();
    }


    @Test
    public void testGetStudents() {
        System.out.println("getStudents");
        Module instance = module1;
        module1.addStudent(student1);
        ArrayList<Student> expResult = new ArrayList();
        expResult.add(student1);
        ArrayList<Student> result = instance.getStudents();
        assertEquals(expResult, result);
    }


    @Test
    public void testGetModuleName() {
        System.out.println("getModuleName");
        Module instance = module1;
        String expResult = "Software Engineering 3";
        String result = instance.getModuleName();
        assertEquals(expResult, result);
    }


    @Test
    public void testGetModuleID() {
        System.out.println("getModuleID");
        Module instance = module2;
        String expResult = "CT4101";
        String result = instance.getModuleID();
        assertEquals(expResult, result);
    }
    
}
