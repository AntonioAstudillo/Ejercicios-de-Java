package ejercicios;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
import java.awt.geom.Ellipse2D.Double;

public class PruebaDibujo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        MarcoConDibujos mimarco = new MarcoConDibujos();
        
        //ESTAS DOS INSTRUCCIONES ME SIRVE
        //PRA CREAR EL MARCO
        mimarco.setVisible(true);
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
	}

}

//creando nuestro marco

class MarcoConDibujos extends JFrame{
	
	
	public MarcoConDibujos()
	{
		// asi creo un marco o frame
		setTitle("prueba de Dibujo");
		setSize(400,400);
		
		LaminaConFiguras milamina= new LaminaConFiguras();		
		add(milamina);
		
		//pongo un color de fondo
		//milamina.setBackground(Color.black);
		
		//aplico el color por defecto de window
		milamina.setBackground(SystemColor.window);
		
		
	}
}


class LaminaConFiguras extends JPanel
{
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		//g.drawRect(50,50,200,200);
		//g.drawLine(100, 100, 300, 200);
	    //g.drawArc(50, 100, 100, 200, 120,150);
	    
		Graphics2D g2 = (Graphics2D) g;
		
		Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);	    
		
		g2.setPaint(Color.blue);
		g2.draw(rectangulo);
		
		g2.setPaint(Color.red);
		
		
		g2.fill(rectangulo);
		
		
		Ellipse2D elipse = new Ellipse2D.Double();
		
		elipse.setFrame(rectangulo);
		
		Color micolor=new Color(125,189,200);
		
		
		g2.setPaint(micolor);
		
		
		
		g2.fill(elipse);
		
	
	//	g2.draw(new Line2D.Double(100,100,300,250));
	
		//double CentroenX=rectangulo.getCenterX();
		//double CentroenY=rectangulo.getCenterY();
		
		//double radio=150;
		
		
		//Ellipse2D circulo= new Ellipse2D.Double();
		
		//circulo.setFrameFromCenter(CentroenX, CentroenY, CentroenX+radio, CentroenY+radio);

		//g2.draw(circulo);
		
		
		
	
	}
	
}