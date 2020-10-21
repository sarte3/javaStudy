package ch11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//LinkedList
//ArrayList와 LinkedList의 실행 성능 비교
public class LinkedList01 {

	public static void main(String[] args) {

		//실행 시간 = 종료시간 - 시작 시간
		long startTime; //시작시간
		long endTime; //종료시간
		
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();

		//Returns the current value of 
		//the running Java Virtual Machine's high-resolution time source, in nanoseconds.  
		startTime = System.nanoTime(); //시작 시간 담기
		
		//작업
		for(int i=0;i<10000;i++) {
			//특정 인덱스의 객체를 추가하면 해당 인덱스부터 마지막 인덱스까지 1씩 밀려난다.
			//add(int index, Object value)
			//String 클래스의 valueOf(Object) : object값을 String으로 변환하는 함수
			list1.add(0,String.valueOf(i));
			//list1.add(0,"0");
			//list1.add(0,"1");
			//list1.add(0,"2");...
		}
		
		//종료시간 담기
		endTime = System.nanoTime();
		
		System.out.println("ArrayList 실행시간 = "+(endTime-startTime));
		System.out.println("---------------------------------");
		startTime = System.nanoTime(); //시작 시간 담기
		
		//작업
		for(int i=0;i<10000;i++) {
			//add(int index, Object value)
			//String 클래스의 valueOf(Object) : object값을 String으로 변환하는 함수
			list2.add(0,String.valueOf(i));
			//list1.add(0,"0");
			//list1.add(0,"1");
			//list1.add(0,"2");...
		}
		
		
		//종료시간 담기
		endTime = System.nanoTime();
		
		System.out.println("LinkedList 실행시간 = "+(endTime-startTime));
		
	}

}
