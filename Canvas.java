/**
 * Fernanda Montiel 2015
 * Para fines académicos
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;


public class Canvas extends JPanel{
    
    private Graphics2D g2D;
    private ArrayList<Punto> trazo = new ArrayList<Punto>();
    private ArrayList<ArrayList<Punto>> trazos = new ArrayList<ArrayList<Punto>>();
    
    public Canvas(){
        this.setPreferredSize(new Dimension(500, 500));
                
        this.addMouseListener(new MouseListener(){
            public void mousePressed(MouseEvent e) {
               Punto p = new Punto(e.getX(), e.getY());
               trazo.add(p);
            }

            public void mouseReleased(MouseEvent e) {
              Punto p = new Punto(e.getX(), e.getY());
               trazo.add(p);
               trazos.add(trazo);
               trazo = new ArrayList<Punto>();
               repaint();
            }
            public void mouseClicked(MouseEvent e) {}    
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
        
        });
        
        this.addMouseMotionListener(new MouseMotionListener(){

            public void mouseDragged(MouseEvent e) {
               Punto p = new Punto(e.getX(), e.getY()); 
               trazo.add(p);
               //repaint();
                g2D = (Graphics2D) getGraphics();
                g2D.setPaint(Color.RED);
                g2D.setStroke(new BasicStroke(3.0f));
               g2D.draw( new Line2D.Double(trazo.get(trazo.size()-1).getX(), trazo.get(trazo.size()-1).getY(), e.getX(), e.getY()));
               
               
            }
            public void mouseMoved(MouseEvent e) {}
        
        });
        
        
    }
    
    public void limpiar(){
        trazo.clear();
        trazos.clear();
        repaint();
    }
    
    public void paintComponent(Graphics g) {
      
       g2D = (Graphics2D) g;
       g2D.setPaint(Color.RED);
       g2D.setStroke(new BasicStroke(3.0f));

       for(ArrayList<Punto> uno: trazos){
        
           for(int i= 0; i < uno.size(); i++){
            
             Punto primero;
             Punto segundo;

             primero = uno.get(i);
             if(i+1 >= uno.size()){
                 break;
             }else{
                 segundo = uno.get(i+1);
             }

             g2D.draw(new Line2D.Double(primero.getX(), primero.getY(),segundo.getX(), segundo.getY()));
         }
       }
        
        
        
    }
}
