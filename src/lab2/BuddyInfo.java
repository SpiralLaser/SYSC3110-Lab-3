package lab2;


public class BuddyInfo {
	private String name;
	private String address;
	private int phoneNum;

	public BuddyInfo(String a)
	{
		setName(a);
		
	}
	
	public BuddyInfo(String a, String b)
	{
		setName(a);
		setAddress(b);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}

	public static void main(String[] args) {
		BuddyInfo Bob = new BuddyInfo("Bob");
		// TODO Auto-generated method stub
		System.out.println("Hello " + Bob.getName());
	}

}