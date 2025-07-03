package Backjoon;

import java.util.*;
import java.io.*;

public class Backjoon10986 {
	public static void main(String[] args) throws IOException {
		int N,M;
		long count=0;
		long[] arr;
		long[] Mod_num;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] firstLine = br.readLine().split(" ");
		N = Integer.parseInt(firstLine[0]);
		M = Integer.parseInt(firstLine[1]);
		
		String[] tokens = br.readLine().split(" ");
	
		arr=new long[N];
		Mod_num=new long[M];
		
		arr[0] = Integer.parseInt(tokens[0]);
		for(int i=1;i<tokens.length;i++) {
			arr[i]=arr[i-1]+Integer.parseInt(tokens[i]);
		}
		
		for(int i=0;i<N;i++) {
			int reminder =(int)(arr[i]%M);
			if(reminder==0) count++;
			Mod_num[reminder]++;
		}
		
		for(int i=0;i<M;i++) {
			if(Mod_num[i]>1) {
				count=count+(Mod_num[i]*(Mod_num[i]-1))/2;
			}
		}
		System.out.println(count);
	}
}
