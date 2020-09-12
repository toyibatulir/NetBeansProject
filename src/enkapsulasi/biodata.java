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
public class biodata {
    //Variable (Private)
    private String nama;
    private String pangkat;
    private double gaji_pokok;
    private boolean wni;
    
    //Method Setter (Public) dengan Parameter
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setPangkat(String pangkat){
        this.pangkat = pangkat;
    }
    public void setGaji_Pokok(double gaji_pokok){
        this.gaji_pokok = gaji_pokok;
    }
    public void setWNI(boolean wni){
        this.wni = wni;
    }
    
    //Method Getter (Public)
    public String getNama(){
        return nama;
    }
    public String getPangkat(){
        return pangkat;
    }
    public double getGaji_Pokok (){
        return gaji_pokok;
    }
    public boolean getWNI(){
        return wni;
    }

}
