package Frame;

import helpers.Koneksi;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Data_GuruViewFrame extends JFrame{
     public  Data_GuruViewFrame(){
         frameInit();
     }
     public void init(){
         setContentPane(mainPanel);
         setTitle("Data Guru");
         pack();
         setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         setLocationRelativeTo(null);
     }
    private JPanel mainPanel;
    private JTextField cariTextField;
    private JButton cariButton;
    private JScrollPane viewTable;
    private JButton tambahButton;
    private JButton hapusButton;
    private JButton ubahButton;
    private JButton batalButton;
    private JButton cetakButton;
    private JButton tutupButton;

    public void isiTable(){
        Connection c = Koneksi.getConnection();
        String selectSQL= "SELECT * FROM DATA_GURU";
        try{
           Statement s = c.createStatement();
           ResultSet rs = s.executeQuery(selectSQL);
           String header[] = {"Id","Nama Guru"};
           DefaultTableModel dat = new DefaultTableModel(header,rowCont: 0);
           viewTable.setModel(dtm);
           Object[] row = new Object[2];
           while (rs.next()){
               row[0] = rs.getInt(columnLabel: "Id");
               row[1] = rs.getString(columnLabel: "nama");
               dtm.addRow(row);
           }

            }catch (SQLException e) {
            throw new RuntimeException(e);
        }
        }

    }

