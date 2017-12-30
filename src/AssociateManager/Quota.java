/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AssociateManager;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author miguelq
 */
public class Quota implements Serializable{
    
    private double val;
    private LocalDate date;
    
    public Quota(){
        this.val = 0.f;
        this.date = LocalDate.now();
    }
    
    public Quota(Double nVal, LocalDate nDt){
        this.val = nVal;
        this.date = nDt;
    }
    
    public Quota(Quota nQ){
        this.val = nQ.getVal();
        this.date = nQ.getDate();
    }

    //getters & setters

    public void setVal(double nVal){
        this.val = nVal;
    }

    public void setDate(LocalDate nDt){
        this.date = nDt;
    }

    public double getVal() {
        return this.val;
    }
    
    public LocalDate getDate(){
        return this.date;
    }
    
    public Quota clone(){
        return new Quota(this);
    }
}