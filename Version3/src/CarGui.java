import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CarGui extends JFrame{

	private JPanel carPanel;
	private JRadioButton R_s40,R_s60,R_s70,R_s80;
	private JLabel model, act;
	private JButton clickS40,clickS60,clickS70,clickS80;
	private ButtonGroup modelGroup;
	
	public CarGui(){
		
		Customer vaccount = new Customer();
		act = new JLabel("Customer Account Number: " + vaccount.);
		
		
		//Volvo car = new Volvo();
		this.setTitle("Volvo car Models");
		this.setSize(400, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		
		R_s40 = new JRadioButton("R_s40  $27,700",true);
		R_s60 = new JRadioButton("R_s60  $32,500");
		R_s70 = new JRadioButton("R_s70  $36,000");
		R_s80 = new JRadioButton("R_s80  $44,000");
		//set message depends on JRadioButton selected
		model = new JLabel("");
		clickS40  = new JButton("Click S40");
		clickS40.addActionListener(new CarGuiListener());
		clickS60  = new JButton("Click S60");
		clickS60.addActionListener(new CarGuiListener());
		clickS70  = new JButton("Click S70");
		clickS70.addActionListener(new CarGuiListener());
		clickS80  = new JButton("Click S80");
		clickS80.addActionListener(new CarGuiListener());
		
		modelGroup = new ButtonGroup();
		carPanel = new JPanel();
		//carPanel.setLayout(new GridLayout(6,1));
		modelGroup.add(R_s40);
		modelGroup.add(R_s60);
		modelGroup.add(R_s70);
		modelGroup.add(R_s80);
		
		//account number
		carPanel.add(act);
		
		carPanel.add(model);
		carPanel.add(R_s40);
		carPanel.add(R_s60);
		carPanel.add(R_s70);
		carPanel.add(R_s80);
		
		carPanel.add(clickS40);
		carPanel.add(clickS60);
		carPanel.add(clickS70);
		carPanel.add(clickS80);
		
		add(carPanel);
		this.setVisible(true);
		
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String account;
		new VolvoGUI();
		//new CarGui();
		
		//Customer info = new Customer();
		
		//account = info.getAccount();
	}
	
	private class CarGuiListener implements ActionListener{
    	public void actionPerformed(ActionEvent e){
    		if(e.getSource() == clickS40)
    			R_s40.doClick();
    		if(e.getSource() == clickS60)
    			R_s60.doClick();
    		if(e.getSource() == clickS70)
    			R_s70.doClick();
    		if(e.getSource() == clickS80)
    			R_s80.doClick();
    		
    		
    		
    		
    		
    		
    		if(R_s40.isSelected())
    			model.setText("R_s40");
    		else if(R_s60.isSelected())
				model.setText("R_s60");
    		else if(R_s70.isSelected())
				model.setText("R_s70");
    		else
    			model.setText("R_s80");
    			
    	}
	}


}