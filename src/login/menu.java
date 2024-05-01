package login;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menu extends JFrame implements ActionListener {
    private JPanel panel;
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
        return panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
