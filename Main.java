/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csc211.project;
import java.util.*;
/**
 *
 * @author lij1
 */
public class Main{
    public static void main(String[] args) {
        Date d =  new Date(9, 2, 2021); 
        Date s = new Date(9,2,2021);
        Date e = new Date(10,2,2011);
        System.out.println(d);
        System.out.println(d.equals(s));
        System.out.println(e); 
        
        Person p = new Person("Mohammad", "Hassan");
        System.out.println(p);
        System.out.println("\n");
        Employee obj1 = new Employee("Alice", "Brown", 112, 10, 2, 2003 );
        System.out.println(obj1);
    } 
    
}
