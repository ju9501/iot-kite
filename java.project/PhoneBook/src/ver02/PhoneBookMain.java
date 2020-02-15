package ver02;

import java.util.Scanner;

import ver01.PhoneInfor;

public class PhoneBookMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			
		System.out.println("---------------------------------");
		System.out.println("이름을 입력해주세요.");		
		String name = sc.nextLine();
		System.out.println("전화번호를 입력해주세요");
		String pNum = sc.nextLine();
		System.out.println("생일을 입력해주세요.");
		String bDay = sc.nextLine();
		
		// 사용자가 입력한 생일 데이터 비교 : 공배 여부
		// " 123 ".trim() -> "123"
//		System.out.println("문자열의 개수 : "+bDay.trim().length());  // "   " -> ""
		
		if(bDay != null && bDay.trim().length()>0) {
			new PhoneInfor(name, pNum, bDay).showInfo();; // 참조변수 반환.메서드 호출 
		}else {
			new PhoneInfor(name, pNum).showInfo();;
		}
		
			
//		new PhoneInfor(name, phoneNumber, birthday);
//		new PhoneInfor(name, phoneNumber);
		
//		System.out.println("이름: "+ name + " 전화번호: "+ pNum + " 생일: "+bDay);
		}

	}
}
