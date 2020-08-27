package EmailApp;

public class Email {
	private String firstName;
	private String lastName;
	private String mailId;
	private int defaultPasswordLength =8;
	private String defaultPassword;
	public String companyName;
	public Email() {}

	public Email(String firstName, String lastName, String CompanyName) throws InterruptedException {

		this.firstName = firstName;
		this.lastName = lastName;
		this.mailId = defaultMailID();
		//Constructor for default password
		this.defaultPassword = defaultPass(defaultPasswordLength);
		this.companyName = CompanyName;

		//Construct mail ID
		this.mailId = defaultMailID();
		
		//Change Password
		//this.password = changePassword();
	}
	
	public String defaultPass(int defaultPasswordLength) {
		String generate = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#$&abcdefghijklmnopqrstuvwxyz";
		char[] getPassword = new char[defaultPasswordLength];
		for(int i=0;i<defaultPasswordLength;i++)
		{
			getPassword[i] = generate.charAt((int) (Math.random()*generate.length()));
		}
		return new String(getPassword);
	}
	public String defaultMailID() {
		return this.firstName+"."+this.lastName+(int)(Math.random()*20)+"@"+this.companyName+".com";
	}
	public String[] showInfo()
	{
		String ret[] = new String[2];
		ret[0]=this.mailId;
		ret[1]=this.defaultPassword;
		
		return ret;
	//	System.out.println("Email ID :"+this.mailId);
		//System.out.println("Default Password :"+this.defaultPassword);
	}
	//public String changePassword()
}
