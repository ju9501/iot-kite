package ver01;

public class PhoneBookMain {
	public static void main(String[] args) {
		
		// 데이터 저장 : 인스턴스 생성
		PhoneInfor pi_1 = new PhoneInfor("위은주", "010-3467-6343", "1995-01-19"); // 데이터 저장 목적의 클래스를 만듦(PhoneInfor)
		
		pi_1.showInfo();
		
		PhoneInfor pi_2 = new PhoneInfor("손흥민", "010-0000-0000");
		pi_2.showInfo();
		
		
	}
}
