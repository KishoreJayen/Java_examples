package Access_Modifier;

public class Largest_and_Smallest_Number {

	public static void main(String[] args) {
		 int arr[]= {89,2,65,100,76,18,24};
		    int small= Integer.MAX_VALUE;
		    int large= Integer.MIN_VALUE;
		    for(int i=1; i<arr.length; i++) {
		    	for(int j=i+1; j<arr.length; j++) {
		    		if (arr[i]<small)
		    			small=arr[i];
		    		else if (arr[j]>large)
		    			large= arr[j];
		    	}
		    }
		    System.out.println("The Smallest number is : "+small);
		    System.out.println("The Largest Number is : "+ large);
		}
	
	}


