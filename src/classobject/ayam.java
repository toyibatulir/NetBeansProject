/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classobject;

/**
 *
 * @author windows x
 */
public class ayam {
    int jumlahKaki= 0;
    String jenishewan= "";
    
    public ayam(String jenis,int kaki){
    this.jumlahKaki = kaki;
    this.jenishewan = jenis;
    }
    
    public void info(){
    System.out.println("Jenis Hewan : "+this.jenishewan + ", Kaki : "+this.jumlahKaki);
    }
}
