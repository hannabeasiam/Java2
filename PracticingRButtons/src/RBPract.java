import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class RBPract extends JFrame{

	private JRadioButton Red,Green,Blue;
	private JLabel option;
	private JButton Vote;
	private ButtonGroup color;
	private JPanel panel,VotePanel,ButtonPanel;
	public RBPract(){

		this.setTitle("Choose Your Favorite Color");
		this.setSize(400,400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel = new JPanel();
		VotePanel = new JPanel();
		ButtonPanel = new JPanel();
		//make radioButton
		Red=new JRadioButton("Red",false);
		Green=new JRadioButton("Green",false);
		Blue=new JRadioButton("Blue",false);
		//make button Group for color choose
		color = new ButtonGroup();
		//vote button
		Vote = new JButton("Vote");
		//show result 
		option = new JLabel("");

		Vote.addActionListener(new VoteListener());
		/*if we click radio button, directly response
		 * Red.addActionListener(new VoteListener());
		 * Blue.addActionListener(new VoteListener());
		 * Green.addActionListener(new VoteListener());
		 * */
		//panel.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));
		//panel.setLayout(new GridLayout(5,1));
		
		color.add(Red);
		color.add(Green);
		color.add(Blue);
		panel.setLayout(new GridLayout(3,1));
		Red.setHorizontalAlignment(JRadioButton.CENTER);
		Green.setHorizontalAlignment(JRadioButton.CENTER);
		Blue.setHorizontalAlignment(JRadioButton.CENTER);
		
		panel.add(Red);
		panel.add(Green);
		panel.add(Blue);
		VotePanel.add(Vote);
		ButtonPanel.add(option);
		this.setLayout(new GridLayout(3,1));
		add(panel);
		add(VotePanel);
		add(ButtonPanel);
		this.setVisible(true);
	}
	public static void main(String[] args){
		new RBPract();
	}
	//we don't have to create several actionListener, we can use if else statement to manage several buttons
	private class VoteListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==Red)
				Vote.doClick();
			if(e.getSource()==Blue)
				Vote.doClick();
			if(e.getSource()==Green)
				Vote.doClick();
			
			
			if(Red.isSelected())
				option.setText("You Voted by Red");
			else if(Blue.isSelected())
				option.setText("You Voted by blue");
			else
				option.setText("You Voted by Green");
		}
	}
}
