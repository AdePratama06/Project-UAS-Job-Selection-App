package Pelamar;

import java.sql.SQLException;

/**
 *
 * @author ade
 */
public class ModelPelamar {
    
    Registrasi[] reg = new Registrasi[100];
    AkunPelamar[] preg = new AkunPelamar[100];
    ModelPelamar[] bel = new ModelPelamar[100];
    int index=0;
 

    public void pelamar()
    {
        
    }
    public void insert(String nama,String alamat,String agama,String ttl,String kelamin,String pekerjaan,String id,String pass)
    {
        reg[index] = new Registrasi(nama,alamat,agama,ttl,kelamin,pekerjaan,id,pass);
        index++;  
    }
    public void ambil() throws SQLException
    {
        for(int i=0; i<index;i++)
        {
            preg[i] = new AkunPelamar(reg[i].nama,reg[i].alamat,reg[i].agama,reg[i].id,reg[i].pass,reg[i].ttl,reg[i].kelamin,reg[i].pekerjaan);
        }
    } 
    }
    

