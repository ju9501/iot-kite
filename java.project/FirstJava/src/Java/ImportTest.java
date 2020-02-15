package Java;

import java.text.SimpleDateFormat;

public class ImportTest {
	
	public static void main(String[] args) {
		
		java.util.Date today = new java.util.Date();
		
		System.out.println(today);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd"); //대문자 DD는 365일 중 xxx으로 표현됨.
		// ctrl+space -> import java.text.SimpleDateFormat; 자동생성
		
		String todayStr = sdf.format(today); 
		
		System.out.println(todayStr);
		
	}

}
