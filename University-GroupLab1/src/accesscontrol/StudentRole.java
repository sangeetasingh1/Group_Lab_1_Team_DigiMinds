/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesscontrol;

import javax.swing.JPanel;
import university.UserInterfaces.WorkAreas.Student.StudentWorkAreaJPanel;



/**
 *
 * @author Jafaeth Gomez
 */

public class StudentRole extends Role {
    @Override
    public JPanel createWorkArea() {
        return new StudentWorkAreaJPanel();
    }
}