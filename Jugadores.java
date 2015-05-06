import java.io.*;
import java.util.*;

public class Jugadores{

    public Vector<Jugador> listaJugadores;
    private FileWriter fw=null;
    private File archivo = null;
    private PrintWriter pw = null;
    private FileReader fr = null;
    private BufferedReader br = null;

    public Jugadores (){
        listaJugadores = new Vector<Jugador>();
        InicializarJugadores();
        try{
            fw= new FileWriter("Jugadores.txt");
            pw=new PrintWriter(fw);
        }catch(IOException e){
            System.out.println("Ocurrio un error al crear el archivo");
        }
    }

    private void InicializarJugadores(){
       listaJugadores.add(new Jugador("Carolina",20,8,"Centro"));
       listaJugadores.add(new Jugador("Paulo",20,5,"Ala"));
       listaJugadores.add(new Jugador("Rodrigo",25,18,"Poste"));
    }

    public void Agregar(Jugador jugador){
        listaJugadores.add(jugador);
    }
    private void LeerJugadores(){
        System.out.println("Leer archivo");
        try {
            archivo = new File("Jugadores.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea;
            System.out.println("Imprmiendo...");
            while ((linea = br.readLine()) != null) {
                System.out.println("Linea:" + linea);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if (null != fr) {
                    fr.close();
                }
            }catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void ImprimirJugadores() {
        System.out.println("\n");
        for (Jugador jugador : listaJugadores) {
            jugador.Imprimir();
        }
    }

    public Vector<Jugador> getLista(){
        return listaJugadores;
    }

    public void CerrarArchivo(){
        try{
            //Cerramos el archivo
            if(null!= archivo){
                fw.close();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}