package login;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Contratos extends JFrame implements ActionListener
{
    private JPanel panelContratos;
    private JButton registrarButton;
    private JButton cerrarButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JComboBox comboBox1;

    public Contratos () {
        registrarButton.addActionListener(this);
        cerrarButton.addActionListener(this);
        comboBox1.setModel(new DefaultComboBoxModel<>(Cargos.values()));
        setTitle("Contratos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().add(panelContratos);
        this.setSize(700, 550);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public JPanel getPanelContratos(){
        return panelContratos;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registrarButton) {
            String ID = textField1.getText();
            String NoContrato = textField2.getText();
            String Anio = textField3.getText();
        }
        if(e.getSource()== cerrarButton){
            menu menu = new menu();
            dispose();
        }
    }
}
