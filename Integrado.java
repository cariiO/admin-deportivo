import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Fernanda Montiel 2015
 * Para fines académicos
 */
public class Integrado {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Canvas");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel principal = new JPanel( new BorderLayout());
       
        Canvas canvas = new Canvas();
        JPanel controles = new JPanel();
        JButton btnLimpiar = new JButton("Limpiar");
        btnLimpiar.addActionListener(new ActionListener(){
          
            public void actionPerformed(ActionEvent e) {
                canvas.limpiar();
            }
            
        });       
        controles.add(btnLimpiar);
        principal.add(canvas, BorderLayout.CENTER);
        principal.add(controles, BorderLayout.EAST);
        
        frame.add(principal);
        frame.setVisible(true);
    }
    
}
