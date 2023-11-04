package Class_Program;

import java.util.Scanner;

public class Switch_Case {
public static void main(String[] args) {
		System.out.print("Enter the Word: ");
		Scanner s =new Scanner (System.in);
		char ch = s.next().charAt(0);
		switch(ch) {
		case 'a': //case 'z'
		case 'A':
		case 'e':
		case 'E':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
		System.out.println("It is a Vowel");
		break;
		default:
			System.out.println("\"Not a Vowel\"");
		
		
			s.close();
		}
		

	}

}
