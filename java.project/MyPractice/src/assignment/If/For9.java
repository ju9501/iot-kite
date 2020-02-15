package assignment.If;

public class For9 {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				j=i*j;
				j++;
				System.out.println(j);
			}
			i++;
		}
	}
}
//// 결과값 이상. 다시 코딩


/**
int i = 0; //초기값 설정
int j = 0;
while(i<100) //반복조건 설정
{
	j = i+j;
	i++;
}
System.out.println(j); // while 괄호를 벗어나 프린트 -> 결과값만 나옴
**/