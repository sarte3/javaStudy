package ch10;

import java.text.DecimalFormat;

//DecimalFormat - 교재 p.540
//숫자의 형식화
public class DecimalFormat01 {

	public static void main(String[] args) {

		double num = 1234567.89;
		
		DecimalFormat df = new DecimalFormat("0");
		System.out.println(df.format(num));

		df = new DecimalFormat("0.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0000000000.00000");
		System.out.println(df.format(num));
		System.out.println();
		
		df = new DecimalFormat("#");
		System.out.println(df.format(num));

		df = new DecimalFormat("#.#");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("##########.#####");
		System.out.println(df.format(num));

		df = new DecimalFormat("###,###.000");
		System.out.println(df.format(num));
		
	}

}
