package AssignmentMain;

import java.util.ArrayList;

import org.joda.time.DateTime;
import org.joda.time.Years;

public class Student {

    private String name;
    private int age;
    private DateTime DOB;
    private int ID;
    private String userName;
    private ArrayList<Module> Modules = new ArrayList();
    private Course course;


    public Student(String name, int ID, DateTime DOB) {
        this.name = name;
        this.DOB = DOB;
        this.ID = ID;
        this.age = this.getAge();
        this.userName = this.getUserName();
    }


    public String getUserName() {
        return name + age;
    }


    public int getAge() {
        Years TimeDiff = Years.yearsBetween(this.DOB, new DateTime());
        return TimeDiff.getYears();
    }


    public void addModule(Module module) {
        // Adds Student to Module if they haven't already been added 
        if (!Modules.contains(module)) {
            Modules.add(module);
            module.addStudent(this);
        }
    }

    
    public boolean addCourse(Course course) {
        if (course != null) {
            this.course = course;
            return true;
        } else {
            return false;
        }
    }

    public void printStudentDetails() {

        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student ID: " + ID);
        System.out.println("Username: " + userName);
        System.out.println("Course: " + course.getCourseName());
        System.out.println("Modules: ");
        for (Module module : Modules) {
            System.out.println(module.getModuleDetails());
        }
        System.out.println("--------------------");
    }
}
