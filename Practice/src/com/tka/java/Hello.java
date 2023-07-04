package com.tka.java;

import java.util.Scanner;

public class Hello {
  public static void main(String[] args) 
  {
    Scanner input = new Scanner (System.in); //created an object of Scanner named input
                                             // System.in parameter is used to take input from the standard input
    
    System.out.print("Input your first name: ");
    String fname = input.next();
  
    
    System.out.print("Input your last name: ");
    String lname = input.next();
    
    System.out.println();
    System.out.println("Hello \n"+fname+" "+lname);
  }
}