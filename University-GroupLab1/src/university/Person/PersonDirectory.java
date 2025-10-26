package university.Person;

import java.util.ArrayList;

/**
 *
 * @author sange
 */
public class PersonDirectory {

    ArrayList<Person> personlist;

    public PersonDirectory() {

        personlist = new ArrayList();

    }

    public Person newPerson() {
        Person p = new Person();
        personlist.add(p);
        return p;
    }

    public Person newPerson(String id) {
        Person p = new Person(id);
        personlist.add(p);
        return p;
    }

    public Person newPerson(String firstName, String lastName, String emailId, long phoneNumber) {
        Person p = new Person(firstName, lastName, emailId, phoneNumber);
        personlist.add(p);
        return p;
    }

    public Person findPerson(String id) {

        for (Person p : personlist) {

            if (p.isMatch(id)) {
                return p;
            }
        }
        return null; //not found after going through the whole list
    }

}
