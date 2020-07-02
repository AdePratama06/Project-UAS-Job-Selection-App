package project_uas;

import Admin.Interface;
import Database.Koneksi;
import Job_Aps.Job_ApsG;
import java.sql.SQLException;
import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws SQLException    {
        
         //new Interface().setVisible(true);
         
        Interface a = new Interface();
        a.setVisible(true);
    
    }
    
}
