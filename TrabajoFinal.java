import javax.swing.*;
import java.awt.*;
import java.util.*;

public class TrabajoFinal{

	public static void main(String[] args){

		JFrame frame = new JFrame("Jugadores y Equipo");

		frame.setSize(600,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		JTabbedPane pest = new JTabbedPane();

		pest.addTab("Jugadores y Equipo", new JugadoresEquipo());
		pest.addTab("Resultados y Estadisticas", new ResultadosEstadistica());
		pest.addTab("Jugadas", new Jugadas());

		



		frame.add(pest);

		frame.setVisible(true);

	}


}