package assignment.operator;

public class Operator3 {
	public static void main(String[] args) {
		int n1 = 3;
		int a = 2;
		int b = 1;
		a=++b;
		int result1 = (n1=n1+a*n1);
		System.out.println("3+6 = "+result1);
		
		int result2 = (n1=n1+a*n1+a*n1);
		System.out.println("3+6+9 = "+result2);
		System.out.println("3+6+9+12 = " );
		
		// 반복문 써야하나...?
	}	
}

/**
int a = 3+6;
int b = a+9;
int c = b+12;

System.out.println(a);
System.out.println(b);
System.out.println(c);

// 수정을 용이하고, 보기 쉬운 코딩이 좋은 것

**/