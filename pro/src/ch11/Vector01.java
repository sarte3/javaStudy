package ch11;

import java.util.Vector;

//Vector
public class Vector01 {

	public static void main(String[] args) {
		
		//초기 배열은 사이즈가 10
		Vector vt= new Vector();
				
		System.out.println("벡터의 capacity()="+vt.capacity());
		System.out.println("벡터의 size()="+vt.size());
		System.out.println();
				
		//객체를 삽입
		for(int i=1;i<26;i++) {
			vt.add("제목"+i); //25개의 객체가 삽입되면서
			//초기 capacity 10 -> 제목1,...제목10 -> size 10
			//초기 capacity을 채우고 2배로 증가되어서 capacity 20
			//capacity 20을 채우고 2배로 증가되어서 capacity 40
					
		}
	
		System.out.println("--------------------------------");
	
		
		//capacity가 채워지면 2배씩 증가
		//Vector(int initialCapacity);
//		Vector vt1= new Vector(20);
		//Vector(int initialCapacity, int capacityIncrement)
		//시작 capacity가 채워지면 int 씩 증가
		Vector vt1=new Vector(20,2);
		
		System.out.println("벡터의 capacity()="+vt1.capacity());
		System.out.println("벡터의 size()="+vt1.size());
		System.out.println();
		
		//객체를 삽입
		for(int i=1;i<32;i++) {
			vt1.add("내용"+i); //31개의 객체가 삽입, capacity는 크기의 2배씩 늘어남
		}
		
		System.out.println("벡터의 capacity()="+vt1.capacity()); 
		System.out.println("벡터의 size()="+vt1.size()); 
		System.out.println();
		
		//데이터 가져오기
		for(int i=0;i<vt1.size();i++) {
			Object obj = vt1.get(i);
			System.out.println(obj);
		}
		
	}

}
