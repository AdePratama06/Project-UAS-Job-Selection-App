
package Pelamar;

/**
 *
 * @author ade
 */
import javax.swing.*;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.io.IOException;



public class InformasiPelamar extends JFrame {
    
    JPanel menu = new JPanel();
    JPanel panellog = new JPanel();
    JLabel label = new JLabel(" Data Anda");
    
    JTextPane print = new JTextPane();
    JButton kembali = new JButton("KEMBALI");
    
     String nama,alamat,ttl,jklmn,agama,pekerjaan;
    Registrasi[] reg = new Registrasi[100];
    ModelPelamar pem = new ModelPelamar();
    
        public InformasiPelamar (String nama, String alamat, String ttl, String jklmn, String agama, String pekerjaan)
    {
        this.nama=nama;
        this.alamat=alamat;
        this.ttl=ttl;
        this.jklmn=jklmn;
        this.agama=agama;
        this.pekerjaan=pekerjaan;
        
        setTitle("print");
        setSize(370,510);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        label.setBounds(10, -8, 155, 75);
        label.setFont(new Font("Century Gothic",Font.PLAIN,40));
        label.setForeground(new Color(255,255,255));

                
        print.setBounds(80,70,200,300);
        print.setText
        (
                " ==== Identitas Diri ====\n" +
                "\n"+
                "   Nama         : "+this.nama+"\n"+
                "   Alamat      : "+this.alamat+"\n"+
                "   Tempat / Tanggal Lahir     : "+this.ttl+"\n"+
                "   Jenis Kelamin         : "+this.jklmn+"\n"+
                "   Agama  : "+this.agama+"\n"+
                "   Pekerjaan : "+this.pekerjaan+"\n"+
                "\n"+
                " ===========================\n"
        );
        
        
        kembali.setBounds(100,600,100,30);
        kembali.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                setVisible(false);
            }
        });
        
        
        menu.setBounds(0, 0, 370, 50);
        menu.setBackground(new Color(19,97,58));
        
        panellog.setBounds(0,40, 370, 470);
        panellog.setBackground(new Color(51,51,0));
        
        add(label);
        add(menu);
        add(panellog);
        add(print);
        add(kembali);
    }

   
    
}
