package login;

import javax.swing.*;
import java.awt.*;
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

    public void menu(){
        JFrame fr=new JFrame("menu");
        menu m=new menu();
        fr.setContentPane(m.getmenu());
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(700,650);
        fr.setLocationRelativeTo(null);
        fr.setVisible(true);
    }

    private void datosPer(){
        JFrame per=new JFrame("datos personales");
        Dimension tam= Toolkit.getDefaultToolkit().getScreenSize();
        int x=(tam.width/2)-150;
        int y=(tam.height/2)-100;

        
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }

}

