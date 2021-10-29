package ex9no31;

import java.util.regex.*;

public class ex9no31 {  //  505p
	public static void main(String[] args) {
		String[] data = {"bat", "bady", "bonus", "cA", "ca", "co", "c.",
							"c0", "car", "combat", "count", "date", "disc"};
		
		Pattern p = Pattern.compile("c[a-z]*");
		
		for( int i =0; i < data.length ; i++ ) {
			Matcher m = p.matcher(data[i]);
			if(m.matches())
				System.out.print(data[i] + ",");
		}
	}

}
