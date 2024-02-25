package miscellaneous.topics;

import java.util.HashMap;
import java.util.Map;

public class TechmMahindraInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "employee1");
		map.put(2, "employee2");
		map.put(3, "employee3");
		System.out.println("the employee dtails");
		for(Map.Entry y:  map.entrySet()) {
			System.out.println(y.getKey()+""+y.getValue());
			
		}

	}

}
