package ch11;

import java.util.HashSet;
import java.util.Iterator;

// *HashSet클래스 - 교재p631

public class HashSet01 {

	public static void main(String[] args) {

		//HashSet set = new HashSet();
		HashSet<String> set = new HashSet<String>();
		
		//객체를 추가
		set.add("홍길동");
		set.add("henry");
		set.add("김구");
		set.add("유재석");
		set.add("강호동");
		set.add("홍길동"); //중복을 허용x
		
		//저장된 객체의 총 수 조회 
		System.out.println("저장된 객체의 총 수 : "+set.size());
		
		//객체 꺼내기(조회) List에서는 Ojbect get(int index);
		//Set에서는 iterator();
		//모든 데이터 꺼내기->추가한 데이터순서가 유지되지 않은 상태로 출력=>순서유지x
		Iterator iter= set.iterator(); //반복자 얻기
		
		while(iter.hasNext()) { //다음 요소(객체)가 존재하는 동안=>객체 수만큼 반복
			Object element= iter.next(); 
			//Object next() : 다음 요소(객체)를 가져와
			//Returns the next element in the iteration.
			//System.out.println(element);
			System.out.println((String)element);
		}
		System.out.println();
		
		//객체를 삭제 .remove(Object o);
		set.remove("김구"); //김구 삭제
		set.remove("강호동"); //강호동 삭제
		
		System.out.println();
		//향상된 for문 이용 - 모든 데이터 꺼내기
		//for(타입 변수: 배열명 또는 컬렉션명){ }
		for(Object obj : set) {
			System.out.println((String)obj);
		}
		
		//모든 객체를 제거하고 비운다
		set.clear();
		
		System.out.println("저장된 객체의 총 수 : "+set.size());
		
		//isEmpty() Returns true if this set contains no elements
		if(set.isEmpty())System.out.println("비어있어요");
		
	}

}
