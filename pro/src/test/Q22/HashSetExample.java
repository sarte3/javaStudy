package test.Q22;

import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		
		Set<StudentDTO> students=new HashSet<StudentDTO>();
		
		students.add(new StudentDTO(1,"hong"));
		students.add(new StudentDTO(2,"shin"));
		students.add(new StudentDTO(1,"lee"));
		
		System.out.println(students.size());
		
		Iterator<StudentDTO> iter=students.iterator();
		
		while(iter.hasNext()) {
			StudentDTO sDTO=iter.next();
			System.out.println(sDTO.getSno()+"\t"+sDTO.getName());
		}
	}
	
}
