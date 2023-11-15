/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc211.project;

/**
 *
 * @author itlabs
 */
public class Employee extends Person{
    private int ID; 
    private Date hireDate;
    public Employee() { 
        super();
        ID = 0; 
        hireDate = new Date(01, 01, 2001); 
    }
    public Employee(String fn, String ln, int i, int m, int d, int y) { 
        super(fn, ln);
        hireDate = new Date(m, d, y);
        ID = i; 
    } 
    public Employee(Employee other) { 
        super(other); 
        ID = other.ID; 
        hireDate = other.hireDate;
    } 
    public void setID(int i) { 
        ID = i;
    } 
    public void setHireDate(Date other) { 
        hireDate = new Date(other);
    }
    public int getID() { 
        return ID; 
    } 
    public Date getHireDate() { 
        return new Date(hireDate);
    } 
    @Override 
    public String toString() { 
        String str = super.toString(); 
        str += "\nID: "+ID; 
        str += "\n" + hireDate; 
        return str; 
    } 
    public boolean equals (Employee other) { 
        return super.equals(other) && ID == other.ID && hireDate == other.hireDate; 
        
    }
     
    

}
