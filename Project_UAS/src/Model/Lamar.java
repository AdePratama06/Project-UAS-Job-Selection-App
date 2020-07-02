
package Model;

import Pelamar.Registrasi;
import java.util.Date;

/**
 *
 * @author ade
 */
public class Lamar {
    
    private Integer Id_Pelamar;
    private String Nama;
    private String Alamat;
    private Date Tanggal_Lahir;
    private String Gender;
    private String Agama;

    
    public Integer getId_Pelamar() {
        return Id_Pelamar;
    }

    public void setId_Pelamar(Integer Id_Pelamar) {
        this.Id_Pelamar = Id_Pelamar;
    }  
    
    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public Date getTanggal_Lahir() {
        return Tanggal_Lahir;
    }

    public void setTanggal_Lahir(Date Tanggal_Lahir) {
        this.Tanggal_Lahir = Tanggal_Lahir;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getAgama() {
        return Agama;
    }

    public void setAgama(String Agama) {
        this.Agama = Agama;
    }
    
    
    
    
}
