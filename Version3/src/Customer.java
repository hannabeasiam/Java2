import java.util.Random;
public class Customer extends Volvo{
	
	private String name,address,pNumber;
	private String account;
	 
	// Default constructor
	public Customer(){
		super();
		this.name = "John Doe";
		this.address = "Davie";
		this.pNumber = "801-456-6405";
		this.account = createAccount();
	}
	
	
	 	 
	// accountrameter constructor
	public Customer(double s_40,double s_60,double s_70,double s_80,double p_A,double p_B, double p,String n,String aD,String pN){
		
		super(s_40, s_60, s_70, s_80, p_A, p_B, p);
		this.name = n;
		this.address = aD;
		this.pNumber = pN;
		this.account = createAccount();
	}

	// Mutators (Setters)
	public void setName(String n){		 
		this.name = n;
	}
	public void setAddress(String aD){		 
		this.address = aD;
	}	 
	 
	public void setPNumber(String pN){		 
		this.pNumber = pN;
	}

	private String createAccount(){
		Random randomNum = new Random();
		int randomInt = randomNum.nextInt(9999);
		String rNum = String.format("%04d", randomInt);
		//String idNum = Character.toString(this.firstName.toUpperCase().charAt(0))
		//		+Character.toString(this.lastName.toUpperCase().charAt(0))+"-"+rNum;
		return rNum;
	}	

	// Accessors (Getters)
	public String getName(){
		return this.name;
	}
	public String getAddress(){
		return this.address;
	}	 	 
	public String getPNumber(){
		return this.pNumber;
	}
	public String getAccount(){
		return this.account = createAccount();
	}
	

}
