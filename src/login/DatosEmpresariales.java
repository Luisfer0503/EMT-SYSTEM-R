package login;

import gestor.empresarial.empleados.Empleados;
import gestor.errores.GestionErrores;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DatosEmpresariales extends JFrame implements ActionListener {
    private JTextField idtext;
    private JTextField nombretext;
    private JTextField correotext;
    private JButton addbutton;
    private JButton cerrarButton;
    private JPanel Jemp;

    private menu menu;
    private DatosEmpresariales dEmpresariales;
    private GestionErrores error;
    private Empleados emp;

    public JPanel getJemp(){
        return Jemp;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
