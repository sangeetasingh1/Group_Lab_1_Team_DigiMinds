/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.workareas;

import university.Persona.Person;

/**
 *
 * @author kal bugrara
 */
public class WorkRequest {
    String task;
    Person performer;
    Person originator;
    
    WorkRequest(Person org, Person per, String t){
        performer = per;
        originator = org;
        task = t;
    }
    
}
