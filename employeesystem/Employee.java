/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeesystem;

/**
 *
 * @author Arimakousei
 */
public abstract class Employee {
    int idNo;
    String Designation;
    String Department;
    Person p;
    
    public Employee(Person p,int id,String desig,String depar){
        this.p = p;
        idNo = id;
        Designation = desig;
        Department = depar;
    }
    
    public String Fullname(){
        return p.Fullname();
    }
    public int IdNo(){
        return idNo;
    }
    public String designation(){
        return Designation;
    }
    
    public abstract double earnings();
    
}
