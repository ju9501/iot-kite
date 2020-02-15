package ver05;

public class PhoneUnivInfor extends PhoneInfor {
	
	//주소             address             String	
	//전공             major               String
	//학년             year                String
	
	String address;
	String major;
	String year;
/**	
	public PhoneUnivInfor(String name, String phoneNumber, String email) {
		super(name, phoneNumber, email);
	}
**/
	public PhoneUnivInfor(String name, String phoneNumber, String email, String adress, String major, String year) {
		super(name, phoneNumber, email); // 순서는 반드시 지켜야함(this 위에)
		this.address = address;
		this.major = major;
		this.year = year;
	}

	@Override
	void showBasicInfor() {
		super.showBasicInfor();
		System.out.println("주소 : " + this.address);
		System.out.println("전공 : " + this.major);
		System.out.println("학년 : " + this.year);
	}
	}

	
	
	
	
	
	
	
	
	
	

