import java.awt.*;
import javax.swing.*;

import CBPract.CBListener;

public class RBPract extends JFrame{

	private JRadioButton r1,r2;
	private JLabel option;
	private JButton click;
	private ButtonGroup bg;
	private JPanel panel;
	public RBPract(){

		this.setTitle("Practice");
		this.setSize(400,400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		r1=new JRadioButton("Option A",true);
		r2=new JRadioButton("Option B");
		option = new JLabel("");
		click = new JButton("CLICK");
		
		click.addActionListener(new clickListener());
		bg = new ButtonGroup();
		panel = new JPanel();
		
		bg.add(r1);
		bg.add(r2);
		panel.add(r1);
		panel.add(r2);
		panel.add(click);
		add(panel);
	}
	public static void main(String[] args){
		new RBPract();
	}
	//we don't have to create several actionListener, we can use if else statement to manage several buttons
	private class clickListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(r1.isSelected())
				option.setText("Option A is selected");
			else
				option.setText("Option B is selected");
		}
	}
}
