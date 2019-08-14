/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeesystem;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Arimakousei
 */
public class EmployeeSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Person p1 = new Person("JohnDave","Delgado",'M',"6-12-2000");
        Person p2 = new Person("ArimaKousei","Subaru",'M',"6-12-2000");
     
        PieceWorker w1 = new PieceWorker(p1, 123, "Example", "Example", 30, 40);
        PieceWorker w3 = new PieceWorker(p2, 323, "Example", "Example", 30, 40);
     
        HourlyWorker w2 = new HourlyWorker(p2, 321, "Example", "Example", 30, 40);
        HourlyWorker w5 = new HourlyWorker(p2, 321, "Example", "Example", 30, 40);
        
        EmployeeRoster roster = new EmployeeRoster();
        
     
        roster.add(w5);
        roster.add(w1);
        roster.add(w2);
        roster.add(w3);
        roster.DisplayEmployee();
         
        new EmployeeGui(roster);
      
    }
    
}
