/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeesystem;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




/**
 *
 * @author Arimakousei
 */
public class EmployeeGui {
    
    JFrame f  = new JFrame();
    JTable table ;
    JScrollPane tablePane = new JScrollPane();
    Object[][] data;
    EmployeeRoster roster ;
    JButton btn1 = new JButton("PieceWorker"),btn2= new JButton("HourlyWorker"),btn3= new JButton("CommisionWorker"),btn4= new JButton("AllWorker");
    JPanel panel = new JPanel();
    
    
    
    public EmployeeGui(EmployeeRoster r){
        roster = r;
        f.setLayout(new GridLayout(1,3));
        panel.setLayout(new GridLayout(2,2));
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btn4);
        showTable(roster.allemployeeDetails());//show Default list to the table of employee  
        AllListener(); // methods contains all Listener and event
        f.add(panel);
        f.setVisible(true);
        f.setSize(1000,500);
       
    }
    
    private void AllListener(){
    //Equivalent code using an inner class instead of EventHandler.
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    clearTable();
                    data = roster.pieceWorkerDetails();
                    for(int row = 0;row<data.length;row++){
                        for(int col = 0; col <data[0].length;col++){
                            table.setValueAt(data[row][col], row, col);
                        }
                         
                    }
                   
            }
        });
           btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               clearTable();
                    data = roster.hourlyWorkerDetails();
                    for(int row = 0;row<data.length;row++){
                        for(int col = 0; col <data[0].length;col++){
                            table.setValueAt(data[row][col], row, col);
                        }
                         
                    }
            }
        });
         btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               clearTable();
                    data = roster.allemployeeDetails();
                    for(int row = 0;row<data.length;row++){
                        for(int col = 0; col <data[0].length;col++){
                            table.setValueAt(data[row][col], row, col);
                        }
                         
                    }
            }
        });   
    
    }
    
    
    
    public void showTable(Object[][] temp){
    data = temp;       
    Object[] column = {"Name", "ID"};
    table = new JTable(data, column);
    JScrollPane jpane = new JScrollPane(table);
    JPanel panel = new JPanel();
    JFrame frame = new JFrame();
    panel.add(jpane);
   
  
       f.setLayout(new FlowLayout());
       f.add(new JScrollPane(panel));
    }
    
    public  void clearTable() {
    int numberOfRows = table.getRowCount();
    int numberOfColumns = table.getColumnCount();
    int rowCounter = 0;
    int columnCounter = 0;
    //we will travel to every row and clean it
    for (rowCounter = 0; rowCounter < numberOfRows; rowCounter++) {
        for (columnCounter = 0; columnCounter < numberOfColumns; columnCounter++) {
            table.setValueAt(null, rowCounter, columnCounter);
        }
    }
}
    
}
