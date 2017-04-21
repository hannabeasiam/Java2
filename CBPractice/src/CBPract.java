import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CBPract extends JFrame{

	JPanel CPanel,Lpanel;
	JCheckBox c1,c2,c3;
	JLabel l1,l2,l3;
		
	public CBPract(){
		this.setSize(400,400);
		this.setTitle("Check Boxes");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		CPanel = new JPanel();
		Lpanel = new JPanel();
		CPanel.setLayout(new GridLayout(3,1));
		Lpanel.setLayout(new GridLayout(3,1));
		this.setLayout(new GridLayout(1,2));
		//creat checkbox
		c1 = new JCheckBox("A",false);
		c2 = new JCheckBox("B",false);
		c3 = new JCheckBox("C",false);
		c1.addItemListener(new CBListener());
		c2.addItemListener(new CBListener());
		c3.addItemListener(new CBListener());
		l1 = new JLabel("");
		l2 = new JLabel("");
		l3 = new JLabel("");
		CPanel.add(c1);
		CPanel.add(c2);
		CPanel.add(c3);
		Lpanel.add(l1);
		Lpanel.add(l2);
		Lpanel.add(l3);
		add(CPanel);
		add(Lpanel);

		
		this.setVisible(true);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new CBPract();
	}
	
	private class CBListener implements ItemListener{
		public void itemStateChanged(ItemEvent i){
			if(i.getSource()==c1){
				if(c1.isSelected())
					l1.setText("A");
				else
					l1.setText("");
			}
			if(i.getSource()==c2){
				if(c2.isSelected())
					l2.setText("B");
				else
					l2.setText("");
			}
			if(i.getSource()==c3){
				if(c3.isSelected())
					l3.setText("C");
				else
					l3.setText("");
			}
			
	}
	}
}

