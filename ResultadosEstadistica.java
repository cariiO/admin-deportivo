import java.awt.*;
import javax.swing.*;
import java.util.*;

public class ResultadosEstadistica extends JPanel{

	public ResultadosEstadistica(){

		setLayout(new GridLayout(1,2));
		JPanel caja1 = new JPanel();
		caja1.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel res = new JLabel("Resultado de Juego");
		res.setFont(res.getFont().deriveFont(20.0f));


		JLabel alias= new JLabel("Alias del equipo");
		JComboBox aliasBox= new JComboBox();
		aliasBox.setPreferredSize(new Dimension(150,20));

		JComboBox listaJugadores= new JComboBox();
		listaJugadores.setPreferredSize(new Dimension(150,20));

		JLabel minJuego = new JLabel("Minutos por Juego: ");
		JTextField minJuegoTxt = new JTextField(10);
		JLabel puntosJuego = new JLabel("Puntos por Juego: ");
		JTextField puntosJuegoTxt = new JTextField(10);
		JLabel faltasJuego = new JLabel("Faltas por Juego: ");
		JTextField faltasJuegoTxt = new JTextField(10);

		JLabel txt= new JLabel("Total de juegos jugados (se calcula por sistema)");

		JButton guardar= new JButton("Guardar");

		JPanel caja5 = new JPanel();
		caja5.setLayout(new FlowLayout(FlowLayout.LEFT));
		caja5.setPreferredSize(new Dimension(280,30));

		JPanel caja6 = new JPanel();
		caja6.setLayout(new FlowLayout(FlowLayout.LEFT));
		caja6.setPreferredSize(new Dimension(280,30));

		JPanel caja7 = new JPanel();
		caja7.setLayout(new FlowLayout(FlowLayout.LEFT));
		caja7.setPreferredSize(new Dimension(280,30));

		JPanel caja8 = new JPanel();
		caja8.setLayout(new FlowLayout(FlowLayout.LEFT));
		caja8.setPreferredSize(new Dimension(280,30));

		caja1.add(res);
		caja5.add(alias);
		caja5.add(aliasBox);
		caja1.add(caja5);
		caja1.add(listaJugadores);
		caja6.add(minJuego);
		caja6.add(minJuegoTxt);
		caja1.add(caja6);
		caja7.add(puntosJuego);
		caja7.add(puntosJuegoTxt);
		caja1.add(caja7);
		caja8.add(faltasJuego);
		caja8.add(faltasJuegoTxt);
		caja1.add(caja8);
		caja1.add(txt);
		caja1.add(guardar);

		JPanel caja2= new JPanel();
		caja2.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel verEsts= new JLabel("Ver estadisticas");
		verEsts.setFont(verEsts.getFont().deriveFont(20.0f));

		JPanel caja3 = new JPanel();
		caja3.setLayout(new FlowLayout(FlowLayout.CENTER));
		caja3.setPreferredSize(new Dimension(280,30));

		JRadioButton xEquipo= new JRadioButton("Por equipo");
		JRadioButton xJugador= new JRadioButton("Por jugador");

		JComboBox comboEquipo= new JComboBox();
		JComboBox comboJugador= new JComboBox();

		JPanel caja4= new JPanel();
		caja4.setLayout(new FlowLayout(FlowLayout.CENTER));
		caja4.setPreferredSize(new Dimension(280,30));

		caja3.add(xEquipo);
		caja3.add(comboEquipo);
		caja4.add(xJugador);
		caja4.add(comboJugador);

		caja2.add(verEsts);
		caja2.add(caja3);
		caja2.add(caja4);

		this.add(caja1);
		this.add(caja2);

	}
}