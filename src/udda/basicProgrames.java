package udda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

enum level{
	low,
	Medium,
	High
}
public class basicProgrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		basicProgrames obj= new basicProgrames(2,3);
		addnum();
		getStringWordssount();
		reverseStr();
		sumArray();
		strToArray();
		sortArray();
		avgArray();
		lowestValue();
		arrayListLoop();
		hashMapArray();
		enumValue();
		evenOdd();
		reverseString();
		//swapNumber();
		cuntDuplicateUsingHashMap();
		//isPrime();
		//isPalindrome();
		//fibonacciSeries();
		advanceArrayList();
		largeValue();
		removeSpaceFromString();
		arrayHashSet();
		arrayHashMap();
	}
	
	public static void addnum() {
		int x =10;
		int y=20;
		int c=x+y;
		System.out.println(c);
		
	}
	
	public static void getStringWordssount() {
		String str= "My name is mayank ";
		//int count= str.split(" ").length;
		System.out.println(str.split("").length);
	}
	
	public static void reverseStr() {
	String OrgString= "Mayank";
	String ReverseString = "";
	for(int i=0; i<OrgString.length();i++) {
		ReverseString= OrgString.charAt(i)+ReverseString;
		
	}
	System.out.println(ReverseString);
	
	
}

	public static void sumArray() {
		int[] myArray= {2,3,4,5,6};
		int sum=0;
		for(int i=0; i<myArray.length; i++) {
			sum= sum+myArray[i];
			
		}
		System.out.println(sum);
	}
	
	public static void strToArray() {
		String str="Hello";
		char[] arr= str.toCharArray();
				System.out.println(arr);
		
	}

	public static void sortArray() {
		String[] arr= {"Mayank","Gautam"};
		Arrays.sort(arr);
		for(String i: arr) {
			System.out.print(i);
			System.out.print(" ");
		}
		System.out.println();
	}

	public static void avgArray() {
		int [] arr= {3,4,5,6,7,8,9,2};
		float avg, sum=0;
		
		for(int i: arr) {
			sum= sum+i;
		}
		System.out.println(sum);
		avg=sum/arr.length;
		System.out.println(avg);
		Arrays.sort(arr);
		System.out.println(arr[0]);
		}

	public static void lowestValue() {
		int [] arr= {3,4,5,6,7,8,9,2};
		int lowest= arr[0];
		for(int i: arr) {
			if(lowest>i) {
				lowest=i;
			}
		}
		System.out.println(lowest);
	}
	
	public static void arrayListLoop() {
		ArrayList<String> arr= new ArrayList<String>();
		arr.add("Mayank1");
		arr.add("Gautam");
		for(String str: arr) {
			System.out.println(str);
			
		}
	}
	
	public static void hashMapArray() {
		HashMap<String, String> arr= new HashMap<String, String>();
		arr.put("UP", "Lakhnow");
		arr.put("Delhi", "New Delhi");
		arr.put("Tamil Nadu", "Chennai");
		for(String value: arr.keySet()) {
			System.out.println(value);
		}
	}
	
	public static void enumValue() {
		for(level myVar: level.values()) {
			System.out.println(myVar);
		}
	}
	
	public static void evenOdd() {
		int [] arr= {3,4,5,6,7,8,9,2};
		int even=0;
		int odd=0;
		for (int i: arr) {
			if(i%2==0) {
				even++;
			}
			else {
				odd++;
			}
		}
		System.out.println(even+" =Even Number");
		System.out.println(odd+" =Odd Number");
	}
	
	public static void reverseString() {
		String str = "Mayank Gautam";
		StringBuilder str2= new StringBuilder();
		str2.append(str);
		str2=str2.reverse();
		System.out.println(str2);
		
		String org= "";
		for(int i=0; i<str.length(); i++ ) {
			org= str.charAt(i)+org;
		}
		System.out.println(org);
		
		char[] chars = str.toCharArray();
		String org1="";
		for(int i=0; i<chars.length; i++) {
			org1= str.charAt(i)+org1;
			
		}
		System.out.println(org1);
	}

	public static void swapNumber() {
		int a=5, b=6, c=0;
		c=a;
		a=b;
		b=c;
		System.out.println(a+" "+b);
		int x,y,temp = 0;
		Scanner sc= new Scanner(System.in);
		x= sc.nextInt();
		y= sc.nextInt();
		temp=x;
		x=y;
		y=temp;
		
		
		int d=33;
		int e=34;
		d=d+e;
		e=d-e;
		d=d-e;
		System.out.println(d+" "+e);
		
	}

	public static void cuntDuplicateUsingHashMap() {
		String str="My name is Mayank Gautm My";
		String[] SplitStr= str.split(" ");
		HashMap<String, Integer> hm= new HashMap<String, Integer>();
		int value=1;
		for(int i=0; i<SplitStr.length;i++) {
			if(hm.containsKey(SplitStr[i])) {
				value= hm.get(SplitStr[i]);
				hm.put(SplitStr[i], value+1);
			}
			else {
				hm.put(SplitStr[i], value);
			}
			
		}
		System.out.println(hm);
		System.out.println(hm.size());
		System.out.println(SplitStr.length);
	}

	public static void isPrime() {
		int num = 0;
		boolean isPrime=true; 
		Scanner sc= new Scanner(System.in);
		num= sc.nextInt();
		if(num%2==0) {
			System.out.println("num is prime");
		}
		else {
			System.out.println("num is not prime");
		}
		
	}

	public static void isPalindrome() {
		String org;
		String reverse="";
		
		Scanner sc= new Scanner(System.in);
		org= sc.nextLine();
		for(int i=0;i<org.length();i++) {
			reverse=org.charAt(i)+reverse;
		}
		System.out.println(reverse);
		if(org.equals(reverse)) {
			System.out.println(org + " is Palindrome");
		}
		else {
			System.out.println(org + " is not Palindrome");
		}
		StringBuilder rrr= new StringBuilder(org).reverse();
		System.out.println(rrr);
		
	}
	
	public static void fibonacciSeries() {
		int a=0, b=1, c=1;
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		for (int i=3; i<num;i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.println(c);
			
		}
	}

	public static void advanceArrayList() {
		ArrayList<Integer> list= new ArrayList<Integer>();
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list);
		
	for(int i: list) {
		System.out.println(i);
	}
	
	for(int i=0; i<list.size();i++) {
		System.out.println(list.get(i));
	}
	
}

	public static void largeValue() {
		int arr[] = {14, 46, 103, 101, 95, 52, 86, 36, 96, 100 };
		int large=0, sLarge=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>large) {
				large= arr[i];
							}
			}
		for(int i=0;i<arr.length; i++ ) {
			if(large>arr[i]) {
				sLarge=arr[i];
			}
		}
		System.out.println("Largest Value: "+large+", Second Largest Value: "+sLarge);
	}

	public static void removeSpaceFromString() {
		String str= "My name is "
				+ "Mayank Gautam";
		String str2=str.replaceAll(" ", "");
		System.out.println(str2);
	// without using replace()
		
		char[] arr= str.toCharArray();
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=' ') {
				System.out.print(arr[i]);
			}
		}
		System.out.println("Test");
		
	}

	public static void arrayHashSet() {
		HashSet<Integer> set= new HashSet<>();
		set.add(2);
		set.add(5);
		set.add(3);
		System.out.println(set);
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next());
		}
		System.out.println();	
		
		for(int i: set) {
			System.out.println(i);
		}
		
		System.out.println(set);
		if(set.contains(5)) {
			System.out.println("Yes");
			set.remove(5);
		}
		
		System.out.println(set);
		System.out.println("End HashSet........."+"\n");
	}

	public static void arrayHashMap() {
		HashMap<String,Integer> map= new HashMap<String,Integer>();
		map.put("India", 1);
		map.put("US", 3);
		map.put("Pakistan", 3);
		System.out.println(map);
		System.out.println(map.get("India"));
		System.out.println(map.containsKey("India"));
		System.out.println(map.containsValue(2));
		System.out.println(map.remove("India"));
		System.out.println(map);
	}

	public basicProgrames(int a, int b ) {
		int c= a+b;
		System.out.println("Constractor= "+c);
	}

	
}
