package aplication;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class AplMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] letraCancion = {
    		    "Te quise con el alma, bien sabes",
    		    "Que amarte más no pude, volaste",
    		    "Con rumbo hacia las nubes, más altas",
    		    "Ya no pude alcanzarte",
    		    "",
    		    "Hoy cuando de la nube te bajas",
    		    "Ya es demasiado tarde, que vaina",
    		    "Pues ya no queda nada, de aquel amor tan grande",
    		    "",
    		    "Quien pudo amarnos más que Dios",
    		    "Si fue quien nos creó un día a su semejanza",
    		    "El mismo que en la cruz murió por nuestra salvación",
    		    "Uno como si nada",
    		    "",
    		    "De igual manera sufrí yo la ausencia de su amor",
    		    "Mientras tanto volabas",
    		    "Sin importarte mi dolor, ahí estuvo tu error",
    		    "Entonces qué reclamas",
    		    "",
    		    "Y hoy vienes buscando perdón",
    		    "Porque un viento quebró tus alas",
    		    "Y hoy vienes buscando perdón",
    		    "Porque un viento quebró tus alas"
    		};
		
		// Crear el JFrame para mostrar la imagen
        JFrame x = new JFrame();
        x.setSize(600, 400);
        x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        x.setLayout(new BorderLayout());
		
        // Crear un JPanel personalizado que pinta la imagen de fondo
        JPanel backgroundPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Cargar la imagen
                ImageIcon icon = new ImageIcon("src/aplication/diomedes.jpeg");  // Asegúrate de que la imagen está en la ruta correcta
                Image img = icon.getImage();
                // Dibujar la imagen de fondo ajustada al tamaño del panel
                g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            }
        };
        x.add(backgroundPanel, BorderLayout.CENTER);  // Agregar el panel con la imagen al JFrame
        
     // Mostrar la ventana centrada
        x.setLocationRelativeTo(null); // Centrar la ventana en la pantalla
        x.setVisible(true);
        

        // Mostrar cada línea de la canción en un JOptionPane
        for (String linea : letraCancion) {
            JOptionPane.showMessageDialog(null, linea, "diomedes.java", JOptionPane.INFORMATION_MESSAGE);
            // Pausa entre cada línea para simular una transición (opcional)
            try {
                Thread.sleep(100);  // Pausa de 1 segundo entre líneas
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        
        }
	}

}
