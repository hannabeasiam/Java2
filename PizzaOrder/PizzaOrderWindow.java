import java.awt.*;
import java.awt.font.*;
import java.awt.event.*;
import javax.swing.*;
public class PizzaOrderWindow extends JFrame{
	private final int WIDTH=400,HEIGHT=300;
	private PizzaSizePanel pizzaSize;
	private PizzaTypePanel pizzaType;
	private ToppingPanel pizzaTopping;
	private JPanel checkPanel;
	private JButton checkPrice;
	public PizzaOrderWindow(){
		this.setTitle("BC Pizza");
		this.setSize(WIDTH,HEIGHT);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		pizzaSize=new PizzaSizePanel();
		pizzaType= new PizzaTypePanel();
		pizzaTopping= new ToppingPanel();
		checkPanel=new JPanel();
		checkPrice=new JButton();
		checkPrice.addActionListener(new checkPriceListerner());
		checkPrice.setText("Get Price");
		add(pizzaSize,BorderLayout.WEST);
		add(pizzaType,BorderLayout.CENTER);
		add(pizzaTopping,BorderLayout.EAST);
		checkPanel.add(checkPrice);
		add(checkPanel,BorderLayout.SOUTH);
		this.setVisible(true);
	}
	private class checkPriceListerner implements ActionListener{
		public void actionPerformed(ActionEvent e){
			JOptionPane.showMessageDialog(null, String.format("Pizza Price: $%.2f", pizzaSize.getCost()+pizzaType.getCost()+pizzaTopping.getCost()));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PizzaOrderWindow();
	}

}
