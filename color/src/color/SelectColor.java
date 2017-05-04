package color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SelectColor extends JFrame {
	//declare components
	JPanel Mycolors,VotePanel, ButtonPanel;
	JRadioButton red,green,blue;
	ButtonGroup buttonG;
	JButton select;
	JLabel colorSlected;
	
	//Constructor
	public SelectColor(){
		this.setSize(400,400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//construct the components
		Mycolors = new JPanel();
		VotePanel = new JPanel();
		ButtonPanel = new JPanel();
		//create radio Button
		red = new JRadioButton("Red",false);
		green = new JRadioButton("Green",false);
		blue = new JRadioButton("Blue",false);
		//make Button group
		buttonG = new ButtonGroup();
		select = new JButton("Select");
		colorSlected = new JLabel("No Color");
		//listner
		select.addActionListener(new SelectColorListener());

		//add the components to group and panel
		buttonG.add(red);
		buttonG.add(green);
		buttonG.add(blue);
		Mycolors.setLayout(new GridLayout(3,1));
		
		Mycolors.add(red);
		Mycolors.add(green);
		Mycolors.add(blue);
		ButtonPanel.add(select);
		VotePanel.add(colorSlected);
		this.setLayout(new GridLayout(3,1));
		add(Mycolors);
		add(ButtonPanel);
		add(VotePanel);
		this.setVisible(true);
		
		
		
	}

	public static void main(String[] args){
		new SelectColor();
	}
	
	private class SelectColorListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(red.isSelected()){
				colorSlected.setText("Red");
			}
			else if(green.isSelected()){
				colorSlected.setText("Green");
			}
			else if(blue.isSelected()){
				colorSlected.setText("Blue");
			}
			else{
				colorSlected.setText("No Color");
			}
		}
	}}

