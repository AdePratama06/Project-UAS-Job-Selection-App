
package Controller;

import Database.Koneksi;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Model.Lamar;
import Model.Pekerjaan;
import Model.Manajemen_Lowongan;
import Model.Detail;
import Pelamar.Registrasi;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.colorchooser.DefaultColorSelectionModel;



/**
 *
 * @author ade
 */




public class Manajemen {
    

    Koneksi koneksi;
    ArrayList<Lamar> arrLamar;
    ArrayList<Pekerjaan> arrPekerjaan;
    ArrayList<Manajemen_Lowongan> arrManajemen_Lowongan;
    ArrayList<Detail> arrDetail;
    ArrayList<Registrasi> arrReg; 
    
    public Manajemen() throws SQLException {
        this.koneksi = new Koneksi();
        this.arrLamar = new ArrayList<>();
        this.arrPekerjaan = new ArrayList<>();
        this.arrManajemen_Lowongan = new ArrayList<>();
        this.arrDetail = new ArrayList<>();
        this.arrReg = new ArrayList<>();

    }
    
    
    
   
    public ArrayList<Lamar> getDataLamar() throws SQLException {
        this.arrLamar.clear();
        ResultSet rs = this.koneksi.getData("SELECT * FROM PELAMAR");
        while (rs.next()) {
            Lamar lamar = new Lamar();
            lamar.setId_Pelamar(rs.getInt("ID_PELAMAR"));
            lamar.setNama(rs.getString("NAMA_PELAMAR"));
            lamar.setAlamat(rs.getString("ALAMAT"));
            lamar.setTanggal_Lahir(new Date(("TANGGAL_LAHIR")));
            lamar.setGender(rs.getString("GENDER"));
            lamar.setAgama(rs.getString("AGAMA"));
          
            this.arrLamar.add(lamar);
        }
        return this.arrLamar;
    }
    
    
    
    public ArrayList<Pekerjaan> getDataPekerjaan() throws SQLException {
        this.arrPekerjaan.clear();
        ResultSet rs = this.koneksi.getData("SELECT * FROM PEKERJAAN");
        while (rs.next()) {
            Pekerjaan pekerjaan = new Pekerjaan();
            pekerjaan.setId_Pekerjaan(rs.getInt("ID_PEKERJAAN"));
            pekerjaan.setSpesialisasi_Pekerjaan(rs.getString("SPESIALISASI_PEKERJAAN"));
            pekerjaan.setGaji(rs.getInt("Gaji"));

          this.arrPekerjaan.add(pekerjaan);
        }
        return this.arrPekerjaan;
    }
    
     
    
