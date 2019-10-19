/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118015.latihan50energikinetik;

/**
 *
 * @author ACER
 */
public class EnergiKinetik {
    private double massa;
    private double kecepatan;

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }
    
    public double energiKinetik(double massa, double kecepatan){
        double energiKinetik;
        return energiKinetik = 0.5 * (massa * kecepatan * kecepatan);
    }
    
    public double ekDiam(double energiKinetik){
        double ekDiam;
        return ekDiam = energiKinetik - 0;
    }
    
}
