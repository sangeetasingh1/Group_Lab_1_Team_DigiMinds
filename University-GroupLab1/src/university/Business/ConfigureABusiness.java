package university.Business;

import university.Person.Person;
import university.Person.PersonDirectory;
import university.Employer.Employee.EmployeeDirectory;
import university.Employer.Employee.EmployeeProfile;
import university.Person.Faculty.FacultyDirectory;
import university.Person.Faculty.FacultyProfile;
import university.Person.Student.StudentDirectory;
import university.Person.Student.StudentProfile;

import university.Business.UserAccounts.UserAccount;
import university.Business.UserAccounts.UserAccountDirectory;

/**
 *
 * @author sange
 */
public class ConfigureABusiness {

    public static Business initialize() {
        Business business = new Business("Information Systems");

        // Create Persons
        PersonDirectory persondirectory = business.getPersonDirectory();

        // person representing sales organization  
        Person person001 = persondirectory.newPerson("John", "Smith", "john@gmail.com", 8978675647L);
        Person person002 = persondirectory.newPerson("Gina", "Montana", "gina@yahoo.com", 6756789089L);
        Person person003 = persondirectory.newPerson("Adam", "Rollen", "adam@outlook.com", 4356548903L);

        // Create Employee / Student / Faculty Profiles
        EmployeeDirectory employeedirectory = business.getEmployeeDirectory();
        EmployeeProfile employeeProfile0 = employeedirectory.newEmployeeProfile(person001);

        StudentDirectory studentdirectory = business.getStudentDirectory();
        StudentProfile studentProfile0 = studentdirectory.newStudentProfile(person002);
        studentProfile0.setNuId("NUID0012345");

        FacultyDirectory facultydirectory = business.getFacultytDirectory();
        FacultyProfile facultyProfile0 = facultydirectory.newFacultyProfile(person003);

        // Create User accounts that link to specific profiles
        UserAccountDirectory uadirectory = business.getUserAccountDirectory();
        UserAccount ua3 = uadirectory.newUserAccount(employeeProfile0, "admin", "****", "Created");
        UserAccount ua4 = uadirectory.newUserAccount(studentProfile0, "student", "****", "Created");
        UserAccount ua5 = uadirectory.newUserAccount(facultyProfile0, "faculty", "****", "Created");

        return business;

    }

}
