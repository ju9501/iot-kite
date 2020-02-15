package assignment.operator;

public class Operator1 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
//		= int num1=10, num2=20, num3=30;
		num1=num2=num3;
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
		System.out.println("num3 : "+num3);
		System.out.println("결과: last number = 30 이면 else number = 30");
	}
}
