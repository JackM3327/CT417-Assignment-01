package AssignmentMain;

import java.util.ArrayList;


public class Module {

    private String moduleName;
    private String moduleID;
    private ArrayList<Student> studentList = new ArrayList();

    public Module(String moduleName, String moduleID) {
        this.moduleName = moduleName;
        this.moduleID = moduleID;
    }

    
    public String getModuleDetails() {
        return moduleID + " - " + moduleName;
    }

    
    public boolean addStudent(Student student) {
        if (!studentList.contains(student)) {
            studentList.add(student);
            student.addModule(this);
        }
        return true;
    }

    
    public void printStudentList() {
        for (Student student : studentList) {
            System.out.println(student.getUserName());
        }
    }
    
    
    public void printStudentDetails() {
        for (Student student : studentList) {
            student.printStudentDetails();
        }
    }
    
    
    public ArrayList<Student> getStudents() {
        return this.studentList;
    }


    public String getModuleName() {
        return moduleName;
    }

    
    public String getModuleID() {
        return moduleID;
    }
}
