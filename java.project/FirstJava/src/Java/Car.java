package Java;

//public은 대표클래스에 하나만 들어갈 수 있다.
// 대표 클래스? 파일이름 클래스
public class Car {
int gasolinegauge;

public Car(int gasolinegauge) {
//	super(); // Object()
	this.gasolinegauge = gasolinegauge;
}


}

class HybridCar extends Car {

int electronicGauge;

public HybridCar(int gasolinegauge) {
	super(gasolinegauge); // 상위클래스 생성자 호출
	// TODO Auto-generated constructor stub
}

public HybridCar(int gasolinegauge, int electronicGauge) {
	super(gasolinegauge); // 상위클래스 생성자 호출
	this.electronicGauge = electronicGauge;
}


}

class HybridWaterCar extends HybridCar {
int waterGauge;

	public HybridWaterCar(int gasolinegauge, int electronicGauge, int waterGauge) {
	super(gasolinegauge, electronicGauge);
	this.waterGauge = waterGauge;
}

	
	
	public void showCurrentGauge() {
	System.out.println("잔여 가솔린 :  "+ gasolinegauge);
	System.out.println("잔여 가솔린 :  "+ electronicGauge);
	System.out.println("잔여 가솔린 :  "+ waterGauge);
	}
}