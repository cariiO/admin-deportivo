import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;

public class JugadoresEquipo extends JPanel{

    static Equipo equipo = new Equipo();
    static Equipo encontro = null;
    static String[] posiciones = { "Centro","Ala","Poste" };

    public JugadoresEquipo(){

        setLayout( new GridLayout(1,2));
        JPanel caja1 = new JPanel();
        caja1.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel nJugador = new JLabel("Nuevo Jugador");
        nJugador.setFont(nJugador.getFont().deriveFont(20.0f));

        JPanel caja3 = new JPanel();
        caja3.setLayout(new FlowLayout(FlowLayout.LEFT));
        caja3.setPreferredSize(new Dimension(280,30));
        JLabel nombre = new JLabel("Nombre: ");
        JTextField nomTxt = new JTextField(20);
        JLabel edad = new JLabel("Edad: ");
        JTextField edTxt = new JTextField(20);
        JLabel num = new JLabel("Numero: ");
        JTextField numTxt = new JTextField(15);
        JLabel pos = new JLabel("Posicion: ");
        JComboBox posBox = new JComboBox(posiciones);
        posBox.setPreferredSize(new Dimension(150, 20));
        JButton agreg = new JButton("Agregar");

        caja3.add(nJugador);
        caja1.add(caja3);
        caja1.add(nombre);
        caja1.add(nomTxt);
        caja1.add(edad);
        caja1.add(edTxt);
        caja1.add(num);
        caja1.add(numTxt);
        caja1.add(pos);
        caja1.add(posBox);
        caja1.add(agreg);

        JPanel caja2 = new JPanel();

        caja2.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel nuevEqui = new JLabel("Nuevo Equipo");
        nuevEqui.setFont(nuevEqui.getFont().deriveFont(20.0f));
        JPanel caja4 = new JPanel();
        caja4.setLayout(new FlowLayout(FlowLayout.LEFT));
        caja4.setPreferredSize(new Dimension(280,30));
        JLabel alias = new JLabel("Alias: ");
        JTextField aliasTxt = new JTextField(20);
        JLabel jugador = new JLabel("Jugador: ");
        JComboBox jugBox = new JComboBox();
        jugBox.setPreferredSize(new Dimension(180, 20));

        //multi box

        //circulos

        JRadioButton titList = new JRadioButton("Titular");
        JRadioButton banList = new JRadioButton("Banca");
        JPanel caja5 = new JPanel();
        caja5.setLayout(new FlowLayout(FlowLayout.CENTER));
        caja5.setPreferredSize(new Dimension(400,30));
        JLabel posicion = new JLabel("Posicion: ");
        JComboBox posiBox = new JComboBox(posiciones);
        posiBox.setPreferredSize(new Dimension(150, 20));

        //multi box

        JButton agregar = new JButton("Agregar");

        //espacio de texto

        caja4.add(nuevEqui);
        caja5.add(titList);
        caja5.add(banList);
        caja2.add(caja4);
        caja2.add(alias);
        caja2.add(aliasTxt);
        caja2.add(jugador);
        caja2.add(jugBox);
        caja2.add(caja5);
        caja2.add(posicion);
        caja2.add(posiBox);
        caja2.add(agregar);

        /*agregar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                        //Valido que los campos no estén vacíos
            if(!nomTxt.getText().equals("") && !edTxt.getText().equals("") && !numTxt.getText().equals("")){ //Aqui falta posicion

                Jugador temp = new Jugador(nomTxt.getText(),edTxt.getText(), numTxt.getText());
                equipo.agregar(temp);
                System.out.println(equipo);
                JOptionPane.showMessageDialog(null, "Se agregó correctamente");
                nomTxt.setText("");
                edTxt.setText("");
                numTxt.setText("");

                }else{
                            JOptionPane.showMessageDialog(null, "Todos los campos son requeridos (id, nombre, área, salario)");
                        }

                    }
        });
        */



        this.add(caja1);
        this.add(caja2);



    }


}