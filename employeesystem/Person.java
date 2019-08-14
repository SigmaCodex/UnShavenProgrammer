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
public class Person {
    
    private String lname;
    private String fname;
    private char gender;
    private String bday;
    
    
    public Person(){
        //Default Contructor
    }
    
    public Person(String l,String f,char g,String b){
          lname = l;
          fname = f;
          gender = g;
          bday = b;

    }
    
    public String Fullname(){
        return lname+","+fname;
    }
    
    
    
    
}
