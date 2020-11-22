import org.joda.time.DateTime;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import AssignmentMain.Course;
import AssignmentMain.Module;
import AssignmentMain.Student;

import static org.junit.Assert.*;


public class CourseTest {
    
	DateTime sampleDOB = new DateTime(1996, 06, 13, 4, 20);
    
    DateTime startDate = new DateTime(2020, 9, 28, 0, 0);
    DateTime endDate = new DateTime(2021, 6, 4, 0, 0);
    
    Student student1 = new Student("Jack", 17508126, sampleDOB);
    Student student2 = new Student("John", 17809321, sampleDOB);
    Student student3 = new Student("Mary", 16657341, sampleDOB);
    
    Module module1 = new Module("Software Engineering 3", "CT417");
    Module module2 = new Module("Machine Learning", "CT4101");
    
    Course course1 = new Course("CS&IT", startDate, endDate);
    
    public CourseTest() {
        
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    
    @Test
    public void testAddModule() {
        System.out.println("addModule");
        module1.addStudent(student1);
        module1.addStudent(student3);
        module2.addStudent(student3);
        module2.addStudent(student2);
        Module module = module1;
        Module module3 = module2;
        Course instance = course1;
        instance.addModule(module);
        instance.addModule(module3);
        course1.printStudentDetails();
    }


    @Test
    public void testGetCourseName() {
        System.out.println("getCourseName");
        Course instance = course1;
        String expResult = "CS&IT";
        String result = instance.getCourseName();
        assertEquals(expResult, result);
    }


    @Test
    public void testAddStudent() {
        System.out.println("addStudent");
        Student student = student3;
        Course instance = course1;
        instance.addStudent(student);
    }


    @Test
    public void testPrintStudentUsernames() {
        System.out.println("printStudentUsernames");
        
        Course instance = course1;
        instance.addStudent(student1);
        instance.printStudentUsernames();
    }


    @Test
    public void testPrintModuleList() {
        System.out.println("printModuleList");
        Course instance = course1;
        instance.addModule(module1);
        instance.printModuleList();
    }


    @Test
    public void testGetStartDate() {
        System.out.println("getStartDate");
        Course instance = course1;
        DateTime expResult = startDate;
        DateTime result = instance.getStartDate();
        assertEquals(expResult, result);
    }


    @Test
    public void testGetEndDate() {
        System.out.println("getEndDate");
        Course instance = course1;
        DateTime expResult = endDate;
        DateTime result = instance.getEndDate();
        assertEquals(expResult, result);
    }


    @Test
    public void testPrintStudentDetails() {
        System.out.println("printStudentDetails");
        Course instance = course1;
        instance.printStudentDetails();
    }
}
