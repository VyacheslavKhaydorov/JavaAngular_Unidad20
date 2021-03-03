/**
 * 
 */
package JavaAngular.Unidad20.Ejerc01;

import javax.swing.*;
import java.awt.Color;

/**
 * @author viach
 *
 */
public class AplicacionGrafica extends JFrame {
	
	private JPanel panelDeContenido;
	
	public AplicacionGrafica() {
		
		setTitle("Ejercicio 1");
		
		setBounds(300,300,300,146);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setVisible(true);
		
		panelDeContenido = new JPanel();
		
		panelDeContenido.setLayout(null);
		
		setContentPane(panelDeContenido);
		
		//Etiqueta
		JLabel etiqueta = new JLabel("Este es el ejercicio 1 de la unidad 20");
		etiqueta.setForeground(Color.BLACK);
		etiqueta.setBounds(46,38,185,30);
		panelDeContenido.add(etiqueta);
		
	}

}
