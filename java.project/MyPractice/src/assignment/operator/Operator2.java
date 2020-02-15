package assignment.operator;

public class Operator2 {
	public static void main(String[] args) {
		int n1 = 5;
		int n2 = 4;
		int result1 = (5*n1*n1)+(9*n2-n2)-18*n2;
		int result2 = result1/n1;
		System.out.println("{{(25x5)+(36-4)}-72}/5의 연산결과");
		System.out.println(": " +result2);
	}	
}
