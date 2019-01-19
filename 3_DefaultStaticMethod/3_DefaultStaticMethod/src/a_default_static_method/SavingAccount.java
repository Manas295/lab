package a_default_static_method;

public class SavingAccount extends AccountClass implements AccountInterface  {

	private String name;
	private int bal;


	public SavingAccount(String name, int bal) {
		this.name = name;
		this.bal = bal;
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int getBal() {
		return bal;
	}
	@Override
	public void setBal(int bal) {
		this.bal = bal;
	}
	 

	
	
	
	
	//can override default method of interface
 	/*@Override
	public String getAccountInfoDefault()
	{ 
		return "SavingAccount  -"+getName()+" , "+getBal();
	}*/
	 
	
	
	
	// can't Override static method of interface
	/*@Override
	static String getAccountInfoStatic(AccountInterface p)
	{
		return " Saving Account : Static() : "+p.getName()+" , "+p.getBal();
	}*/ 
	
		
}
