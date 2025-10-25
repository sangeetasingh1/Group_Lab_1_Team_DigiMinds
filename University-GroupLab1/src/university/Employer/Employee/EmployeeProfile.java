package university.Employer.Employee;

import university.Person.Person;
import university.Person.Profiles.Profile;

/**
 *
 * @author sange
 */
public class EmployeeProfile extends Profile {

    public EmployeeProfile(Person p) {

        super(p);

    }

    @Override
    public String getRole() {
        return "Admin";
    }

}
