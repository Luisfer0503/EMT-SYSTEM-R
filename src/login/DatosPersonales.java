package login;

import gestor.empresarial.empleados.Empleados;
import gestor.errores.GestionErrores;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DatosPersonales extends JFrame implements ActionListener {
    private JTextField idtext;
    private JTextField nombretext;
    private JTextField correotext;
    private JButton agregarButton;
    private JButton cerrarButton;
    private JPanel Jpersonales;
    private Empleados emp;
    private GestionErrores error;
   public JPanel getJpersonales(){
       this.error=new GestionErrores();
       return Jpersonales;
   }
   public DatosPersonales(){
       agregarButton.addActionListener(this);
       cerrarButton.addActionListener(this);
       Empleados emp=new Empleados();
       this.setTitle("Datos Personales");
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setContentPane(Jpersonales);
       this.setSize(800, 700);
       this.setLocationRelativeTo(null);
       this.setVisible(true);

   }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==cerrarButton){
            menu m=new menu();
            m.setVisible(true);
            this.dispose();
        }
        if(e.getSource().equals(agregarButton)) {
            if (nombretext.getText().isEmpty() && idtext.getText().isEmpty() && correotext.getText().isEmpty()) {
                String id = idtext.getText();
                String nombre = nombretext.getText();
                String correo = correotext.getText();
            } else {
                JOptionPane.showMessageDialog(null, "error al registrar");
            }
        }else{
            System.out.println("Error, casilla vacia");
            JOptionPane.showMessageDialog(null,error.getError());

            }
        }
    }

