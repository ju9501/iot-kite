package assignment.If;

public class WhileToFor11 {
	public static void main(String[] args) {
		int count = 0;
		for(int num=1; num<100; num++) { // 같은 출력이 나오기 위해서 while문과 초기값과 조건식이 다름
			if(num%5!=0 || num%7!=0) // =num%5=0 && num%7=0
				continue;
			count++;
			System.out.println(num);
			} // continue에서 바로 옴
		System.out.println("count: " + count);
		}
	}


/**
class ContinueBasic {
public static void main(String[] args) {
int num=0;
int count=0;
while((num++)<100){
if(num%5!=0 || num%7!=0)
continue;
count++;
System.out.println(num);
}
System.out.println("count: " + count);
}
}
**/
