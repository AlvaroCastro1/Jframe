
import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JFrame;
public class Fondo extends JFrame {

    public Fondo(){
        super("ejemplo");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(750,400);
        setLocationRelativeTo(null);
        this.getContentPane().setLayout(new GridLayout(1,3,5,5));
        JLabel l1 = new JLabel();
        l1.setSize(100,100);
        ImageIcon imagen = new ImageIcon("img/Cuba.jpg");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(l1.getWidth(), l1.getHeight(), Image.SCALE_DEFAULT));

        l1.setIcon(icono);
        this.add(l1);

    }

    public static void main(String[] args) {
        Fondo f = new Fondo();
        f.setVisible(true);
    }
}
