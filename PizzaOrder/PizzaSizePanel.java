import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class PizzaSizePanel extends JPanel{
	
	private JRadioButton small,medium,large;
	private ButtonGroup pSize;
	private double cost=10.0;
	public PizzaSizePanel(){
		small=new JRadioButton("small",true);
		medium=new JRadioButton("medium");
		large=new JRadioButton("large");
		pSize=new ButtonGroup();
		small.addActionListener(new pSizeListener());
		medium.addActionListener(new pSizeListener());
		large.addActionListener(new pSizeListener());
		setBorder(BorderFactory.createTitledBorder("Size"));
		setLayout(new GridLayout(3,1));
		pSize.add(small);
		pSize.add(medium);
		pSize.add(large);
		add(small);
		add(medium);
		add(large);
	}

	private class pSizeListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==small)
				cost=10.0;
			else if(e.getSource()==medium)
				cost=20.0;
			else if(e.getSource()==large)
				cost=30.0;
			else
				cost=0.0;
		}
	}
	
	public double getCost(){
		return cost;
	}
	
}
