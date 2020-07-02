
package Pelamar;

/**
 *
 * @author ade
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class AkunPelamar extends Komponen {
    
    Registrasi[] reg = new Registrasi[100];
    ModelPelamar indek = new ModelPelamar();
    String nama,alamat,agama,user,pwd,pekerjaan,kelamin;
    String ttl;
    
    public AkunPelamar(String nama,String alamat,String agama,String use,String pw,String ttl, String kelamin,String pekerjaan)
    {
        this.nama=nama;
        this.alamat=alamat;
        this.agama=agama;
        this.user=use;
        this.pwd=pw;
        this.pekerjaan=pekerjaan;
        this.kelamin=kelamin;
        this.ttl=ttl;

        setTitle("Login Pelamar");
        setSize(600,400);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        menu.setBounds(0, 0, 70, 400);
        menu.setBackground(new Color(19,97,58));
        add(menu);
        
        panellog.setBounds(70, 0, 530, 400);
        panellog.setBackground(new Color(51,51,0));
        
        label.setBounds(80, 20, 155, 75);
        label.setFont(new Font("Century Gothic",Font.PLAIN,60));
        label.setForeground(new Color(255,255,255));
        
        id.setBounds(120, 140, 176, 45);
        id.setFont(new Font("Century Gothic",Font.PLAIN,30));
        id.setForeground(new Color(255,255,255));
        us.setBounds(320, 145, 200, 30);
        
        pass.setBounds(120, 200, 176, 45);
        pass.setFont(new Font("Century Gothic",Font.PLAIN,30));
        pass.setForeground(new Color(255,255,255));
        sandi.setBounds(320, 205, 200, 30);
        
        login.setBounds(100, 280, 100, 30);
        login.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                
                    if(us.getText().equals(user)&&sandi.getText().equals(pwd))
                    {
                        new InformasiPelamar(nama, alamat, ttl, kelamin ,agama, pekerjaan).setVisible(true);
                    }
                
            }
        });
        
        add(label);
        add(id);
        add(us);
        add(pass);
        add(sandi);
        add(login);
        add(panellog);
        
    }

  
}
