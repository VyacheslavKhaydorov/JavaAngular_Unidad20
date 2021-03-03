/**
 * 
 */
package JavaAngular.Unidad20.Ejerc04;

import javax.swing.*;
import java.awt.event.*;

/**
 * @author viach
 *
 */
public class AplicacionGrafica extends JFrame {
	
	private JPanel panelDeContenido;
	private JTextArea textArea = new JTextArea();
	private JLabel labelTextArea = new JLabel("Eventos");
	
	public AplicacionGrafica() {
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				textArea.append("Ventana activada\n");
			}
			@Override
			public void windowOpened(WindowEvent e) {
				textArea.append("Ventana abierta\n");
			}
		});
		
		setTitle("Ejercicio 4");
		
		setBounds(300,300,300,250);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setVisible(true);
		
		panelDeContenido = new JPanel();
		
		panelDeContenido.setLayout(null);
		
		setContentPane(panelDeContenido);
		
		labelTextArea.setBounds(10,98,45,15);
		panelDeContenido.add(labelTextArea);
		
		textArea.setEditable(false);
		panelDeContenido.add(textArea);
		labelTextArea.setLabelFor(textArea);
		textArea.setBounds(65, 29, 209, 151);
		textArea.setColumns(10);
		
	};
				
}

