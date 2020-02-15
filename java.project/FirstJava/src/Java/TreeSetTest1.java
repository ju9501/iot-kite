package Java;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> sTree = new TreeSet<Integer>();
		
		sTree.add(1);
		sTree.add(2);
		sTree.add(4);
		sTree.add(3);
		sTree.add(2);
		
		System.out.println("저장된 데이터의 개수: " + sTree.size());
	
		Iterator<Integer> itr = sTree.iterator();
		
		while(itr.hasNext()) { //hasNext :다음칸 확인
			System.out.println(itr.next()); //next :투입
		}

		
		
	}

}
