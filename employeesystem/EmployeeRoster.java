/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeesystem;

import java.util.List;

/**
 *
 * @author Arimakousei
 */
public class EmployeeRoster {
    
    Employee[] list;
    int count;
    //default Contructor
    public EmployeeRoster(){
       list = new Employee[10];
       count = 0;
    }
    public EmployeeRoster(int length,int count){
       list = new Employee[length];
       count = count;
    }
    //add Employee
    public void add(Employee e){
        list[count] = e;
        count++;
    }
    public void DisplayEmployee(){
        for(int x = 0;x<count;x++){
            System.out.println(list[x].Fullname());
        }
    }
    
    public int countPieceWorker(){
        int c = 0;
            for(int x = 0;x<count;x++){
                if(list[x] instanceof PieceWorker){
                c++;
                }
            }
        return c;
    }
       public int countHourlyWorker(){
        int c = 0;
            for(int x = 0;x<count;x++){
                if(list[x] instanceof HourlyWorker){
                c++;
                }
            }
        return c;
    }
    
     public Object[][] hourlyWorkerDetails(){
       Object [][] temp  = new Object[countHourlyWorker()][2];
       int c = 0;
        for(int x = 0;x<count;x++){
            if(list[x] instanceof HourlyWorker){
                temp[c][0] = list[x].Fullname();
                temp[c][1] = list[x].IdNo();
                c++;
            }                
        }
        return temp;
    }   
       
    
    public Object[][] pieceWorkerDetails(){
       Object [][] temp  = new Object[countPieceWorker()][2];
       int c = 0;
        for(int x = 0;x<count;x++){
            if(list[x] instanceof PieceWorker){
                temp[c][0] = list[x].Fullname();
                temp[c][1] = list[x].IdNo();
                c++;
            }                
        }
        return temp;
    }
    
    //return Array Data of inserted employee
    public Object[][] allemployeeDetails(){
        Object [][] temp  = new Object[count][2];
        for(int x = 0;x<count;x++){     
                temp[x][0] = list[x].Fullname();
                temp[x][1] = list[x].IdNo();           
        }
        return temp;
    }
}
