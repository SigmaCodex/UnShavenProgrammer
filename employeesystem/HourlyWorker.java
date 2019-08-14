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
public class HourlyWorker extends Employee{
    int hrsWrkd;
    double rPhr;

    public HourlyWorker(Person p, int id, String desig, String depar,int h,double r) {
        super(p, id, desig, depar);
        hrsWrkd = h;
        rPhr = r;
    }

    @Override
    public double earnings() {
       return (hrsWrkd*rPhr);
    }
    
}
