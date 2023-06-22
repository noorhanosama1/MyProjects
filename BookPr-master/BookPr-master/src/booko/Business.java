
package booko;

 


public class Business extends CommonInfo{
    private Person PersonContact;
    private String title;
    private String Gener;
    private String Website;

    public Business(Person PersonContact, String title, String Gener, String Website, String Country, String City, String Email, int TNum, int PostalCode) {
        super(Country, City, Email, TNum, PostalCode);
        this.PersonContact = PersonContact;
        this.title = title;
        this.Gener = Gener;
        this.Website = Website;
    }

    public Person getPersonContact() {
        return PersonContact;
    }

    public void setPersonContact(Person PersonContact) {
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

    public String BusenissInfo() {
        return "PersonContact=" + PersonContact.PersonInfo() + ", title=" + title + ", Gener=" + Gener + ", Website=" + Website + super.CommonInfo() ;
    }

    
   
}
