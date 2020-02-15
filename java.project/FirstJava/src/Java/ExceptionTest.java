package Java;

public class ExceptionTest {
	public static void main(String[] args) {
		
		
		int number = 100;
		int result = 0;
		
		for(int i=0; i<10; i++) {
			try {
			result = number/(int)(Math.random()*10);
			System.out.println(result); // 예외 사항일 경우 실행되지 않고 catch 구문으로 넘어감 
			} catch(ArithmeticException ae){
//				System.out.println("0으로 나누기는 할 수 없습니다.");
				
				System.out.println(ae.getMessage());

				i--; // 예외가 발생했으므로 한 번의 연산을 하지 않았다고 판단, 0으로 나눈 경우는 제외 
			} catch(ArrayIndexOutOfBoundsException aie) {
				
			} catch(Exception e) {
				
			}
		}
			
	}
}
