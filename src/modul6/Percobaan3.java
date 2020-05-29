package modul6;

import perbankan.PenyimpananUang;
import perbankan.*;

public class Percobaan3 {
    public static void main(String args[]) {
        PenyimpananUang tabungan = new PenyimpananUang(5000,8.5/100); 
        System.out.println("Uang yang ditabung : 5000"); 
        System.out.println("Tingkat bunga sekarang : 8.5%"); 
        System.out.println("Total uang anda sekarang : " + tabungan.cekUang());
    }
}
