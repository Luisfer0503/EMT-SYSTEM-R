package login;

import gestor.empresarial.empleados.Empleados;
import gestor.errores.GestionErrores;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class DatosEmpresariales extends JFrame implements ActionListener {
    private JTextField idtext;
    private JTextField nombretext;
    private JTextField correotext;
    private JButton addbutton;
    private JButton cerrarButton;
    private JPanel Jemp;

    private Empleados empleados;
    private GestionErrores error;

    public JPanel getJemp() {
        return Jemp;
    }

    public DatosEmpresariales() {
        empleados = new Empleados(); // Inicializamos empleados
        error = new GestionErrores(); // Inicializamos error

        // Inicializar los componentes de la interfaz
        idtext = new JTextField(10);
        nombretext = new JTextField(10);
        correotext = new JTextField(10);
        addbutton = new JButton("Agregar");
        cerrarButton = new JButton("Cerrar");
        Jemp = new JPanel();

        // Agregar los componentes a la ventana
        Jemp.add(new JLabel("ID:"));
        Jemp.add(idtext);
        Jemp.add(new JLabel("Nombre:"));
        Jemp.add(nombretext);
        Jemp.add(new JLabel("Correo:"));
        Jemp.add(correotext);
        Jemp.add(addbutton);
        Jemp.add(cerrarButton);

        // Configurar la ventana
        setTitle("Datos Empresariales");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        // Agregamos action listeners a los botones
        addbutton.addActionListener(this);
        cerrarButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addbutton) {
            // Obtener los valores de los campos de texto
            String id = idtext.getText();
            String nombre = nombretext.getText();
            String correo = correotext.getText();

            // Verificar que los campos no estén vacíos
            if (id.isEmpty() || nombre.isEmpty() || correo.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, llene todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Agregar empleado con los valores ingresados
            empleados.addEmpleado(new Empleados(id, nombre, correo));

            // Lógica para mostrar la lista de empleados
            List<Empleados> listaEmpleados = empleados.getListaEmpleados();
            StringBuilder listaEmpleadosStr = new StringBuilder("Lista de Empleados:\n");
            for (Empleados empleado : listaEmpleados) {
                listaEmpleadosStr.append(empleado.toString()).append("\n");
            }
            JOptionPane.showMessageDialog(this, listaEmpleadosStr.toString(), "Lista de Empleados", JOptionPane.INFORMATION_MESSAGE);

        } else if (e.getSource() == cerrarButton) {
            // Cerrar la aplicación
            System.exit(0);
        }
    }
}