package Jframe;

import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;

public class ComboBox2 extends JFrame implements ItemListener {
    private JComboBox<String> pais;
    private JComboBox<String> estado;

    private String[] arr_paises = { "Mexico", "Estados Unidos", "Cuba" };
    private String[] arr_estadoM = { "Aguascalientes", "Baja California", "Campeche", "Chiapas", "Chihuahua",
            "Colima" };
    private String[] arr_estadosEU = { "Alabama", "Alaska", "Arizona", "Arkansas", "California", "Carolina del Norte",
            "Carolina del Sur", "Colorado", "Connecticut" };
    private String[] arr_estadosCb = { "Provincia de Pinar del Río.", "Provincia de La Habana.",
            "Provincia de Matanzas.", "Provincia de Santa Clara.", "Provincia de Puerto Príncipe.",
            "Provincia de Santiago de Cuba." };

    public ComboBox2() {
        initComponents();
        setResizable(false);
        setBounds(0, 0, 400, 500);
        setLocationRelativeTo(null);
        // setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void initComponents() {
        pais = new JComboBox<String>();
        pais.setBounds(10, 10, 200, 20);
        pais.addItemListener(this);
        add(pais);

        estado = new JComboBox<String>();
        estado.setBounds(10, 40, 200, 20);
        add(estado);

        for (String temporal : arr_paises) {
            pais.addItem(temporal);
        }

        JLabel imagen = new JLabel(new ImageIcon("1.jpg"));
        // JLabel imagen = new JLabel("HOLA");
        imagen.setBounds(10, 80, getWidth(), getHeight());
        add(imagen);


        // imagen = new JLabel(new ImageIcon("img/"+ (String) pais.getSelectedItem()+".jpg"));
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == pais) {
            estado.removeAllItems();
            Elegir_Estado();
        }
    }

    public void Elegir_Estado() {

        if ((String) pais.getSelectedItem() == "Mexico") {
            for (String temporal : arr_estadoM) {
                estado.addItem(temporal);
            }
        }

        if ((String) pais.getSelectedItem() == "Estados Unidos") {
            for (String temporal : arr_estadosEU) {
                estado.addItem(temporal);
            }
        }

        if ((String) pais.getSelectedItem() == "Cuba") {
            for (String temporal : arr_estadosCb) {
                estado.addItem(temporal);
            }
        }
    }

    public void colocar_bandera() {

    }

    public static void main(String[] args) {
        ComboBox2 f1 = new ComboBox2();
    }
}
