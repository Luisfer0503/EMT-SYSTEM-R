package login;

import javax.swing.*;
import java.awt.event.*;


public class login extends JFrame implements ActionListener {
    private JPanel Panel;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton ingresarButton;
    private JButton cerrarButton;

    public login(){
        ingresarButton.addActionListener(this);
        cerrarButton.addActionListener(this);
    }
    public JPanel getJpanel(){
        return Panel;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==ingresarButton){
            String user=textField1.getText();
            String pas=new String(passwordField1.getPassword());

            if(user.equals("RH")&& pas.equals("12345")) {
                JOptionPane.showMessageDialog(null, "ingresaste");
                //mandar a llamar la funcion para mostrar el menu
            }else {
                JOptionPane.showMessageDialog(null, "usuario o contrasennia incorrectos");
            }
        }else if (e.getSource()==cerrarButton){
            System.exit(0);
        }

    }

}