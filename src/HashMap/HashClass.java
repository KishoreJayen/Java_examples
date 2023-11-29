package HashMap;

import java.util.HashMap;

public class HashClass {
	
	static boolean answer = false;
	
	
	public static void main(String[] args) {
		
		
		HashMap<String, String> hash = new HashMap<String, String>();
		
		hash.put("123456", "Ajith");
		hash.put("123457", "Vijay");
		hash.put("123458" , "Simbu");
		hash.put("123459", "Surya");
		
		System.out.println(hash.get("123458"));
		System.out.println(hash.containsKey("123459"));// t r f
		System.out.println(hash.containsValue("Simbu"));
		System.out.println(hash.size());
		
		System.out.println(hash.remove("123457"));	
		
		System.out.println(hash.values()); 
	hash.replace("123459", "Vikram");
	System.out.println(hash.values());
		
	
	String str= "123456";
	
	 
	hash.forEach((key, val) ->{
		if(key.contains(str)  || val.contains(str)) {
		answer  = true;
			
	}	
	});
	System.out.println(str +" contains:: "+ answer);
	

	
	
		System.out.println(hash.keySet());
		System.out.println(hash.entrySet());
		
		System.out.println(hash.clone());
		}
	

}
