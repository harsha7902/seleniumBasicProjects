package cgi.adm;

import java.util.Arrays;

public class CgiAdmin {

//	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] array = new int[] {10,3,4,4,8,7,2,9,5};
//		int minimum = array[0];
//		for(int i=0; i<array.length; i++) {
//			if(array[i]<minimum) {
//				minimum =array[i];
//				
//			}
//			
//		}
//		System.out.println("minimum="+minimum);		
//				
//
//	}
//	Dynamic array
		public static int getSmallest(int[] a, int total){  
			Arrays.sort(a);  
			return a[0];  
			}  
			public static void main(String args[]){  
			int a[]={1,2,5,6,3,2};  
			int b[]={44,66,99,77,33,22,55};  
			System.out.println("Smallest: "+getSmallest(a,6));  
			System.out.println("Smallest: "+getSmallest(b,7));  
			}} 


