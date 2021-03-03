/**
 * 
 */
package JavaAngular.Unidad20.Ejerc03;

import javax.swing.*;
import java.awt.event.*;

/**
 * @author viach
 *
 */
public class AplicacionGrafica extends JFrame {
	
	int contadorEtiqueta1 = 0;
	int contadorEtiqueta2 = 0;
	
	private JPanel panelDeContenido;
	private JLabel etiqueta1 = new JLabel("Boton 1: " + contadorEtiqueta1);
	private JLabel etiqueta2 = new JLabel("Boton 2: " + contadorEtiqueta2);
	
	//Botones
	JButton boton1 = new JButton("Boton 1");
	JButton boton2 = new JButton("Boton 2");
	
	public AplicacionGrafica() {
		
		setTitle("Ejercicio 3");
		
		setBounds(300,300,300,250);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setVisible(true);
		
		panelDeContenido = new JPanel();
		
		panelDeContenido.setLayout(null);
		
		setContentPane(panelDeContenido);
		
		etiqueta1.setBounds(35,24,100,15);
		panelDeContenido.add(etiqueta1);
		
		etiqueta2.setBounds(150,24,95,15);
		panelDeContenido.add(etiqueta2);
		
		//Action Listener para los botones
		ActionListener botonPulsado = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton pulsado = (JButton) e.getSource();
				if (pulsado.getText().equals("Boton 1")) {
					contadorEtiqueta1++;
					etiqueta1.setText("Boton 1: " + contadorEtiqueta1);
				}
				else if (pulsado.getText().equals("Boton 2")) {
					contadorEtiqueta2++;
					etiqueta2.setText("Boton 2: " + contadorEtiqueta2);
				}
				
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
