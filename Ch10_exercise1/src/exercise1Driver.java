import javax.swing.JOptionPane;
public class exercise1Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee E1 = CreateEmployee();
		JOptionPane.showMessageDialog(null, E1);
		E1.setEmpNum("333-L");
		JOptionPane.showMessageDialog(null,E1);
		ProductionWorder P1=CreateProductionWorker();
		JOptionPane.showMessageDialog(null,P1);
		//System.out.println(P1.getName());
		System.out.println(P1.name);
	}

	public static Employee CreateEmployee(){
		String n=JOptionPane.showInputDialog("Enter name");
		String en=JOptionPane.showInputDialog("Enter Employee #");
		int h=Integer.parseInt(JOptionPane.showInputDialog("Enter Year"));
		Employee E=new Employee(n,en,h);
		return E;
	}
	public static ProductionWorder CreateProductionWorker(){
		String n=JOptionPane.showInputDialog("Enter name");
		String en=JOptionPane.showInputDialog("Enter Employee #");
		int h=Integer.parseInt(JOptionPane.showInputDialog("Enter Year"));
		int s=Integer.parseInt(JOptionPane.showInputDialog("Shift Code(1 or 2)"));
		double hr=Double.parseDouble(JOptionPane.showInputDialog("Hour rate"));
		ProductionWorder E=new ProductionWorder(n,en,h,s,hr);
		return E;
	}
}
