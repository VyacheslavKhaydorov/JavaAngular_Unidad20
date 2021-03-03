/**
 * 
 */
package JavaAngular.Unidad20.Ejerc02;

import javax.swing.*;
import java.awt.event.*;

/**
 * @author viach
 *
 */
public class AplicacionGrafica extends JFrame {
	
	private JPanel panelDeContenido;
	private JLabel etiqueta;
	
	//Botones
	JButton boton1 = new JButton("Boton 1");
	JButton boton2 = new JButton("Boton 2");
	
	public AplicacionGrafica() {
		
		setTitle("Ejercicio 2");
		
		setBounds(300,300,300,250);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setVisible(true);
		
		panelDeContenido = new JPanel();
		
		panelDeContenido.setLayout(null);
		
		setContentPane(panelDeContenido);
		
		//Etiqueta
		etiqueta = new JLabel("Aun no se ha apretado ningun boton");
		etiqueta.setBounds(45,50,250,200);
		panelDeContenido.add(etiqueta);
		
		//Action Listener para los botones
		ActionListener botonPulsado = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				etiqueta.setBounds(25,50,250,200);
				JButton pulsado = (JButton) e.getSource();
				etiqueta.setText("El ultimo boton apretado ha sido el " + pulsado.getText().toLowerCase());
			}
			
		};
		
		boton1.setBounds(35, 50, 100, 50);
		panelDeContenido.add(boton1);
		//Asignamos un ActionListener para responder a la pulsacion del boton
		boton1.addActionListener(botonPulsado);
		
		boton2.setBounds(150, 50, 100, 50);
		panelDeContenido.add(boton2);
		//Asignamos un ActionListener para responder a la pulsacion del boton
		boton2.addActionListener(botonPulsado);
				
	}

}
