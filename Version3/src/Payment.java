
public class Payment extends Volvo{
	
	private double trade,cash,financing;
	 
	// Default constructor
	public Payment(){
		super();
		this.trade = 5000;
		this.cash = 750;
		this.financing = 0.07;
	}
	 	 
	// accountrameter constructor
	public Payment(double s_40,double s_60,double s_70,double s_80,double p_A,double p_B, double p,double t,double c,double f){
		
		super(s_40, s_60, s_70, s_80, p_A, p_B, p);
		this.trade = t;
		this.cash = c;
		this.financing = f;
	}

	// Mutators (Setters)
	public void setTrade(double t){		 
		this.trade = t;
	}
	public void setCash(double c){		 
		this.cash = c;
	}	 
	 
	public void setFinancing(double f){		 
		this.financing = f;
	}
	

	// Accessors (Getters)
	public double getTrade(){
		return this.trade;
	}
	public double getCash(){
		return this.cash;
	}	 	 
	public double getFinancing(){
		return this.financing;
	}	 
	

}
