package oops;
	class person
{
		private String name;
		private int accountnumber;
		
		public void setname (String name)
		{
			this.name=name;
			
		}
		public void setaccountnumber(int accountnumber)
		{
			this.accountnumber=accountnumber;
		}
		public String getname()
		{
			return name;
			
		}
		public int getaccountnumber()
		{
			return accountnumber;
		}
		
}
	
	public class encapsulation 
	{
	       
		public static void main(String[] args) 
		{
	        person p=new person();
	        p.setname("vishnu");
	        p.setaccountnumber(123456789);
	        System.out.println(p.getname());
	        System.out.println(p.getaccountnumber());
	       
	       
		}
	
	}
