import java.awt.*;
import java.awt.event.*;


import javax.swing.*;
public class ToppingPanel extends JPanel{

	private JCheckBox xtraCheese,anchovies;
	private double cost;
	public ToppingPanel(){
		xtraCheese= new JCheckBox("Extra Cheese");
		anchovies=new JCheckBox("Anchovies");
		
		setBorder(BorderFactory.createTitledBorder("Toppings"));
		xtraCheese.addItemListener(new toppingListener());
		anchovies.addItemListener(new toppingListener());
		setLayout(new GridLayout(2,1));
		
		add(anchovies);
		add(xtraCheese);
		
	}
	private class toppingListener implements ItemListener{
		public void itemStateChanged(ItemEvent e){
			cost=0;
			if(xtraCheese.isSelected())
				cost+=2.5;
			if(anchovies.isSelected())
				cost+=3.75;
		}
	}

	public double getCost(){
		return cost;
	}
}
