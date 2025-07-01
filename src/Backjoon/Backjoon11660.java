package Backjoon;

import java.util.Scanner;

public class Backjoon11660 {
	public static void main(String[] args) {
		int N,M,x1,y1,x2,y2;
		int[][] arr,sum_arr;
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		M=sc.nextInt();
		
		arr=new int[N][N];
		sum_arr=new int[N+1][N+1];
		for(int i=0;i<N;i++)
			for(int j=0;j<N;j++) {
				arr[i][j]=sc.nextInt();
				sum_arr[i+1][j+1]=arr[i][j]+sum_arr[i][j+1]+sum_arr[i+1][j]-sum_arr[i][j];
			}
		
		for(int k=0;k<M;k++) {
			x1=sc.nextInt();
			y1=sc.nextInt();
			x2=sc.nextInt();
			y2=sc.nextInt();
			
			System.out.println(sum_arr[x2][y2]-sum_arr[x1-1][y2]-sum_arr[x2][y1-1]+sum_arr[x1-1][y1-1]);
		}
	}
}
