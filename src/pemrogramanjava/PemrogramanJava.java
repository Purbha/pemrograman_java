/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemrogramanjava;

/**
 *
 * @author Irsyad
 */
public class PemrogramanJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 3;
        int y = 0;
        y = --x+2*x*++x;
        System.out.println(y);
        System.out.println(x);
        
        int day = 1;
        switch (day) {
        case 1:
            System.out.println("Monday");
        case 2:
            System.out.println("Tuesday");
        case 3:
            System.out.println("Wednesday");
        break;
        }
    }
    
}
