/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.Person.Student;

import university.CourseSchedule.CourseLoad;
import university.CourseSchedule.SeatAssignment;
import university.Person.EmploymentHistory.EmploymentHistroy;
import java.util.ArrayList;
import university.Person.Person;
import university.Person.Transcript;
import university.Person.Profiles.Profile;

/**
 *
 * @author kal bugrara
 */
public class StudentProfile extends Profile{

    Person person;
    Transcript transcript;
    EmploymentHistroy employmenthistory;
    
    String nuId;

    public StudentProfile(Person p) {
        super(p);
        person = p;
        transcript = new Transcript(this);
        employmenthistory = new EmploymentHistroy();
    }
    
    public String getNuId() {
        return nuId;
    }

    public void setNuId(String nuId) {
        this.nuId = nuId;
    }

    @Override
    public String getRole() {
        return "Student";
    }

    public boolean isMatch(String id) {
        return person.getPersonId().equals(id);
    }
    
    public boolean isNuIdMatch(String studentNuId) {
        return getNuId().equalsIgnoreCase(studentNuId);
    }

    public Transcript getTranscript() {
        return transcript;
    }

    public CourseLoad getCourseLoadBySemester(String semester) {

        return transcript.getCourseLoadBySemester(semester);
    }

    public CourseLoad getCurrentCourseLoad() {

        return transcript.getCurrentCourseLoad();
    }

    public CourseLoad newCourseLoad(String s) {

        return transcript.newCourseLoad(s);
    }

    public ArrayList<SeatAssignment> getCourseList() {

        return transcript.getCourseList();

    }
}
