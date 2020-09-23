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
public class Menu {
    private String name;
    private static int jumlahMenu;
    
    //overloading pada constructor
    //opsi 1
    Menu(String name){
        Menu.jumlahMenu++;
        this.name = name;
    }
    
    //opsi 2
    Menu(){
        Menu.jumlahMenu++;
        this.name = "menu" + Menu.jumlahMenu;
    }
    
    void show(){
        System.out.println("Menu: " + this.name);
    }
}
