
package Model;

import java.util.Date;

/**
 *
 * @author ade
 */
public class Manajemen_Lowongan {
    
    private Integer Id_Gelombang;
    private Date Tanggal;
    private Pekerjaan pekerjaan;

    public Integer getId_Gelombang() {
        return Id_Gelombang;
    }

    public void setId_Gelombang(Integer Id_Gelombang) {
        this.Id_Gelombang = Id_Gelombang;
    }

    public Date getTanggal() {
        return Tanggal;
    }

    public void setTanggal(Date Tanggal) {
        this.Tanggal = Tanggal;
    }

    public Pekerjaan getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(Pekerjaan Pekerjaan) {
        this.pekerjaan = Pekerjaan;
    }
    
    
    
}
