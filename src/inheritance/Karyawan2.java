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
public class Karyawan2 extends Karyawan {
    String nama = "Ahmad Jainuri";
    String email = "jainuriahmad937@gmail.com";
    String alamat = "Kraton, Purwosari";
    
    void print(){
        System.out.println("Nama   : "+ super.nama);
        System.out.println("Email  : "+ this.email);
        System.out.println("Alamat : "+ super.alamat);
    }
}
