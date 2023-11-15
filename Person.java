/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc211.project;
import java.util.*;
/**
 *
 * @author itlabs
 */
public class Person {
    private String firstName; 
    private String lastName;  
    
    public Person() { 
        firstName = "No name"; 
        lastName = "No name"; 
        
    } 
    public Person(String fn, String ln) { 
        firstName = fn; 
        lastName = ln; 
    }
    
    public Person(Person other) { 
        firstName = other.firstName; 
        lastName = other.lastName; 
    }
    
    public String getFirstName() { 
        return firstName;
    } 
    
    public String getLastName() {
        return lastName;
    }
    
    public void set(String fn, String ln) {  
        firstName = fn; 
        lastName = ln; 
    }
    
    @Override
    public String toString() { 
        String str = String.format("First name: %s\n", firstName);
        str+= String.format("Last name: %s", lastName);
        return str;
    }
    public boolean equals (Person other) { 
        return firstName == other.firstName && lastName == other.lastName; 
    }
}
