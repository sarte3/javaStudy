package ch11;

import java.util.TreeSet;

//TreeSet
public class TreeSet01 {

	public static void main(String[] args) {

		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		ts.add(new Integer(10));
		ts.add(new Integer(33));
		ts.add(new Integer(100));
		ts.add(new Integer(99));
		ts.add(new Integer(5));
		
		System.out.println("가장 낮은 점수 ="+ts.first());
		System.out.println("가장 높은 점수="+ts.last());
		
		Integer num = null;
		
		num = ts.lower(new Integer(20));
		System.out.println("20보다 아래인 점수 = "+num);
		
		num = ts.higher(new Integer(90));
		System.out.println("90보다 위인 점수 = "+num);
		
		num = ts.floor(new Integer(99));
		System.out.println("99와 동일하거나 바로 아래 점수 = "+num);
		
		num = ts.ceiling(new Integer(98));
		System.out.println("98과 동일하거나 바로 위 점수 = "+num);
		
		while(!ts.isEmpty()) {
			num = ts.pollFirst(); //가장 낮은 수를 꺼낸 다음 제거
			System.out.println(num+"\t(남은 객체 수"+ts.size()+")");
		}
		
	}

}
