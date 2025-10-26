/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.Person.Student;

import university.Department.Department;
import java.util.ArrayList;
import university.Person.Person;

/**
 *
 * @author sange
 */
public class StudentDirectory {

    Department department;
    ArrayList<StudentProfile> studentlist;

    public StudentDirectory() {
        studentlist = new ArrayList();
    }

    public StudentDirectory(Department d) {

        department = d;
        studentlist = new ArrayList();

    }

    public StudentProfile newStudentProfile(Person p) {

        StudentProfile sp = new StudentProfile(p);
        studentlist.add(sp);
        return sp;
    }

    public StudentProfile findStudent(String id) {

        for (StudentProfile sp : studentlist) {

            if (sp.isMatch(id)) {
                return sp;
            }
        }
        return null; //not found after going through the whole list
    }
    
    public StudentProfile findStudentUsingNuid(String nuId) {

        for (StudentProfile sp : studentlist) {

            if (sp.isNuIdMatch(nuId)) {
                return sp;
            }
        }
        return null; //not found after going through the whole list
    }

}
