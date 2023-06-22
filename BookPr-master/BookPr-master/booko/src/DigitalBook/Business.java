
package DigitalBook;

 


public class  Business extends CommonInfo implements CompareInterface{
    private String PersonContact;
    private String title;
    private String Gener;
    private String Website;

    public Business(String PersonContact, String title, String Gener, String Website, String Country, String City, String Email, int TNum, String PostalCode) {
        super(Country, City, Email, TNum, PostalCode);
        this.PersonContact = PersonContact;
        this.title = title;
        this.Gener = Gener;
        this.Website = Website;
    }

    public String getPersonContact() {
        return PersonContact;
    }

    public void setPersonContact(String PersonContact) {
        this.PersonContact = PersonContact;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGener() {
        return Gener;
    }

    public void setGener(String Gener) {
        this.Gener = Gener;
    }

    public String getWebsite() {
        return Website;
    }

    public void setWebsite(String Website) {
        this.Website = Website;
    }
 
    @Override
    public  String CompareBy(String str) {    
    if( this.title.substring(0,3).equals(str.substring(0, 3)))
        return  getInfo();
    else System.out.println("This title does not exist");        
             return null;

    } 
    
    public String getInfo() {
        return "PersonContact is: " + PersonContact + ", Title is: " + title + ", Gener is: " + Gener + ", Website is: " + Website + super.getInfo() ;
    }

    
   
}
