
package Model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ade
 */
public class Detail {
    
    private Manajemen_Lowongan Gelombang;
    private Lamar lamar;
    private Date Tanggal_Lamaran;
    private ArrayList<Detail> detail;

    public Manajemen_Lowongan getGelombang() {
        return Gelombang;
    }

    public void setGelombang(Manajemen_Lowongan Gelombang) {
        this.Gelombang = Gelombang;
    }

    public Lamar getPelamar() {
        return lamar;
    }

    public void setPelamar(Lamar Pelamar) {
        this.lamar = Pelamar;
    }

    public Date getTanggal_Lamaran() {
        return Tanggal_Lamaran;
    }

    public void setTanggal_Lamaran(Date Tanggal_Lamaran) {
        this.Tanggal_Lamaran = Tanggal_Lamaran;
    }
    
    
    
}
