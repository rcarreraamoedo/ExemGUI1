
package exemgui1;

import java.awt.Color;
import javax.swing.*;

public class Componentes {
    
    JFrame marco;
    JPanel panel;
    JButton boton;
    JLabel etiqueta;
    JTextField liñaDeTexto;
    
    public Componentes(){
    
        marco = new JFrame (" compoñentes ");
        panel = new JPanel ();
        boton = new JButton(" BOTON ");
        etiqueta = new JLabel();
        liñaDeTexto = new JTextField();
        // dámoslle características os compoñentes
        
        marco.setBounds(0, 0, 600, 400);
        panel.setSize(600, 400);
        panel.setBackground(Color.RED);
        etiqueta.setText(" ETIQUETA ");
        liñaDeTexto.setSize(100, 50);
        liñaDeTexto.setText(" dame nome ");
        //poñemos compoñentes no panel
        
        panel.add(boton);
        panel.add(etiqueta);
        panel.add(liñaDeTexto);
        marco.add(panel);
        
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        marco.setVisible(true);
    }
}
