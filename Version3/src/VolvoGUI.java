import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;

public class VolvoGUI extends JFrame{
	
	private JPanel customerPanel;
	private JLabel customerLabel,acNLabel,acVLable,nameLabel,addressLabel,pNLabel;
	private JTextField name,address,pNumber;
	private JButton next;
	
	public VolvoGUI(){
		Customer info = new Customer();
		customerPanel = new JPanel();
		customerLabel = new JLabel("Customer Information");
		acNLabel = new JLabel("Account Number");
		acVLable = new JLabel(info.getAccount());
		
		nameLabel = new JLabel("Name");
		addressLabel = new JLabel("Address");
		pNLabel = new JLabel("Phone Number");
		
		//text field
		name = new JTextField(20);
		address = new JTextField(30);
		pNumber = new JTextField(20);
		
		//Button
		next = new JButton("Next");
		
		
		
		
		
		customerPanel.add(acNLabel);
		customerPanel.add(acVLable);
		customerPanel.add(nameLabel);
		customerPanel.add(name);
		customerPanel.add(addressLabel);
		customerPanel.add(address);
		customerPanel.add(pNLabel);
		customerPanel.add(pNumber);
		
		customerPanel.add(customerLabel);
		next.addActionListener(new VolvoGUIListener());
		customerPanel.add(next);
		
		add(customerPanel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

		this.setSize(400, 400);
		this.setVisible(true);

		
	}
		
	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String account;
		//void for test
		//new VolvoGUI();
		
		//new CarGui();
		
		//Customer info = new Customer();
		
		//account = info.getAccount();
	}*/

	private class VolvoGUIListener implements ActionListener{
    	public void actionPerformed(ActionEvent e){
    		String cAccount,cName,cAddress,cPnumber;
    			
    			cAccount=acVLable.getText();
    			cName=name.getText();
    			cAddress=address.getText();
    			cPnumber=pNumber.getText();
    			
    			//customerLabel.setText("account"+cAccount+"name"+cName+"address"+cAddress+"phone"+cPnumber);
    			
    			new CarGui();
    	}
	}


}

