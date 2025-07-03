package Backjoon;

import java.util.Scanner;

public class BaekJoon12891 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int S=sc.nextInt();
		int P=sc.nextInt();
		sc.nextLine();
		
		int Start=0,End=P;
		int A=0,C=0,T=0,G=0;
		int count=0;
		
		String str = sc.nextLine();
		char[] arr = str.toCharArray();
		
		int[] limit=new int[4];
		
		
		for(int i=0;i<4;i++) {
			limit[i]=sc.nextInt();
		}
		
		for(int i=0;i<P;i++) {
			if(arr[i]=='A')
				A=A+1;
			else if(arr[i]=='C')
				C=C+1;
			else if(arr[i]=='T')
				T=T+1;
			else
				G=G+1;
		}
		if(limit[0]<=A&&limit[1]<=C&&limit[2]<=G&&limit[3]<=T)
			count=count+1;
		
		for(int i=P;i<S;i++) {
			if(arr[i]=='A')
				A=A+1;
			else if(arr[i]=='C')
				C=C+1;
			else if(arr[i]=='T')
				T=T+1;
			else
				G=G+1;
			
			if(arr[i-P]=='A')
				A=A-1;
			else if(arr[i-P]=='C')
				C=C-1;
			else if(arr[i-P]=='T')
				T=T-1;
			else
				G=G-1;
			if(limit[0]<=A&&limit[1]<=C&&limit[2]<=G&&limit[3]<=T)
				count=count+1;
		}
		System.out.println(count);
	}
}
