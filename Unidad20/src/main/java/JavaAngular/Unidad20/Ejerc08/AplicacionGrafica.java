/**
 * 
 */
package JavaAngular.Unidad20.Ejerc08;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.*;

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
	private JButton btnNewButton_2;
	
	public AplicacionGrafica() {
		setBounds(600,600,538,139);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Calculadora cambio de monedas");
		panelPrincipal = new JPanel();
		panelPrincipal.setLayout(null);
		setContentPane(panelPrincipal);
		
		//Valor introducido por el usuario
		textField = new JTextField();
		textField.setBounds(170, 11, 86, 20);
		panelPrincipal.add(textField);
		textField.setColumns(10);
		
		//Resultado
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(385, 11, 86, 20);
		panelPrincipal.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Cantidad a convertir:");
		lblNewLabel.setBounds(39, 14, 121, 14);
		panelPrincipal.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Resultado:");
		lblNewLabel_1.setBounds(310, 14, 65, 14);
		panelPrincipal.add(lblNewLabel_1);
		
		btnNewButton = new JButton("De pesetas a euros");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tipoCambio) {
					try {
					resultadoCambio = Double.parseDouble(textField.getText()) / CAMBIO_PESETAS_EUROS;
					textField_1.setText(String.valueOf(df.format(resultadoCambio)));
					}catch(Exception ex) {
						JOptionPane.showMessageDialog(null,"El valor introducido no es correcto","Error!",JOptionPane.INFORMATION_MESSAGE);
					}
				}
				else {
					try {
					resultadoCambio = Double.parseDouble(textField.getText()) * CAMBIO_PESETAS_EUROS;
					textField_1.setText(String.valueOf(df.format(resultadoCambio)));
					}catch(Exception ex) {
						JOptionPane.showMessageDialog(null,"El valor introducido no es correcto","Error!",JOptionPane.INFORMATION_MESSAGE);
					}
				}
			}
		});
		btnNewButton.setBounds(10, 59, 160, 23);
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
		btnNewButton_1.setBounds(180, 59, 160, 23);
		panelPrincipal.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Borrar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
			}
		});
		btnNewButton_2.setBounds(350, 59, 160, 23);
		panelPrincipal.add(btnNewButton_2);

		setLocationRelativeTo(null);	//Centra la ventana en medio de la pantalla
		setVisible(true);
		
	}
}
