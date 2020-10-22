package ch11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap01 {

	public static void main(String[] args) {

		//Map 생성
		Map<String, Integer> map= new HashMap<String, Integer>();
		
		//객체 저장
		map.put("hong", 10);
		map.put("gil", 50);
		map.put("dong", 100);
		map.put("hong1", 100); //value는 중복 허용하므로 객체 저장
		map.put("hong", 1234); //key는 중복허용x 덮어쓰기o
		
		System.out.println("총 객체 수 = "+map.size());
		
		//특정 객체 찾기 : Object get(Object key)
		Integer x= map.get("hong");
		System.out.println("Integer x = "+x);
		//Integer 클래스의 주소가 담긴 참조변수
		System.out.println(x.MAX_VALUE);
		
		//기본 타입 값
		//map.get("hong")하면 여기에서는 Integer로 리턴받지만
		//int 타입의 변수에 저장할 수 있는 이유는
		//auto unboxing이 되기 때문이다
		int y = map.get("hong");
		System.out.println("int y = "+y);
		
		//Map에 저장된 모든 객체 찾기
		//value를 가져오기 위해서는 먼저 key를 알아야 한다
		//keySet() : 모든 키를 Set컬렉션으로 받을 수 있다
		//keySet()을 이용해서 Set컬렉션으로 받고
		Set<String> keys = map.keySet();
				
		//Set컬렉션에서 제공되는 반복자를 통해 모든 key를 얻은 다음
		Iterator<String> iter=keys.iterator();
		
		//받은 개별 key를 이용해서 get()을 통해 값을 얻는다
		while(iter.hasNext()) {
			
			String key = iter.next();
			Integer value = map.get(key);
			
			System.out.println(key+" : "+value);
		}
		
		//특정 객체 제거 remove(Object key)
		map.remove("hong");
		System.out.println("특정 객체 제거 후의 총 객체 수 = "+map.size());
		
		//전체 객체 출력
		//Set<Entry<String, Integer>> java.util.Map.entrySet()
		//Set entrySet();
		//entrySet()을 통해 Set컬렉션을 얻은 다음
		Set<Entry<String, Integer>> set= map.entrySet();
		
		//반복자를 통해 Map.Entry를 하나씩 얻고
		Iterator<Entry<String, Integer>> iter1= set.iterator();
		
		//getKey()를 통해 key를
		//getValue()를 통해 value를 얻기
		while(iter1.hasNext()) {
			
			Entry<String, Integer> entry= iter1.next();
			String key=entry.getKey();
			Integer value=entry.getValue();
			
			System.out.println(key+" : "+value);
		}
		
		
	}

}
