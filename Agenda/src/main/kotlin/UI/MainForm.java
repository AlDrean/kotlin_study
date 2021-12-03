package UI;

import javax.swing.*;

public class MainForm extends JFrame {
    private JPanel rootPannel;
    private JButton btn_newContact;
    private JButton btn_remove;
    private JTable tbl_contacts;

    public MainForm(){

        setContentPane(rootPannel);
        setSize(500,250);
        setVisible(true);
    }

}
