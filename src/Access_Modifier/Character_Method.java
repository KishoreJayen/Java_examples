package Access_Modifier;

import java.util.Scanner;

public class Character_Method {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int digit=0,letter=0;
		String str=s.next();
		char ch []= str.toCharArray();
		for(int i=0; i<ch.length; i++) {
			if(Character.isLetter(ch [i]))	
				letter++;
			if(Character.isDigit(ch [i]))
				digit++;
			

		}
		System.out.println("Alphabets: "+letter);
		System.out.println("Numbers: "+digit);

	}

}
