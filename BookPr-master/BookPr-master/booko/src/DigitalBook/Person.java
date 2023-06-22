
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DigitalBook;

import java.util.Scanner;

/**
 *
 * @author jawwal
 */
public class Person extends CommonInfo implements CompareInterface{
    private String FirstName;
    private String LastName;
    private BirthDate BD; 
    Scanner in =new Scanner(System.in);

    public Person(String FirstName, String LastName, BirthDate BD, String Country, String City, String Email, int TNum, String PostalCode) {
        super(Country, City, Email, TNum, PostalCode);
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.BD = BD;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public BirthDate getBD() {
        return BD;
    }

    public void setBD(BirthDate BD) {
        this.BD = BD;
    }

    @Override
    public  String CompareBy(String str) {    
        
    if( this.FirstName.toLowerCase().substring(0,3).equals(str.toLowerCase().substring(0, 3)))
            System.out.println(getInfo());
      
    else System.out.println("This first name does not exist");        
             return null;

    }  
    
    
  
    public String getInfo() { 
        return  " FirstName:" + FirstName + ", LastName:" + LastName + ", BD=" + BD.getBirthDate()+ super.getInfo()  ;
    }

   

    
}
