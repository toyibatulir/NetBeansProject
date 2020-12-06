/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author iba
 */
public class Main {
        public static void main(String[] args) {
            Karyawan karyawan = new Karyawan();
            Karyawan2 karyawan2 = new Karyawan2();
            
            
            System.out.println("> Induk Class");
            karyawan.print();
            System.out.println("");
            System.out.println("> Turunan Class");
            karyawan2.print();
             
        }
}
