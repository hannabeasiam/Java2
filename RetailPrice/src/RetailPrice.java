import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class RetailPrice extends JFrame{
	// Variables / Components
	JPanel panel,panelp;
	JLabel retailPrice,wsCost,mkPercent;
	JTextField wholesaleCost,markupPercentage;
	JButton calculate;

	// Default constructor
	public RetailPrice(){
		// Windows properties
		int width=500;
		int height=500;
		setSize(width,height);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		//another panel to playing with gridLayout
		//--panelp = new JPanel();
		wsCost = new JLabel("Wholesale Cost");
		wholesaleCost = new JTextField(10);
		mkPercent = new JLabel("Markup Percentage");
		markupPercentage = new JTextField(10);
		retailPrice = new JLabel("Retail Price");
		calculate = new JButton("Calculate");
		calculate.addActionListener(new retailPriceListener());
		//set and try Layout (FlowLayout/BorderLayout/GridLayout)
		//make attached from left side 
		//panel.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		//panel.setLayout(new FlowLayout(FlowLayout.CENTER));
		//20,10... those make space between boxes (int alignment, int horizontal gap, int vertical gap)
		//panel.setLayout(new FlowLayout(FlowLayout.RIGHT,20,20));
		
		//playing with border layout 
		//panel.setLayout(new BorderLayout(20,20));
		//panel.add(wsCost,BorderLayout.NORTH);
		//panel.add(wholesaleCost,BorderLayout.SOUTH);
		
		//GridLayout(int rows, int columns)
		panel.setLayout(new GridLayout(4,1));
		
		//--panelp.setLayout(new GridLayout(1,2));
		//--this.setLayout(new BorderLayout());
		panel.add(wsCost);
		panel.add(wholesaleCost);
		panel.add(mkPercent);
		panel.add(markupPercentage);
		panel.add(retailPrice);
		panel.add(calculate);
		//--panelp.add(retailPrice);
		//--panelp.add(calculate);
		add(panel);
		//--add(panel,BorderLayout.EAST);
		//--add(panelp,BorderLayout.WEST);
		setVisible(true);
	}
	public static void main(String[] arg){
		new RetailPrice();
	}
	private class retailPriceListener implements ActionListener{
		//ActionListener need to include action performer
		public void actionPerformed(ActionEvent e){
			// Create onclick calculate
			
			String input = wholesaleCost.getText();
			double wValue = Double.parseDouble(input);
			
			String input2 = markupPercentage.getText();
			double mValue = Double.parseDouble(input2);
			double mPrice = wValue * mValue/100;
			double Rprice = wValue + mPrice;
			
			retailPrice.setText("Retail Price is : "+Double.toString(Rprice));
		}
	}
}
