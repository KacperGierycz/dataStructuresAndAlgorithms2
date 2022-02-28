package codility;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayRotation {
	// you can also use imports, for example:
	// import java.util.*;

	// you can write to stdout for debugging purposes, e.g.
	// System.out.println("this is a debug message");



	static class Solution {
	    public int[] solution(int[] A, int K) {
	        
	        
	        Deque<Integer> deq=new ArrayDeque<Integer>();

	    for(int k:A){
	        deq.addLast(k);
	    }

	for(int i=0;i<K;i++){
	    int last=deq.pollLast();
	    deq.addFirst(last);

	}
	int[] B=new int[A.length];
	int j=0;
	for(int i:deq){
	B[j]=i;
	j++;
	}


	return B;
	    }
	
	
	public static void main(String[] args)
	{
		Solution s=new Solution();
		s.solution(null, 0);
	}

}
}
