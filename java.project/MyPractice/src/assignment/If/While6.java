package assignment.If;

public class While6 {
	public static void main(String[] args) {
		int i = 0; //초기값 설정
		int j = 0;
		while(i<100) //반복조건 설정
		{
			j = i+j;
			i++;
		}
		System.out.println(j); // while 괄호를 벗어나 프린트 -> 결과값만 나옴
		}
	}

	
