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
public class CommonInfo {
    private String Country ;
    private String City;
    private String Email;
    private int TNum;
    private int PostalCode;

    public CommonInfo(String Country, String City, String Email, int TNum, int PostalCode) {
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

    public int getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(int PostalCode) {
        this.PostalCode = PostalCode;
    }

    public String CommonInfo() {
        return  "Country:" + Country + ", City:" + City + ", Email:" + Email + ", TNum:" + TNum + ", PostalCode:" + PostalCode;
    }

   

    
    
}
