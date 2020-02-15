package ver01;

public class PhoneInfor {
	
//	• 이름            name             String
//	• 전화번호       phoneNumber   	 String
//	• 생년월일       birthday         String 
	
	public String name;
	public String phoneNumber;		// 010-3467-6343
	public String birthday;		// 2019-11-12
	
	// 데이터 초기화 
	public PhoneInfor(String name, String phoneNumber, String birthday){
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
	}
	
	public PhoneInfor(String name, String phoneNumber){ //생성자도 오버로딩 할 수 있다. 
		this(name, phoneNumber, null); // this : 다른 생성자 호출(오버로딩), null : 참조변수, null과 if~else문 대신 ""
		
		
	}
	
	// 데이터 출력하는 메서드 
	public PhoneInfor showInfo() {
		System.out.println("이름: " + name);
		System.out.println("전화번호: " + phoneNumber);
		
		if(birthday == null) {
			System.out.println("생일: 입력된 데이터가 없습니다.");
		}else {
			System.out.println("생일: " +birthday);
		}
		return null;
		

		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
