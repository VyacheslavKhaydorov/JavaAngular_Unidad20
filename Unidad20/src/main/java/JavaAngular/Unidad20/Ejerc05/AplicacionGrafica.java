/**
 * 
 */
package JavaAngular.Unidad20.Ejerc05;

import javax.swing.*;
import java.awt.event.*;

/**
 * @author viach
 *
 */
public class AplicacionGrafica extends JFrame {
	
	private JPanel panelDeContenido;
	
	private JTextArea textArea = new JTextArea();
	
	public AplicacionGrafica() {
		
		setTitle("Ejercicio 5");
		
		setBounds(300,300,300,250);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setVisible(true);
		
		panelDeContenido = new JPanel();
		
		panelDeContenido.setLayout(null);
		
		setContentPane(panelDeContenido);
		
		textArea.setBounds(10, 56, 264, 144);
		textArea.setEditable(false);
		panelDeContenido.add(textArea);
		textArea.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textArea.append("El ratón ha hecho click en el componente\n");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				textArea.append("El ratón ha entrado en el componente\n");
				}
			@Override
			public void mouseExited(MouseEvent e) {
				textArea.append("El ratón ha salido del componente\n");
				}
		});
		textArea.setBounds(10, 56, 264, 150);
		panelDeContenido.add(textArea);
		textArea.setColumns(10);
		
		JButton btnNewButton = new JButton("Limpiar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
			}
		});
		btnNewButton.setBounds(92, 22, 89, 23);
		panelDeContenido.add(btnNewButton);
					
	}

}
