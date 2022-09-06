package Jframe;

import javax.swing.*;
import java.awt.event.*;

//https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?codigo=109&punto=&inicio=

public class ComboBox1 extends JFrame implements ItemListener {

    private JComboBox<String> combo1;           //se declara el componente

    public ComboBox1() {                        //constuctor

        setLayout(null);
        combo1=new JComboBox<String>();         //reserva de memoria y tipo de dato que llevara
        combo1.setBounds(10,10,80,20);      //diemciones del componente
        add(combo1);                                           //se anñade el combobox
        combo1.addItem("rojo");                          //se añaden elemento al combobox los elementos
        combo1.addItem("vede");
        combo1.addItem("azul");
        combo1.addItem("amarillo");
        combo1.addItem("negro");
        combo1.addItemListener(this);                           //Devuelve el objeto específico del componente asociado con el elemento cuyo estado cambió
    }

    public void itemStateChanged(ItemEvent e) {             //Se invoca cuando el usuario ha seleccionado o deseleccionado un elemento.
        //https://docs.oracle.com/javase/7/docs/api/java/awt/event/ItemListener.html
        if (e.getSource()==combo1) {            //Devuelve el objeto en el que ocurrió el evento getSource()
            String seleccionado= (String) combo1.getSelectedItem();         //convertimos el objeto a String
            setTitle(seleccionado);         //se pone el titulo
        }
    }
    public static void main(String[] args) {
        // se crea un panel se le da dimenciones, se hace visible 
        ComboBox1 f1 =new ComboBox1();
        f1.setBounds(0,0,400,150);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // especificar accion de cierre
    }
}
