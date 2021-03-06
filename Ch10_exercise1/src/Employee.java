/**
 * Design	a	class	named	Employee. The class should keep the following information
 *  in fields: 
 *  �	Employee name 
 *  �	Employee number	in	the	format	XXX�L,	where	each	X	is	a	digit	within	the	range	0�9	and	the	L	is	a	letter	within	the	range	A�M. 
 *  �	Hire	date Write one or more constructors and the appropriate accessor and mutator methods for the class. 
 * @author Hanna
 *
 */
public class Employee {
	//private String name;
	protected String name;
	private String empNum;
	private int hireDate;
	
	public Employee(){
		name="Hanna Lee";
		empNum="000-L";
		hireDate=0;
	}

	public Employee(String n, String en, int h){
		name = n;
		setEmpNum(en);
		hireDate = h;
	}
	public String getName(){
		return name;
	}
	
	public String getEmpNum(){
		return empNum;
	}
	
	public int getHireDate(){
		return hireDate;
	}
	
	public void setName(String n){
		name=n;
	}
	public void setEmpNum(String en){
		boolean valid = true;
		if(en.length() == 5){
			for(int i = 0; i < 3; i++)
				if(!Character.isDigit(en.charAt(i)))
			    	valid=false;
				if(!(en.charAt(3)=='-'))
					valid=false;
				if(!(Character.toUpperCase(en.charAt(4))>='A'&& Character.toUpperCase(en.charAt(4))<='M'))
					valid=false;
		}
		else
			valid=false;
		if(valid)
			empNum=en;
		else{
			empNum="000-J";
			System.out.println("Wrong format");
			}
	}
	public void setHireDate(int h){
		hireDate = h;
	}
	public String toString(){
		return "**Employee Information**\nName: "+name+"\n#"+empNum+"\nYear: "+hireDate+"\n";
	}

	
}
