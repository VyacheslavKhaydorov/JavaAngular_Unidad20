/**
 * 
 */
package JavaAngular.Unidad20.Ejerc06;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * @author viach
 *
 */
public class AplicacionGrafica extends JFrame {
	
	private JPanel panelPrincipal;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	private double altura, peso, resultadoIMC;
	
	public AplicacionGrafica() {
		setBounds(600,600,437,250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Calculadora de indice de masa corporal");
		panelPrincipal = new JPanel();
		panelPrincipal.setLayout(null);
		setContentPane(panelPrincipal);
		
		//Altura
		textField = new JTextField();
		textField.setBounds(272, 11, 86, 20);
		panelPrincipal.add(textField);
		textField.setColumns(10);
		
		//Peso
		textField_1 = new JTextField();
		textField_1.setBounds(272, 58, 86, 20);
		panelPrincipal.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Altura (metros)");
		lblNewLabel.setBounds(66, 14, 86, 14);
		panelPrincipal.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Peso (kg)");
		lblNewLabel_1.setBounds(66, 61, 57, 14);
		panelPrincipal.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Calcular IMC");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				altura = Double.parseDouble(textField.getText());
				peso = Double.parseDouble(textField_1.getText());
				resultadoIMC = peso / Math.pow(altura, 2);
				textField_2.setText(String.valueOf(resultadoIMC));
			}
		});
		btnNewButton.setBounds(149, 117, 128, 23);
		panelPrincipal.add(btnNewButton);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(162, 168, 103, 20);
		panelPrincipal.add(textField_2);
		textField_2.setColumns(10);

		setLocationRelativeTo(null);	//Centra la ventana en medio de la pantalla
		setVisible(true);
		
	}
}
