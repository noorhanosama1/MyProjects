
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booko;

/**
 *
 * @author jawwal
 */
public class Person extends CommonInfo {
    private String FirstName;
    private String LastName;
    private BirtDate BD; 

    public Person(String FirstName, String LastName, BirtDate BD, String Country, String City, String Email, int TNum, int PostalCode) {
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

    public BirtDate getBD() {
        return BD;
    }

    public void setBD(BirtDate BD) {
        this.BD = BD;
    }


    public String PersonInfo() {
        return  "FirstName=" + FirstName + ", LastName=" + LastName + ", BD=" + BD+ super.CommonInfo()  ;
    }

   

    
}
