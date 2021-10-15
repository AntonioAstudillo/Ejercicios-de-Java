package cursoGui;

import java.awt.*;
import javax.swing.*;

public class Ventana extends JFrame
{
   public Ventana()
   {
	   this.setSize(500, 500);
	   this.setVisible(true);
	   this.setTitle("HOLA MUNDO");
	   //this.setLocation(350,300);
	   //this.setBounds(350, 300, 500 , 500);  
       this.setLocationRelativeTo(null);
	   //this.setResizable(false); //con este metodo establecemos si la ventana puede cambiar de tamañano o no
       this.setMinimumSize(new Dimension(500,200)); // establecemos una capacidad minima que puede tener mi ventana
       //this.getContentPane().setBackground(Color.blue); //asi se cambia el color de una ventana
       
       iniciarComponentes();
       
       this.setDefaultCloseOperation(EXIT_ON_CLOSE);
   }
   
   //creamos un metodo para crear el panel
   
   private void iniciarComponentes()
   {
	   JPanel panel = new JPanel();
       this.getContentPane().add(panel);
       //   panel.setBackground(Color.black);
       //instanciamos un objeto de la clase JLabel
       panel.setLayout(null);
       JLabel etiqueta = new JLabel();
       etiqueta.setText("que pedo putos");
       etiqueta.setBounds(100, 100, 100, 30);
       etiqueta.setForeground(Color.red); //le damos un color al texto de nuestra etiqueta
       etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
       //etiqueta.setOpaque(true); //con este metodo le damos permiso para cambiar el fondo de la etiqueta
      // etiqueta.setBackground(Color.white); //le damos un color de fondo a nuestra etiqueta
       panel.add(etiqueta);
       etiqueta.setFont(new Font("Courier",Font.BOLD,12));
       
       //etiqueta tipo imagen
       ImageIcon imagen = new ImageIcon("balon.jpg");
       JLabel etiqueta2= new JLabel(imagen);
       
       etiqueta2.setBounds(10, 80, 10, 10);
       panel.add(etiqueta2);
       
   }
   
}
