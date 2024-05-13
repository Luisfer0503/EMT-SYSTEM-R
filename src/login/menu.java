package login;
import login.DatosEmpresariales;
import javax.swing.*;
import javax.swing.plaf.PanelUI;
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

    public menu(){
        cerrarSesionButton.addActionListener(this);
        datosPersonalesButton.addActionListener(this);
        datosEmpresarialesButton.addActionListener(this);
        contratosButton.addActionListener(this);
        setTitle("Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().add(Jpanel);
        this.setSize(700, 550);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    public JPanel getmenu(){
        return Jpanel;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == datosPersonalesButton){
            DatosPersonales datosPersonales=new DatosPersonales();
            dispose();
        }

        if(e.getSource()==datosEmpresarialesButton){
            //datosEmpresariales();
            DatosEmpresariales datosEmpresariales=new DatosEmpresariales();
            dispose();
        }

        if(e.getSource()==contratosButton){

        }

        if(e.getSource()==cerrarSesionButton){
            System.exit(0);
        }
    }

}

