/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;

/**
 *
 * @author iba
 */
public class Main {
    public static void main(String[] args) {
        Menu menu1 = new Menu("Ayam Geprek");
        Menu menu2 = new Menu();
        Menu menu3 = new Menu();
        
        menu1.show();
        menu2.show();
        menu3.show();
        
        //overloading methods
        int a = aritmatika.kali(2, 8);
        System.out.println(a);
        double b = aritmatika.kali(1, 0.98);
        System.out.println(b);
    }
}
