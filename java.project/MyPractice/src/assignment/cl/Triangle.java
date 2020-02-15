package assignment.cl;

public class Triangle {
	// Triangle = 클래스 이름
	
	// 밑변과 높이 정보 = 변수
	float width;	// 밑변
	float height;	// 높이

	// 밑변과 높이 정보를 변경 시킬 수 있는 메서드 
	void changeData(float width, float height) {
		this.width = width; //this-자신을 가리키는 인스턴스
		this.height = height;
	}
	
	// 삼각형의 넓이를 계산해서 반환하는 메서드
	// 밑변 곱하기 높이 나누기 2
	float area() {
/**		float result = 0.0f;
		result = width*height/2; //연산할 때는 붙여쓸 것
		return result;
**/
		return width*height/2;
	}
	
	public static void main(String[] args) {
		
		Triangle t = new Triangle(); // 클래스의 인스턴스 생성
		
		System.out.println("높이: " + t.height + ", 밑변 : " + t.width);
		
		t.changeData(3,5); // 메서드의 값을 활용 
		System.out.println("데이터 설정 =================================");
		System.out.println("높이: " + t.height + ", 밑변 : " + t.width);
		System.out.println("\n \"삼각형의 넓이\" : " +t.area());
		
	}
	

}