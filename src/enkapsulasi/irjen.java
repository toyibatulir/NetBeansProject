/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enkapsulasi;

/**
 *
 * @author iba
 */
public class irjen {
    public static void main(String[] args){
        //Membuat Instence/Objek dari Class biodata
        biodata data = new biodata();
        
        //Memasukan Data pada Variable
        data.setNama("Machfud Arifin");
        data.setPangkat("Inspektur Jendral Polisi");
        data.setGaji_Pokok(5407400);
        data.setWNI(true);
        
        //Memanggil Method Get dari Class biodata dan Menampilkannya
        System.out.println("Nama: "+data.getNama());
        System.out.println("Pangkat: "+data.getPangkat());
        System.out.println("Gaji Pokok: Rp."+data.getGaji_Pokok() +",-");
        System.out.println("Warga Negara Indonesia: "+data.getWNI());
    }
}
