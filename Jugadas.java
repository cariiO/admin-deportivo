import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;

public class Jugadas extends JPanel{

    public Jugadas(){

        setLayout(new FlowLayout(FlowLayout.LEFT));
        JLabel alias = new JLabel("Alias: ");
        JComboBox aliasBox = new JComboBox();
        aliasBox.setPreferredSize(new Dimension(100, 20));

        Canvas canvas = new Canvas();
        JPanel controles = new JPanel();
        JButton btnLimpiar = new JButton("Limpiar");
        btnLimpiar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                canvas.limpiar();
                }
                });
        controles.add(btnLimpiar);
        JPanel caja = new JPanel();
        caja.setLayout(new FlowLayout(FlowLayout.CENTER));

        caja.add(controles);
        caja.add(canvas);
        this.add(alias);
        this.add(aliasBox);
        this.add(caja);





    }


}