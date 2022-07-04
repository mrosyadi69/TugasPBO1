package Frame;

import javax.swing.*;


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
}
