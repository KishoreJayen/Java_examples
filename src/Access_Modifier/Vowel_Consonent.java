package Access_Modifier;

import java.util.Scanner;

public class Vowel_Consonent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		int digit=0,letter=0,vowel=0,consonent=0, special=0;
		String str=s.next();
		char ch []= str.toCharArray();
		for(int i=0; i<ch.length; i++) {
			if(Character.isLetter(ch [i]))	
				letter++;
			if(ch[i]=='a'|| ch[i]=='e'|| ch[i]=='i' || ch[i]=='o' || ch[i]=='u'||ch[i]=='A' ||ch[i]=='E'|| ch[i]=='I'||
					ch[i]=='O'|| ch[i]=='U') {
				vowel++;
			}
			else {
				consonent++;
			}	
		 if(Character.isDigit(ch [i]))
				digit++;
			else {
				special++;
			}
			

		}
		System.out.println("Alphabets: "+letter);
		System.out.println("Numbers: "+digit);
		System.out.println("Vowels: "+vowel);
		System.out.println("Consonent: "+consonent);
		System.out.println("Special: "+special);


	}

}
