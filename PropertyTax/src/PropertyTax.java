import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PropertyTax extends JFrame{
	// Variables / Components
	JPanel panel;
	JLabel propertyValue,assessmentValue,propertyTax;
	JTextField inputValue;
	JButton calculate;

	// Default constructor
	public PropertyTax(){
		// Windows properties
		int width=500;
		int height=500;
		setSize(width,height);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		propertyValue = new JLabel("Property Value");
		inputValue = new JTextField(10);
		assessmentValue = new JLabel("Assessment Value");
		propertyTax = new JLabel("Property Tax");
		calculate = new JButton("Calculate");
		calculate.addActionListener(new propertyTaxListener());
		panel.add(propertyValue);
		panel.add(inputValue);
		panel.add(assessmentValue);
		panel.add(propertyTax);
		panel.add(calculate);
		
		add(panel);
		
		setVisible(true);
	}
	public static void main(String[] arg){
		new PropertyTax();
	}
	private class propertyTaxListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			// Create onclick calculate
			String input = inputValue.getText();
			double pValue = Double.parseDouble(input);
			double aValue = 0.6 * pValue;
			double pTax = 0.64 * (aValue/100);
			assessmentValue.setText("Assessment Value: "+Double.toString(aValue));
			propertyTax.setText("Property Tax: "+Double.toString(pTax));
		}
	}
}
