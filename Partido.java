public class Partido {

    private int minXjuego, puntosXjuego, faltasXjuego;

    public Partido ()   {}
    public Partido(int minXjuego, int puntosXjuego, int faltasXjuego)    {
        this.faltasXjuego = faltasXjuego;
        this.minXjuego = minXjuego;
        this. puntosXjuego = puntosXjuego;
    }

   public void setMinXjuego (int minXjuego)  {
       this.minXjuego = minXjuego;
   }
    public int getMinXjuego ()  {
        return this.minXjuego;
    }
       public void setPuntosXjuego (int minXjuego)  {
           this.puntosXjuego = puntosXjuego;
   }
    public int getPuntosXjuego ()  {
        return this.puntosXjuego;
    }
       public void setFaltaXjuego (int faltasXjuego)  {
           this.faltasXjuego = faltasXjuego;
   }
    public int getFaltasXjuego ()  {
        return this.faltasXjuego;
    }


}
