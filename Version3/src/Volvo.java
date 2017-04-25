
public class Volvo {
	// Private variables
	private double s40,s60,s70,s80,pA,pB,paint;
	 
	// Default constructor
	public Volvo(){
		this.s40 = 27700;
		this.s60 = 32500;
		this.s70 = 36000;
		this.s80 = 44000;
		this.pA = 2200;
		this.pB = 3250;
		this.paint = 650;
	}
	 	 
	// Parameter constructor
	public Volvo(double s_40,double s_60,double s_70,double s_80,double p_A,double p_B, double p){
		this.s40 = s_40;
		this.s60 = s_60;
		this.s70 = s_70;
		this.s80 = s_80;
		this.pA = p_A;
		this.pB = p_B;
		this.paint = p;	
	}

	// Mutators (Setters)
	public void setS40(double s_40){		 
		this.s40 = s_40;
	}
	public void setS60(double s_60){		 
		this.s60 = s_60;
	}	 
	 
	public void setS70(double s_70){		 
		this.s70 = s_70;
	}
	public void setS80(double s_80){
		this.s80 = s_80;
	}
	public void setPA(double p_A){
		this.pA = p_A;
	}
	public void setPB(double p_B){
		this.pB = p_B;
	}
	public void setPaint(double p){
		this.paint = p;
	}
	 
	// Accessors (Getters)
	public double getS40(){
		return this.s40;
	}
	public double getS60(){
		return this.s60;
	}	 	 
	public double getS70(){
		return this.s70;
	}	 
	public double getS80(){
		return this.s80;
	}	 
	public double getPA(){
		return this.pA;
	}
	public double getPB(){
		return this.pB;
	}
	public double getPaint(){
		return this.paint;
	}

}
