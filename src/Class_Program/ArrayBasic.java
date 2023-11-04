package Class_Program;

import java.util.ArrayList;

public class ArrayBasic {
	
	
	public static void main(String[] args) {
		
		Integer i = 0;
		Integer[] j = new Integer[1];
		j[0] = 0;
		
		ArrayList<Integer> arrNew = new ArrayList<Integer>();
		arrNew.add(0);
		

		
		
		ArrayList<UserDetails> arr = new ArrayList<UserDetails>();
		
		UserDetails mUserDetailsEmpty = new UserDetails(i);
		mUserDetailsEmpty.setIndex(98);
		mUserDetailsEmpty.setName("Ammu");
		
		arr.add(mUserDetailsEmpty);

		
		UserDetails mUserDetails = new UserDetails(10, "Ramu");
		arr.add(mUserDetails);
		arr.add(new UserDetails(20, "Guru"));
		arr.add(new UserDetails(30, "Raju"));
		arr.add(new UserDetails(240, "Somu"));
		arr.add(new UserDetails(260, "Ranjith"));
		arr.add(new UserDetails(270, "Ravi"));
		arr.add(new UserDetails(290, "Ram"));
		arr.add(new UserDetails(280, "Raja"));
		arr.add(new UserDetails(2760, "Raju"));
		arr.add(new UserDetails(2540, "Keerthana"));
		arr.add(new UserDetails(250, "etc"));
		
		arr.remove(5);
//		arr.remove(mUserDetails);
		arr.contains(mUserDetails);
		System.out.println(arr.indexOf(mUserDetails));
		
		
		arr.forEach(userDetails -> {
			System.out.println(userDetails.name+" : "+userDetails.index);
		});
		
		
//		/getName();
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		


		
		/*String str2[]= {"one", "two", "three"};
		for(int i=0; i<numbers.length;i++) {
			System.out.print(numbers [i] +" ");
		}
		System.out.println("\nFor each loop");
		for(int num:numbers) {
			System.out.print(num+" ");
		}
System.out.println("\nString Array: ");
for(int i=0;i<str2.length;i++) {
	System.out.print(str2[i]+" ");
}

System.out.println("\nFor each loop string array");
for (String num:str2) {
	System.out.print(num+ " ");
}
	}

}*/