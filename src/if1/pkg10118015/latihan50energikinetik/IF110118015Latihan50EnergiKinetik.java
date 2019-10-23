/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118015.latihan50energikinetik;

/**
 *
 * @author 
 * NAMA                 : Adi Chandra Nugraha
 * KELAS                : IF-1
 * NIM                  : 10118015
 * Deskripsi Program    : Program ini berisi program Menghitung energi Kinetik
 */
public class IF110118015Latihan50EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EnergiKinetik ek = new EnergiKinetik();
        
        ek.setMassa(145);
        ek.setKecepatan(25);
        
        System.out.println("===Program Menghitung Energi Kinetik===");
        System.out.println("Massa benda = "+ ek.getMassa() + " gram");
        System.out.println("Kecepatan benda = "+ ek.getKecepatan() + " m/s");
        System.out.println("");
        System.out.println("Energi kinetiknya adalah " + ek.energiKinetik(ek.getMassa(), ek.getKecepatan()));
        System.out.println("Usaha yang dilakukan dalam keadaan diam adalah "
        + ek.ekDiam(ek.energiKinetik(ek.getMassa(), ek.getKecepatan())));
    }
    
}
