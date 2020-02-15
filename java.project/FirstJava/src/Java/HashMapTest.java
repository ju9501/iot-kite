package Java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeMap;

public class HashMapTest {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		// 저장 : put
		map.put(new Integer(1), "Scott");
	 	map.put(2, "Lee");
		map.put(8, "King");
		
		
		//참조 : get
		System.out.println("1번 : " + map.get(new Integer(1)));
		System.out.println("2번 : " + map.get(2));
		System.out.println("8번 : " + map.get(8));
		
		//삭제 : remove(key)
		map.remove(2);
		
//		System.out.println("2번 : " + map.get(2).length()); //예외처리
		System.out.println("2번 : " + map.get(2));
		
		
		System.out.println("===============================");
		System.out.println("===============================");

		
		
		TreeMap<Integer, String> tMap = new TreeMap<Integer, String>();
		map.put(new Integer(1), "Scott");
		map.put(2, "Lee");
		map.put(8, "King");
		map.put(4, "Kim");

		NavigableSet<Integer> navi = tMap.navigableKeySet();
		
		Iterator<Integer> itr = navi.iterator();
		
		while(itr.hasNext()){
			//itr.next(); // map의 key값
			System.out.println(tMap.get(itr.next()));
		}
			
		System.out.println("내림차순으로 변경");

		itr = navi.descendingIterator();

				while(itr.hasNext()){
					//itr.next(); // map의 key값
					System.out.println(tMap.get(itr.next()));
				}
		
		
	}
}
