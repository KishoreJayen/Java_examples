package Class_Object;

import java.util.ArrayList;
import java.util.List;

import Class_Object.PairSum.Pair;

public class PairSum {
	public static int sumSecondElements(List<Pair<Integer,Integer>> list) {
		int sum=0;
		for(Pair<Integer, Integer > pair :list) {
			sum+= pair.second;
		}
		return sum;
	}

	public static void main(String[] args) {
		List<Pair<Integer, Integer>> arr = new ArrayList<Pair<Integer, Integer >>();
		
		arr.add(new Pair<Integer, Integer> (1,2));
		arr.add(new Pair<Integer, Integer> (3,4));
		arr.add(new Pair<Integer, Integer> (5,6));
		arr.add(new Pair<Integer, Integer> (7,8));
		arr.add(new Pair<Integer, Integer> (9,10));
		System.out.println(sumSecondElements (arr));	
	}
	
	public static class Pair<F, S>{
		F first;
		S second;
		
		public Pair (F first, S second) {
			
			this.first = first;
			this.second = second;
		}
	}
}
	
	
