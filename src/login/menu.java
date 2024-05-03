package login;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menu extends JFrame implements ActionListener {
    private JPanel Jpanel;
    private JButton cerrarSesionButton;
    private JButton datosPersonalesButton;
    private JButton datosEmpresarialesButton;
    private JButton contratosButton;
    menu(){
        cerrarSesionButton.addActionListener(this);
        datosPersonalesButton.addActionListener(this);
        datosEmpresarialesButton.addActionListener(this);
        contratosButton.addActionListener(this);
    }
    public JPanel getmenu(){
        return Jpanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
    public void menu(){
        JFrame fr=new JFrame("menu");
        menu m=new menu();
        fr.setContentPane(m.getmenu());
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(700,650);
        fr.setLocationRelativeTo(null);
        fr.setVisible(true);
    }

}
