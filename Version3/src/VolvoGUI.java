import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;

public class VolvoGUI extends JFrame{
	
	private JPanel customerPanel,carPanel,paymentPanel,invoicePanel;
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
		this.setSize(400, 400);
		this.setVisible(true);
		
		
		
		
		
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String account;
		new VolvoGUI();
		
		//Customer info = new Customer();
		
		//account = info.getAccount();
	}
	
	private class VolvoGUIListener implements ActionListener{
    	public void actionPerformed(ActionEvent e){
    		String cN,cAd,cPn;
    			cN=name.getText();
    			cAd=address.getText();
    			cPn=pNumber.getText();
    			
    			customerLabel.setText("name"+cN+"address"+cAd+"phone"+cPn);
    	}
	}


}
