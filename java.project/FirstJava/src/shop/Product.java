package shop;

public class Product {
	
	int price;
	int bonusPoint;
	
	public Product(int price) {
		this.price = price;
		this.bonusPoint = (int)(price/10f);
		
	}
	
	public static void main(String[] args) {
		
		Buyer b = new Buyer();
		
		Tv = new Tv(100);
		Product p1 = tv;
		Computer com = new Computer(300);
		Product p2 = com;
		
		b.buy(audio);
		b.buy(tv);
		b.buy(com);
		
		b.summary();
		
		System.out.println("현재 남은 돈 : "b.money);
		System.out.println("현재 보너스 : "b.bonusPoint );
	}

	public String toStrings() {
		// TODO Auto-generated method stub
		return null;
	}

}

class Audio extends Product{




public Audio(int price) {
		super(price);
		// TODO Auto-generated constructor stub
	}

}

	@Override
	public String toString() {
		return "Audio []";

class Tv extends Product {

	public Tv(int price) {
		super(price);
		// TODO Auto-generated constructor stub
	}

	@Override // 어노테이션/Java의 문법은x/자바 실행에 영향을 주지 않지만, 부수적인 의미를 부여해줌
	public String toStrings() {
		return "Tv";
	}
	
}

class Computer extends Product {
	
	public String toSting() {
		return Computer;
	}
}

class Buyer {
	int money =1000;
	int bonusPoint = 0;
	
	// 장바구니 
	Product[] cart = new Product[10];
	// 구매 상품의 개수, 배열에 입력할 때 index 값으로 사용, 반복문 사용시 반복의 조건 
	int cnt = 0;	
	
	
	void buy (Product p) {
		
		if (money<p.price){
			System.out.println("잔액이 부족해서 구매할 수 없습니다.");
			return; //메서드의 종류 
		}
		
		money = money - p.price;
		bonusPoint = bonusPoint+ p.bonusPoint;
		
		// 바구니에 추가
		cart[cnt++] = p;
		// 구매 상품의 개수 1 증가
		// cnt++;
		
	
		
		System.out.println(p+ "을/를 구입하셨습니다.");
	}
	
	void summary() {
		// 구매 상품의 총 금액
		int sum = 0;
		// 구매 제품 리스트 
		String productList = "";
		
		for(int i=0; i<cnt; i++) {
			// 제품 가격을 더한다.
			sum += cart[i].price; //cart는 참조변수의 묶음 
			// 제품리스트 
			productList += cart[i] + ",";
			
		}
		
		System.out.println("구입한 제품의 총 금액: " + sum + "원 입니다.");
		System.out.println("구입한 제품의 목록은 "+ productList + "입니다.");
	}
	
}


