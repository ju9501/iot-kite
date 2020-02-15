package Java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListTest {

	public static void main(String[] args) {
		
//		ArrayList<Integer> list = new ArrayList<Integer>();
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		// 데이터 추가 : add()
		list.add(new Integer(11));
		list.add(22);
		list.add(33);
		list.add(44);
		list.add(55);
		list.add(66);
		
		// 데이터 참조 : 반복문 for, foreach
		System.out.println("ArrayList의 요소 개수 : "+list.size());
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("------------------------");
		
		for (Integer i : list) { //i는 요소, list는 집합.collection.배열
			System.out.println(i);
		}
		
		// 요소 삭제 : remove(index)
		list.remove(0);
		System.out.println("------------------------");
		
		for (Integer i : list) { //i는 요소, list는 집합.collection.배열
			System.out.println(i);
		}
		
		Iterator<Integer> itr = list.iterator();
		
		// itr.hasNext() // 요소 존재 유무
		// itr.next() : Integer 데이터 반환
		// itr.remove() : 현재 위치의 데이터 삭제 
		
		//33 데이터 삭제
		System.out.println("iterator를 이용한 데이터 참조 및 삭제");
	
		while(itr.hasNext()) {;
			Integer i = itr.next(); //next는 반복문에서 한 번만 유지
			System.out.println(itr.next());
			if(itr.next().equals(33)) {
				itr.remove();
			}
		}
		
		itr = list.descendingIterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
	
}