    public ArrayList<Manajemen_Lowongan> getDataManajemen_Lowongan() throws SQLException {
        this.arrManajemen_Lowongan.clear();
        
        
        ResultSet rs = this.koneksi.getData("SELECT * FROM MANAJEMEN_LOWONGAN "
                + "JOIN PEKERJAAN ON MANAJEMEN_LOWONGAN.ID_GELOMBANG = PEKERJAAN.ID_PEKERJAAN");
        while (rs.next()) {
            
           Pekerjaan pekerjaan = new Pekerjaan();
           pekerjaan.setId_Pekerjaan(rs.getInt("ID_PEKERJAAN"));
           pekerjaan.setSpesialisasi_Pekerjaan(rs.getString("SPESIALISASI_PEKERJAAN"));
           pekerjaan.setGaji(rs.getInt("Gaji"));
            
           Manajemen_Lowongan m = new Manajemen_Lowongan();
           m.setId_Gelombang(rs.getInt("ID_GELOMBANG"));
           m.setTanggal(rs.getDate("TANGGAL"));
           m.setPekerjaan(pekerjaan);
           
     
            this.arrManajemen_Lowongan.add(m);
          }
        return this.arrManajemen_Lowongan;
        }
     
//    
//   
//    public ArrayList<Registrasi> getDataReg() throws SQLException {
//        this.arrReg.clear();
//        ResultSet rs = this.koneksi.getData("SELECT * FROM REGISTER JOIN PELAMAR ON REGISTER.KODE_REG = PELAMAR.ID_PELAMAR ORDER BY REGISTER.KODE_REG");
//        while (rs.next()) {
//            Lamar pe = new Lamar();
//            pe.setId_Pelamar(rs.getInt("ID_PELAMAR"));
//            pe.setNama(rs.getString("NAMA_PELAMAR"));
//            pe.setAlamat(rs.getString("ALAMAT"));
//            pe.setTanggal_Lahir(new Date(("TANGGAL_LAHIR")));
//            pe.setGender(rs.getString("GENDER"));
//            pe.setAgama(rs.getString("AGAMA"));
//           
//                Registrasi reg = new Registrasi();
//                reg.setKode_Reg(rs.getInt("KODE_REG"));
//                reg.setUsername(rs.getString("USERNAME"));
//                reg.setPassword(rs.getString("PASSWORD"));
//
//                pe.setRegistrasi(reg);
//                reg.setLamar(pe);
//            
//            this.arrReg.add(reg);
//        }
//        return this.arrReg;
//    }

    
//    
//    
//    public void login(String user, String pass)
//    {
//        try {
//        ResultSet rs0 = this.koneksi.getData("CREATE VIEW LOGIN AS"
//                + " SELECT a.KODE_REG , a.USERNAME, a.PASSWORD, b.ID_PELAMAR , b.NAMA_PELAMAR, b.ALAMAT, b.TANGGAL_LAHIR, b.GENDER , b.AGAMA "
//                + " FROM REGISTER a JOIN PELAMAR b"
//                + " ON a.KODE_REG = b.ID_PELAMAR");
//        
//        ResultSet rs = this.koneksi.getData("SELECT * FROM LOGIN"
//                + " WHERE USERNAME = '" + user + "' AND PASSWORD = '" + pass + "'");
//
//        int baris = 0;
//     
//            while (rs.next()) {
//                baris = rs.getRow();
//           
//            if (baris ==1) {
//            Lamar pe = new Lamar();
//            pe.setId_Pelamar(rs.getInt("ID_PELAMAR"));
//            pe.setNama(rs.getString("NAMA_PELAMAR"));
//            pe.setAlamat(rs.getString("ALAMAT"));
//            pe.setTanggal_Lahir(new Date(("TANGGAL_LAHIR")));
//            pe.setGender(rs.getString("GENDER"));
//            pe.setAgama(rs.getString("AGAMA"));
//           
//                Registrasi reg = new Registrasi();
//                reg.setKode_Reg(rs.getInt("KODE_REG"));
//                reg.setUsername(rs.getString("USERNAME"));
//                reg.setPassword(rs.getString("PASSWORD"));
//
//                pe.setRegistrasi(reg);
//                reg.setLamar(pe);
//             //   new transaksi(reg.getpembeli().getNama(), reg.getKode_Reg()).setVisible(true);
//                
//            }else {
//                
//            }
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(Manajemen.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//    
//    
//    
//    
//    
//    
    
    
    
    
    
    
    
          
    public void insertPkr(Pekerjaan pker) throws SQLException {
        try {
            this.koneksi.ManipulasiData("INSERT INTO PEKERJAAN VALUES("+"'"+pker.getId_Pekerjaan().toString()+ "','" + 
                    pker.getSpesialisasi_Pekerjaan() + "','" +  pker.getGaji().toString() + "')");
        } catch (Exception ex) {
            System.out.println(ex);
        }  
        
    }
    
    public void insertglb(Manajemen_Lowongan mln) throws SQLException {
        try {
            String tgl = new SimpleDateFormat("dd/MM/yyyy").format(mln.getTanggal());
            this.koneksi.ManipulasiData("INSERT INTO MANAJEMEN_LOWONGAN VALUES ("
                    +"'" + mln.getId_Gelombang().toString() +
                    "','" + mln.getPekerjaan().getId_Pekerjaan().toString() + ",TO_DATE('" + tgl + "','dd/MM/yyyy')," + "','" +
                    mln.getTanggal() + "')" );
        } catch (Exception ex) {
            System.out.println(ex);
        }  
        
    }
    
    public void deletePkr(Integer i) throws SQLException {
        
            this.koneksi.ManipulasiData("DELETE FROM PEKERJAAN WHERE ID_PEKERJAAN = " + i);
    }
    public void updatepkr(Integer i, Integer x) throws SQLException {
        
            this.koneksi.ManipulasiData("UPDATE PEKERJAAN SET GAJI = " + x.toString()
                         + "WHERE ID_PEKERJAAN = " + i);
    }

    }
 
