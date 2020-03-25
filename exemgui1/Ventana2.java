package exemgui1;

import java.awt.Container;
import javax.swing.JFrame;

public class Ventana2 extends JFrame {
    
  public Ventana2(){
      this.setTitle(" ventana2 ");
      this.setSize(600, 400);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      //como chamar ao panel, por defecto, do JFrame
      
      Container panel = this.getContentPane();
      
      
      this.setVisible(true);
  }

}
