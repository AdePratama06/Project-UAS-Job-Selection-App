
package Pelamar;

/**
 *
 * @author ade
 */
import javax.swing.JButton;
import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class Komponen extends JFrame {
    
    JPanel menu = new JPanel();
    JPanel panellog = new JPanel();
    
    JLabel label = new JLabel("Login");
    JLabel id = new JLabel("USER ID");
    JLabel pass = new JLabel("PASSWORD");
    
    JTextField us = new JTextField();
    JTextField sandi = new JTextField();

    JButton login = new JButton("Masuk"); 
    
}
