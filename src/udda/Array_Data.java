package udda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Array_Data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array_Data arrD= new Array_Data();
	arrD.arrList();
	linkedList();
	hashMap();
	hashMapInt();
	strConvert();
	
	}
	
	public void arrList() {
		ArrayList<String> str1= new ArrayList<String>();
		str1.add("Mayank");
		str1.add("Gautam");
		str1.add("MCA");
		str1.add("12 year of eperencce");
		str1.sort(null);
		System.out.println(str1.get(0));
		System.out.println( str1.size());
		System.out.println(str1);
		
		ArrayList<Integer> str2= new ArrayList<Integer>();
		str2.add(10);
		str2.add(20);
		System.out.println(str2);
		int c= str2.get(0) + str2.get(1);
		System.out.println(c);
		int d=0;
		for(int i: str2) {
			 d=d+ i;
		
		}
		System.out.println(d);
		
		int e=0;
		for(int i=0; i<str2.size();i++) {
			e=e+ str2.get(i);
		}
		System.out.println(e);
		
	}
	
	public static void linkedList() {
		LinkedList<String> arr3= new LinkedList<String>();
		arr3.addFirst("Bhoomi");
		arr3.addLast("Gautam");
		arr3.set(1, "Bhoomi");
		arr3.set(0, "Gautam");
		System.out.println(arr3);
	}
	
	public static void hashMap() {
		HashMap<String, String> arr5 = new HashMap<String, String>();
		
		arr5.put("UP","Lakhnow");
		arr5.put("Punjab","Chandiigher");
		arr5.put("Delhi","New Deelhi");
		arr5.put("Hariyana","Chandiigher");
		arr5.put("Punjab","Chandiigher");
		
		System.out.println(arr5);
		System.out.println(arr5.get("UP"));
		//arr5.remove("UP");
		System.out.println(arr5);
		System.out.println(arr5.size());
			
		for(String i: arr5.keySet()) {
			System.out.println(i+": "+arr5.get(i));
		}
	}

	public static void hashMapInt() {
		HashMap<String, Integer> arr6= new HashMap<String, Integer>();
		arr6.put("Mayank",40);
		arr6.put("Maanvi",30);
		arr6.put("Bhoomi",6);
		arr6.put("Vami",1);
		arr6.put("Vami",1);
		
		System.out.println(arr6);
		
		
	}
	
	public static void strConvert() {
		Integer val=100;
		String str= val.toString();
		System.out.println(str);
	}
}
