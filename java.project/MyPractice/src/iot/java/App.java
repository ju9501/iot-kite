package iot.java;

public class App {
	public static void main(String[] args) {
		int score;
		score = 10 + 20;
		String cmd = "exit";
		
	}
	
/**	public static void main(String[] args) {
		// ǥ���� : expression : �����ڰ� ���� �ϳ��� ����
		int score;
		score = 10 + 20;
		// ���()
		if(score < 10) // ���ǽ� == boolean
		{// ����: ���� statement
			System.out.println(score);
		}
		if(score > 10) // ���ǽ� == boolean
		{
			System.out.println(score);
		} //�ǹ̸� ������ ������ �ɰ�
		else {
			//score >= 10
		}	
	}
**/
	
	
/**	public static void main(String[] args) {
		// ���� ���� : �б�, �ݺ�(�б� ����)
		int score; // ���� ���� ���� ������� �ʾҴ�...
		score = 10;
		System.out.println(score+10); //������ ��� ���
		int total = score + 10;
		System.out.println(total+10);
	// ��� ������ �ݵ�� �ڷ����� ��ġ���Ѿ� �Ѵ�...
	// ����ȯ : �ڷ��� ��ȯ	
	}
**/	
	
	
/**	public static void main(String[] args) {
		// �ϳ��� �����̸� ����� �����̴�.
		// �� �� ���� �� ����� ���̴�.
		System.out.println(true && false); // AND ����
		// �ϳ��� ���̸� ����� ���̴�.
		// �� �� ������ �� ����� �����̴�.
		System.out.println(true || false); // OR ����
	}
**/


/**	public static void main(String[] args) {
		//������ : ���, ����(��Һ�), ������, ��Ʈ����
		//���
		//����, ���� - offset, ����
		System.out.println(10 > 20); // �̸� T F
		System.out.println(10 >= 20); // �̸� T F
		System.out.println(10 < 20); // �̸� T F
		System.out.println(10 <= 20); // �̸� T F
		
		// equals
		System.out.println(10==20); // �̸� T F
		System.out.println(3+7==10); // �̸� T F
		System.out.println(3==20-17); // �̸� T F
		System.out.println(10!=20); // �̸� T F
	}
**/


/**	public static void main(String[] args) {
		//������ : ���, ����(��Һ�), ������, ��Ʈ����
		//���
		//����, ���� - offset, ���� 
		System.out.println(10 + 5);
		System.out.println("abc"+"efg");
		System.out.println(10 - 5);
		System.out.println(10 * 5);
		System.out.println(10 / 5);
		System.out.println(10 % 5);
//		System.out.println(10**5); �ڹٴ� �������� ����
	}
**/	
	
	
/**	public static void main(String[] args) {
		// ���� ���� : {�ڷ���} {������};
		byte ascii; // 1~255byte
		short score; // 2byte 16bits
		int number; // 4byte
		long in;
		double lf; // �Ǽ���, �ε��Ҽ�
		char unicode; // 2byte
		boolean state = true ; //false
	}
**/	
	
	
/**	public static void main(String[] args) {
		// �� �ڷ����� ���� ������ �� �ֵ��� 
		System.out.println(100);
		int bak = 100;
		System.out.println(bak);
	// �Լ��� ������ �����ϴ� type�� �ٸ���.	
	}
**/
	
}
