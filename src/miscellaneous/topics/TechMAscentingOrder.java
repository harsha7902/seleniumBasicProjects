package miscellaneous.topics;

import java.util.Arrays;
import java.util.List;

public class TechMAscentingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = {"anu","zakkir","kevin","ram","dane"};
		int size=s.length;
		
		for(int i =0; i<size-1; i++ ) {
			
			for(int j=i+1; j<s.length; j++) {
				
				if(s[i].compareTo(s[j])>0) {
					String temp =s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
			
		}
		System.out.println(Arrays.toString(s));

	}

}
