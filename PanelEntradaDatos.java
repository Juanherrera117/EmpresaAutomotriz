package vista;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;

public class PanelEntradaDatos extends JPanel   
{
    private JLabel lbTitulo;
    private JLabel lbNombre;
    private JLabel lbPrecio;
    private static JTextField tfNombre;
    private static JTextField tfPrecio;

    public PanelEntradaDatos()  //Crea el constructor de PanelEntradaDatos
    {
        lbTitulo = new JLabel("VENTA DE CARROS", SwingConstants.CENTER);
        lbTitulo.setFont(new Font("Times New Roman", Font.BOLD, 20));
        lbTitulo.setForeground(Color.BLACK);
        lbTitulo.setBounds(10, 10, 480, 30);

        lbNombre = new JLabel("Nombre =");
        lbNombre.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        lbNombre.setForeground(Color.BLACK);
        lbNombre.setBounds(20, 55, 480, 30);

        tfNombre = new JTextField();
        tfNombre.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        tfNombre.setForeground(Color.BLACK);
        tfNombre.setBounds(100, 55, 190, 30);

        lbPrecio = new JLabel("Precio   =");
        lbPrecio.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        lbPrecio.setForeground(Color.BLACK);
        lbPrecio.setBounds(20, 95, 480, 30);

        tfPrecio = new JTextField();
        tfPrecio.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        tfPrecio.setForeground(Color.BLACK);
        tfPrecio.setBounds(100, 95, 190, 30);

        this.setLayout(null);
        this.setBackground(Color.decode("#216bb0"));
        this.setVisible(true);
        this.add(lbTitulo);
        this.add(lbNombre);
        this.add(tfNombre);
        this.add(lbPrecio);
        this.add(tfPrecio);
    }

    public static String getTfNombre()
    {
        return tfNombre.getText();
    }

    public static String getTfPrecio()
    {
        return tfPrecio.getText();
    }

    public static void borrarTf() 
    {
        JOptionPane.showMessageDialog(null, "Los datos serán borrados...", "Venta de Carros",
                JOptionPane.WARNING_MESSAGE);
        tfNombre.setText("");
        tfPrecio.setText("");
        PanelResultados.taResultados.setText("");
    }
}
