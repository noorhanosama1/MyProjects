/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DigitalBook;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jawwal
 */public class Booko {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     new   BookFrame().setVisible(true);
        Scanner in =new Scanner(System.in);
        ArrayList<Business> Barr=new ArrayList<>();
        ArrayList<Person> Parr=new ArrayList<>();
          String menu= "1. Add person Information\n2. Add Business Information\n3. Search for first name"
                  + "/+\n4. Search for title"
                  + "\n5. Print Business's Info"
                  + "\n6. Print Person's Info"
                  + "\n7. Delete Person's entries"
                  + "\n8. Delete Business's entries"
                  + "\n9. Edit Business's Info"
                  + "\n10.  Edit Person's Info";
                  
                   
         while (true) {
             System.out.println(menu);
           
            switch (in.nextInt()) {
                case 1:
                    
                   System.out.println("Please enter person's next information ☻ \nFirst name");
                   String p1 =in.next();
                    System.out.println("Last name");
                    String p2=in.next();
                    System.out.println("Birthdate");
                    int p3=in.nextInt();
                    int p31=in.nextInt();
                    int p32=in.nextInt();

                    System.out.println("Country");
                    String p4=in.next();
                    System.out.println("City");
                    String p5=in.next();                  
                    System.out.println("Email");
                    String p6=in.next();                    
                    System.out.println("Telephone Number ");
                    int p7=in.nextInt();
                    System.out.println("Postal code");
                    String p8=in.next();
                    
                   Person p=new Person(p1,p2,new BirthDate(p3,p31,p32), p4, p5, p6, p7, p8);

                    Parr.add(p);
                    
                       break;
                case 2: 
                     System.out.println("Please enter the following required information\n Person Contact");
                    String b1 =in.next();
                    System.out.println("title");
                    String b2=in.next();
                    System.out.println("gener");
                    String b3=in.next();
                    System.out.println("Country");
                    String b4=in.next();
                    System.out.println("City");
                    String b5=in.next();
                    System.out.println("Email");
                    String b6=in.next();                  
                    System.out.println("Website");
                    String b7=in.next();                    
                    System.out.println("Telephone Number ");
                    int b8=in.nextInt();
                    System.out.println("Postal code");
                    String b9=in.next();
                     Business b = new Business(b1, b2, b3,b4,b5, b6 , b7, b8, b9);
                     Barr.add(b);

                    break;
                    
               case 3:              
                    System.out.println("Please Enter First Name to find if it exists");
                   String str=in.next();
                   for (int i = 0; i < Parr.size(); i++) {
                       Parr.get(i).CompareBy(str);
                   }
                    
                    
                    break;
               case 4:
                     System.out.println("Please Enter title to find if it exists");
                   String str1=in.next();
                   for (int i = 0; i < Barr.size(); i++) {
                       Barr.get(i).CompareBy(str1);}
                   break;
                case 5:
                    for (int i = 0; i < Barr.size(); i++){
                      Business Content = Barr.get(i);
                        System.out.println(Content.getInfo());
                     
                                       }
                    
                    break;
                    
                case 6:
                      for (int i = 0; i < Parr.size(); i++){
                      Person Content = Parr.get(i);
                      System.out.println(Content.getInfo());
                     
                                       }
                    
                    
                    break;
                
                case 7:
                    try{
                    System.out.println("Please enter person's full name to delete his Information  ");
                    String s1= in.next();
                    String s2= in.next();
                    for (int i = 0; i < Parr.size(); i++) {
                        if( Parr.get(i).getFirstName().equals(s1) && Parr.get(i).getLastName().equals(s2) )
                        Parr.remove(i);}}
                    catch (Exception e) {
                            System.out.println("The full name you entered not exist");
                            }
                       
                    
                    break;
                 
                case 8 :
                    System.out.println("Please enter business's title to delete its Information");
                    String T= in.next();
                    for (int i = 0; i < Barr.size(); i++) {
                        if( Barr.get(i).getTitle().equals(T))
                            Barr.remove(i);
                        else System.out.println("The title you entered not exist");
                        
                    }

                    break;
                 
                case 9:
                    String menu1="\n1. Enter new Person contact \n2. Enter new City \n3. Enter new Country \n4. Enter new title"
                            + "\n5.Enter new gener \n6.Enter new Email \n7.Enter new Website \n8. Enter new Telephone number"
                            + "\n9.Enter new Postal code";
                  
                          while (true) {
                                  System.out.println(menu1);
             for (int i = 0; i < Barr.size(); i++){
            switch (in.nextInt()) {
                case 1: 
                Barr.get(i).setPersonContact(in.next());
                    break;
                case 2: 
                Barr.get(i).setCity(in.next());
                break;
                case 3: 
                    Barr.get(i).setCountry(in.next());
                      break;
                case 4:      
                    Barr.get(i).setTitle(in.next());
                        break;
                case 5:
                    Barr.get(i).setGener(in.next());
                    break;
                case 6: 
                    Barr.get(i).setEmail(in.next());
                    break;
                case 7: 
                    Barr.get(i).setWebsite(in.next());
                    break;
                case 8:      
                    Barr.get(i).setTNum(in.nextInt());
                    break;
                case 9 : 
                    Barr.get(i).setPostalCode(in.next());
                    break;
                default : System.out.println("The number you entered was out of range");      
            }} 
               
                          break;
                    }
                          break;
                case 10:
                     String menu2="\n1. Enter new first name \n2. Enter new last name \n3. Enter new Birthdate \n4. Enter new country"
                            + "\n5.Enter new city \n6.Enter new Email \n7.Enter new Telephone number \n8. Enter new Postal code";
                            
                  
                          while (true) {
                                  System.out.println(menu2);
             for (int i = 0; i < Parr.size(); i++){
            switch (in.nextInt()) {
                case 1: 
                Parr.get(i).setFirstName(in.next());
                    break;
                case 2: 
                Parr.get(i).setLastName(in.next());
                break;
                case 3: 
                    Parr.get(i).setBD(new BirthDate(in.nextInt(),in.nextInt(),in.nextInt()));
                    
                      break;
                case 4: 
                    Parr.get(i).setCountry(in.next());   
                        break;
                case 5:
                    Parr.get(i).setCity(in.next());
                    break;
                case 6: 
                    Parr.get(i).setEmail(in.next());
                    break;
                case 7: 
                    Parr.get(i).setTNum(in.nextInt());
                    break;
                case 8:      
                    Parr.get(i).setPostalCode(in.next());
                    break;

                default : System.out.println("The number you entered was out of range");      
            }} 
               
                          break;
                    }
                    break;
                    }
                 
                       
              
                      
                      
                    }
                   
       
        
           
    }
    
}
