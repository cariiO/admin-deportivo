public class Jugador{

    private String nombre;
    private int numero;
    private int edad;
    private String posicionPrincipal;

    public Jugador (){}
    public Jugador(String nombre, int edad, int numero,
                    String posicionPrincipal /*boolean estado*/){

    this.nombre=nombre;
    this.numero=numero;
    this.edad=edad;
    this.posicionPrincipal=posicionPrincipal;

//  this.estado=estado;

    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero=numero;
    }

    public int getEdad(){
        return edad;
    }
    public void setEdad(short edad){
        this.edad=edad;
    }

    public String getPosicionPrincipal(){
        return posicionPrincipal;
    }
    public void setPosicionPrincipal( String posicionPrincipal){
        this.posicionPrincipal=posicionPrincipal;
    }

    public void Imprimir(){
        System.out.println(toString());
    }

}