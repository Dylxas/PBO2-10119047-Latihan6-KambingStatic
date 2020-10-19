/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119047.latihan6.kambingstatic;

/**
 *
 * @author 
 * NAMA     : Aldy Putra Hanggara
 * KELAS    : PBO2
 * NIM      : 10119047
 * DESKRIPSI PROGRAM : PROGRAM INI BERISI MENAMPILKAN VARIABLE KAMBING STATIC
 */
public class Mamalia {
    //variabel jumlahKambing dideklarasikan sebagai statik
    public static int jumlahKambing;
}
public class PBOIF210119047Latihan6KambingStatic {

    //nama kambing sebagai konstanta
    public static final String Nama_Kambing = "MIDUN";
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Mamalia.jumlahKambing = 485000;
        System.out.println(Nama_Kambing + " memiliki kambing sebanyak"
                           + Mamalia.jumlahKambing);
    }
    
}
