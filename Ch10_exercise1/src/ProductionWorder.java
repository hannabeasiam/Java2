/**
 * Next, write a class named ProductionWorker that extends the Employee class. 
 * The ProductionWorker class should have fields to hold the following information:
 *  �	Shift	(an	integer)
 *  �	Hourly	pay	rate	(a	double) The workday is divided into two shift -int
 * @author Hanna
 *
 */
public class ProductionWorder extends Employee {

	private int shift;
	private double hRate;
	
	public ProductionWorder(String n, String en, int h, int s, double hr){
		super(n, en, h);
		shift = s;
		hRate = hr;
	}
	public void setShift(int s){
		shift = s;
	}
	public void setHRate(double hr){
		hRate = hr;
	}
	public int getShift(){
		return shift;
	}
	public double getHRate(){
		return hRate;
	}
	public String toString(){
		//return "Production Worker Info\n Name: "+super.getName()+"\nShift Code: "+shift+"\n Hour Rate: "+hRate+"\n";
		return "Production Worker Info\n Name: "+name+"\nShift Code: "+shift+"\n Hour Rate: "+hRate+"\n";
	}
}
