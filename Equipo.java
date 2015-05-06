import java.util.*;

public class Equipo {

    private String alias;
    private ArrayList<Jugador> arreglo = new ArrayList<Jugador>();

    public Equipo() {
    }
    public Equipo(String alias) {
        this.alias = alias;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public ArrayList<Jugador> getArreglo() {
        return arreglo;
    }

    public void agregar(Jugador j) {
        arreglo.add(j);
    }

    public char validarPosicion()   {
        return 0;
    }


}
