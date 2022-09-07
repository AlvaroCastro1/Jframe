package Jframe;
import javax.swing.*;
public class SetTheBackground {
    public static void main(String args[])
    {
 
        // Insertar imagen
                 ImageIcon icon1 = new ImageIcon ("/1.jpg");
                 // Agrega JLabel para colocar la imagen
        JLabel label1=new JLabel(icon1);
                 // Establece la posición y el tamaño de la etiqueta, el tamaño de la etiqueta es el tamaño de la imagen
        label1.setBounds(0,0,icon1.getIconWidth(),icon1.getIconHeight());
 
                 // marco JFrame
        JFrame frame=new JFrame();
                 // Añadir etiqueta al contenedor inferior del marco
        frame.getLayeredPane().add(label1,new Integer(Integer.MIN_VALUE));
 
        //panel
        JPanel panel =new JPanel();
 
                 // panelTop, el contenedor superior
        JPanel panelTop=new JPanel();
        panelTop=(JPanel)frame.getContentPane();
 
                 // Panel y panelTop set transparente
        panelTop.setOpaque(false);
        panel.setOpaque(false);
 
                 // label0, esta es una operación personalizada en la interfaz, utilizada como visualización de efectos
                 JLabel label0 = new JLabel ("Esta es una etiqueta");
        panel.add(label0);
 
                 // Agregar panel, establecer tamaño, visual
        frame.add(panel);
        frame.setSize(520, 520);
        frame.setVisible(true);
    }
}