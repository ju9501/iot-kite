package assignment.If;

import java.util.Scanner;

public class IfToSwitch5 {
	public static void main(String[] args) {
		System.out.println("숫자(정수)를 입력하시오:" );
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        
	if(num<0) {
			System.out.println("0 미만");
	}
	else {
	switch((int)num/100) {
	case 0 : System.out.println("0이상 100미만"); break;
	case 1 : System.out.println("100이상 200미만"); break;
	case 2 : System.out.println("200이상 300미만"); break;
	
	default : System.out.println("300 이상"); break;
	}
	}
	}
}


/**
package assignment;

import java.util.Scanner;

public class If2 {
	
	public static void main(String[] args) {
		System.out.println("숫자(정수)를 입력하시오:" );
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        
	if(num<0) {
			System.out.println("0 미만");
	}else if(num>=0 && num<100) 
			System.out.println("0이상 100미만");
	else if(num>=100 && num<200) 
			System.out.println("100이상 200미만");
	else if(num>=200 && num<300) 
			System.out.println("200이상 300미만");
		else {
			System.out.println("300 이상");
		}
	}
}
**/