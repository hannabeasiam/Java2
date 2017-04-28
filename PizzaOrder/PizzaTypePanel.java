import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class PizzaTypePanel extends JPanel{
	private JRadioButton pepperoni,supreme;
	private ButtonGroup pType;
	private double cost;
	public PizzaTypePanel(){
		pepperoni= new JRadioButton("Pepperoni",true);
		supreme= new JRadioButton("Supreme");
		pType=new ButtonGroup();
		setBorder(BorderFactory.createTitledBorder("Type"));
		pepperoni.addActionListener(new pTypeListener());
		supreme.addActionListener(new pTypeListener());
		pType.add(pepperoni);
		pType.add(supreme);
		setLayout(new GridLayout(2,1));
		add(pepperoni);
		add(supreme);
	}
	private class pTypeListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==pepperoni)
				cost=5.0;
			else if(e.getSource()==supreme)
				cost=10.0;
			else
				cost=0.0;
		}
	}
	
	public double getCost(){
		return cost;
	}
}
