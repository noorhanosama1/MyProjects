/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booko;

import java.util.Scanner;

/**
 *
 * @author jawwal
 */
public class Booko {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);
        Business B = new Business(new Person("Ahmad","gg",(new BirtDate(12,12,22)),"j","k","j",66,66),"title","gener","www.www","j","k","j",66,66);
        System.out.println(B.BusenissInfo());
        //System.out.println(B.getPersonContact());
    }
    
}
