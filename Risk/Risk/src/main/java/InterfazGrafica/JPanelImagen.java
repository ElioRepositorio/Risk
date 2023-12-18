/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfazGrafica;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author ManTequila
 */
public class JPanelImagen extends JPanel implements Serializable {  

    //Serializable es lo que lo convierte en bean, y Jpanel el modelo
    

  private File rutaImagen = new File(".\\src\\beans\\imagenJpanel.jpg.png");
  private Point initialClick;
  //C:\Users\ManTequila\Documents\NetBeansProjects\Alcalde_Lopez_Elio_DI03_Tarea\src\beans\imagenJpanel.jpg.png



    public JPanelImagen() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                initialClick = e.getPoint();
                getComponentAt(initialClick);
            }
        });

        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                int thisX = getLocation().x;
                int thisY = getLocation().y;

                int xMoved = (thisX + evt.getX()) - (thisX + initialClick.x);
                int yMoved = (thisY + evt.getY()) - (thisY + initialClick.y);

                int X = thisX + xMoved;
                int Y = thisY + yMoved;

                setLocation(X, Y);
            }
        });
    }
    
public File getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(File rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody  
    
        if(rutaImagen!=null && rutaImagen.exists() ){
        ImageIcon imageIcon = new ImageIcon(rutaImagen.getAbsolutePath()); //selecciona ruta de la imagen 
    
        g.drawImage(imageIcon.getImage(),0, 0, null);  //pintamos jpanel con la imagen
    
    }

    }
}
