package Backjoon;

import java.util.Stack;
import java.util.Scanner;

public class Beakjoon1874 {
	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<>();
		Scanner sc=new Scanner(System.in);
		int pointer=1,N;
		int[] target_arr,arr_num;
		StringBuilder result = new StringBuilder();
		
		N=sc.nextInt();
		
		target_arr=new int[N];
		
		for(int i=0;i<N;i++) {
			target_arr[i]=sc.nextInt();
		}
		
		int k=0;
		
		while(k<N) {
			if(pointer<=target_arr[k]) {
				stack.push(pointer++);
				result.append("+\n");
			}
			else {
				if(!stack.isEmpty()&&stack.peek()==target_arr[k]) {
					stack.pop();
					result.append("-\n");
				}
				else {
					System.out.println("NO");
					return;
				}
			}
		}
		
		System.out.println(result.toString());
	}
}
