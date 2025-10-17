/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.example;

import university.CourseCatalog.Course;
import university.CourseCatalog.CourseCatalog;
import university.CourseSchedule.CourseLoad;
import university.CourseSchedule.CourseOffer;
import university.CourseSchedule.CourseSchedule;
import university.Department.Department;
import university.Persona.Person;
import university.Persona.PersonDirectory;
import university.Persona.StudentDirectory;
import university.Persona.StudentProfile;

/**
 *
 * @author kal bugrara
 */
public class UniversityExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Department department = new Department("Information Systems");
        CourseCatalog coursecatalog = department.getCourseCatalog();
        
        Course course = coursecatalog.newCourse("app eng", "info 5100", 4);
        
        CourseSchedule courseschedule = department.newCourseSchedule("Fall2020");

        CourseOffer courseoffer = courseschedule.newCourseOffer("info 5100");
        if (courseoffer==null)return;
        courseoffer.generatSeats(10);
        PersonDirectory pd = (PersonDirectory) department.getPersonDirectory();
        Person person = pd.newPerson("0112303");
        StudentDirectory sd = (StudentDirectory) department.getStudentDirectory();
        StudentProfile student = sd.newStudentProfile(person);
        CourseLoad courseload = student.newCourseLoad("Fall2020"); 
//        
        courseload.newSeatAssignment(courseoffer); //register student in class
        
        int total = department.calculateRevenuesBySemester("Fall2020");
        System.out.print("Total: " + total);

    }

}
