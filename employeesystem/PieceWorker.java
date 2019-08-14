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
public class PieceWorker extends Employee{
    int noItems;
    double ratePerItem;
    public PieceWorker(Person p, int id, String desig, String depar,int n,double r) {
        super(p, id, desig, depar);
        noItems = n;
        ratePerItem  = r;
    }

   
    public double earnings() {
        
        return (noItems*ratePerItem);
    }
    
    
}
