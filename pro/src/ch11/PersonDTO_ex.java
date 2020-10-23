package ch11;

import java.util.Iterator;
import java.util.TreeSet;

//TreeSet이용

/*실행결과
 * PersonDTO [name=김길동, age=1]
PersonDTO [name=김구, age=30]
PersonDTO [name=김십, age=40]
PersonDTO [name=이순신, age=52]
PersonDTO [name=홍길동, age=100]
 * 
 */

//PersonDTO에서 재정의된 compareTo() 메서드를 이용하여
//나이 순으로 정렬하는 클래스
//사용자 정의 객체를 나이순으로 정렬
public class PersonDTO_ex {

	public static void main(String[] args) {

		//TreeSet 준비
		TreeSet<PersonDTO> ts=new TreeSet<PersonDTO>();
		
		//PersonDTO객체 추가
		//저장될 때 나이순으로 오름차순 정렬됨
		ts.add(new PersonDTO("홍길동",100));
		ts.add(new PersonDTO("김길동",1));
		ts.add(new PersonDTO("이순신",52));
		ts.add(new PersonDTO("김구",30));
		ts.add(new PersonDTO("김십",40));
		
		//왼쪽 마지막 노드에서 오른쪽 마지막 노드까지 반복해서 가져온다
		//참고 - 이진 검색 트리
		Iterator<PersonDTO> iter = ts.iterator();
		
		while(iter.hasNext()) {
			
			PersonDTO person = iter.next();
			//System.out.println(person); 라고 쓰면
			//오버라이딩된 person.toString()을 호출
			System.out.println(person.toString());
			
			
		}
		
	}

}
