package login;

import javax.swing.*;
import javax.tools.Tool;
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
    private void datosEmpresariales(){
        JFrame fr= new JFrame("datos empresariales");
        Dimension tam= Toolkit.getDefaultToolkit().getScreenSize();
        int x=(tam.width/2)-150;
        int y=(tam.height/2)-100;
        DatosEmpresariales demp=new DatosEmpresariales();
        fr.setContentPane(demp.getJemp());
        fr.setSize(700, 600);
        fr.setLocationRelativeTo(null);
        fr.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==datosEmpresarialesButton){

        }
    }

}

