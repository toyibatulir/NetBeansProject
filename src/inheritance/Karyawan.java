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
public class Karyawan {
    String nama = "Nama Karyawan";
    String email = "E-mail";
    String alamat = "Alamat";
    
    void print(){
        System.out.println("Nama   : "+ this.nama);
        System.out.println("Email  : "+ this.email);
        System.out.println("Alamat : "+ this.alamat);
    }
            
}
