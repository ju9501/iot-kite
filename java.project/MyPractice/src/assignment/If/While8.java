package assignment.If;

public class While8 {
	public static void main(String[] args) {
	int count = 1; //num1의 초기값을 1이상 14이하인 어느 정수든 설정해도 상관없음
	int sum = 0;
	System.out.println("<1000 이하의 자연수 중에서 2의 배수 이면서 7의 배수인 숫자> ");
	
	while(count <= 1000) {
		if(count%14==0) {
			System.out.println(count);
			sum = count+sum; // 코딩 위치 의문...
		}
		count++; // if 괄호 밖에, while 괄호 안에 ++
	}
			System.out.print("<출력된 정수들의 합:" +sum );
			System.out.print(">");
	}
}

/**
int i = 0; //초기값 설정
int j = 0;
while(i<100) //반복조건 설정
{
	j = i+j;
	i++;
}
System.out.println(j);
**/