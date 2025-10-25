/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.Employer;

import university.Department.Department;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class EmployerDirectory {

    Department department;
    ArrayList<EmployerProfile> employerlist;

    public EmployerDirectory(Department d) {

        department = d;
        employerlist = new ArrayList();

    }

    public EmployerProfile newEmployerProfile(String n) {

        EmployerProfile sp = new EmployerProfile(n);
        employerlist.add(sp);
        return sp;
    }

    public EmployerProfile findTeachingFaculty(String id) {

        for (EmployerProfile ep : employerlist) {

            if (ep.isMatch(id)) {
                return ep;
            }
        }
            return null; //not found after going through the whole list
         }
    
}
