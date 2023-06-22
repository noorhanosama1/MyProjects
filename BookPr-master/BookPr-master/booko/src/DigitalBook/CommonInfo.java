/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DigitalBook;

/**
 *
 * @author jawwal
 */
public abstract class  CommonInfo  {
    private String Country ;
    private String City;
    private String Email;
    private int TNum;
    private String PostalCode;

    public CommonInfo(String Country, String City, String Email, int TNum, String PostalCode) {
        this.Country = Country;
        this.City = City;
        this.Email = Email;
        this.TNum = TNum;
        this.PostalCode = PostalCode;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getTNum() {
        return TNum;
    }

    public void setTNum(int TNum) {
        this.TNum = TNum;
    }

    public String getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(String PostalCode) {
        this.PostalCode = PostalCode;
    }


    public String getInfo() {
        return  " Country is: " + Country + ", City is: " + City + ", Email is: " + Email + ", Telephone Number is: " + TNum + ", PostalCode is: " + PostalCode;
    }

   

    
    
}
