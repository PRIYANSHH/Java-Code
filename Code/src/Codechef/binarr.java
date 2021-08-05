package Codechef;

import java.util.*;

public class binarr {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		long s=sc.nextLong();
		long p=0;
		int i,j;
		int a[]=new int[n];
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		int l=0,r=n-1;
		while(l<=r) {
			int mid=(l+r)/2;
			for(i=0;i<mid;i++)
				p+=a[i];
			if(p>s) {
				r=mid;
			}
		}
	}
}
