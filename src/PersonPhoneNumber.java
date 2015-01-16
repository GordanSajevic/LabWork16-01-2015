
public class PersonPhoneNumber {
	
	private String name;
	private int mobile;
	private int home;
	private int bussiness;
	private boolean hasMob;
	private boolean hasHome;
	private boolean hasBus;
	
	public PersonPhoneNumber(String name, int mobile) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.hasMob = true;
	}
	
	public PersonPhoneNumber(String name, int mobile, int home) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.hasMob = true;
		this.hasHome = true;
	}
	
	public PersonPhoneNumber(String name, int mobile, int home, int bussiness) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.home = home;
		this.bussiness = bussiness;
		this.hasMob = true;
		this.hasHome = true;
		this.hasBus = true;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public int getHome() {
		return home;
	}

	public void setHome(int home) {
		this.hasHome = true;
		this.home = home;
	}

	public int getBussiness() {
		this.hasBus = true;
		return bussiness;
	}

	public void setBussiness(int bussiness) {
		this.bussiness = bussiness;
	}

	public boolean getHasHome()
	{
		return hasHome;
	}
	
	public boolean getHasBus()
	{
		return hasBus;
	}
	

}
