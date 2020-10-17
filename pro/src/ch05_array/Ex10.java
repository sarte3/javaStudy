package ch05_array;

import java.util.Arrays;

//5명 학생의 최고점수와 최저점수를 출력하세요.

public class Ex10 {

	public static void main(String[] args) {
		
		  int[] score= {20,90,10,88,99}; int max=0; int min=0;
		  /*
		  for(int i=0;i<score.length;i++) {
		  
		  if(max<score[i]) { max=score[i]; }
		  
		  } System.out.println("최고 점수 : "+max);
		  
		  for(int i=0;i<score.length;i++) {
		  
		  if(min==0) { min=score[i]; continue; } if(min>score[i]) { min=score[i]; } }
		  System.out.println("최저 점수 : "+min);
		 */
		
		for(int i=0;i<score.length-1;i++) {
			for(int j=i+1;j<score.length;j++) {
				if(score[i]>score[j]) {
					int temp = score[i];
					score[i] = score[j];
					score[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(score));
		System.out.println("최고점수 : "+score[score.length-1]);
		System.out.println("최저점수 : "+score[0]);
	}

}
