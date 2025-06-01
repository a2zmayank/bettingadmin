package udda;

public class basicEDU {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "We are the so-called 'Vikings' from the north.";
		System.out.println(name);
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.compareToIgnoreCase(name));
		System.out.println(name.length());
		System.out.println(name.indexOf("so"));
		
		int n=2;
		if(n==10) {
			System.out.println("Equal");			
		}
		else {
			System.out.println("not Equal");
		}
		
		
		
		switch(n)
		{
		case 1: 
			System.out.println("Today is Sunday");
			break;
			
		case 2:
			System.out.println("Today is Monday");
			break;
		}
		
		
		String[] arr= {"arr1","arr2","arr3"};
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
		}
	}

}
