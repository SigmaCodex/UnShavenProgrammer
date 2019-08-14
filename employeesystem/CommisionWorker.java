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
public class CommisionWorker extends Employee{
    double baseSlry;
    double priceItem;
    double commisionRate;
    int noItem;
        
    public CommisionWorker(Person p, int id, String desig, String depar,double b,double price, double c,int n) {
        super(p, id, desig, depar);
        baseSlry= b;
        priceItem = price;
        commisionRate = c;
        noItem =n;
        
    }

    @Override
    public double earnings() {
        double earnings = 0.0;
       return earnings;
    }
    
}
