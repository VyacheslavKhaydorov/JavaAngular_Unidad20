/**
 * 
 */
package JavaAngular.Unidad20.Ejerc07;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;

/**
 * @author viach
 *
 */
public class AplicacionGrafica extends JFrame {
	
	private JPanel panelPrincipal;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnNewButton;
	
	DecimalFormat df = new DecimalFormat("0.00");
	
	private double resultadoCambio;
	private boolean tipoCambio = true;
	private final double CAMBIO_PESETAS_EUROS = 166.386;
	
	public AplicacionGrafica() {
		setBounds(600,600,468,139);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Calculadora cambio de monedas");
		panelPrincipal = new JPanel();
		panelPrincipal.setLayout(null);
		setContentPane(panelPrincipal);
		
		//Valor introducido por el usuario
		textField = new JTextField();
		textField.setBounds(141, 11, 86, 20);
		panelPrincipal.add(textField);
		textField.setColumns(10);
		
		//Resultado
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(356, 11, 86, 20);
		panelPrincipal.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Cantidad a convertir:");
		lblNewLabel.setBounds(10, 14, 121, 14);
		panelPrincipal.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Resultado:");
		lblNewLabel_1.setBounds(281, 14, 65, 14);
		panelPrincipal.add(lblNewLabel_1);
		
		btnNewButton = new JButton("De pesetas a euros");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tipoCambio) {
					resultadoCambio = Double.parseDouble(textField.getText()) / CAMBIO_PESETAS_EUROS;
					textField_1.setText(String.valueOf(df.format(resultadoCambio)));
				}
				else {
					resultadoCambio = Double.parseDouble(textField.getText()) * CAMBIO_PESETAS_EUROS;
					textField_1.setText(String.valueOf(df.format(resultadoCambio)));
				}
			}
		});
		btnNewButton.setBounds(49, 59, 160, 23);
		panelPrincipal.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cambiar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tipoCambio) {
					tipoCambio = false;
					btnNewButton.setText("De euros a pesetas");
				}
				else {
					tipoCambio = true;
					btnNewButton.setText("De pesetas a euros");
				}
			}
		});
		btnNewButton_1.setBounds(246, 59, 160, 23);
		panelPrincipal.add(btnNewButton_1);

		setLocationRelativeTo(null);	//Centra la ventana en medio de la pantalla
		setVisible(true);
		
	}
}
