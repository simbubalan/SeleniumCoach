
public class StringDemo {

	public static void main(String[] args) {
		String str = new String();
		System.out.println(str);
		str="We are in the class";
		System.out.println(str);
		//returns no. of characters in this string
		System.out.println(str.length());
		//Returns true if this string contains the specified string
		System.out.println(str.contains("in"));
		//Concatenates the specified string to the end of this string. 
		System.out.println(str.concat(" today"));
		//Converts all characters to lower case
		System.out.println(str.toLowerCase());
		//Converts all characters to upper case
		System.out.println(str.toUpperCase());
		//compares two string considering case
		System.out.println(str.equals("we are in the class"));
		//compares two string ignoring the case
		System.out.println(str.equalsIgnoreCase("we are in the class"));
		//returns character at given index
		System.out.println(str.charAt(0));
		//returns index of first occurrence of given chars or string
		System.out.println(str.indexOf("e"));
		System.out.println(str.indexOf("e", 2));
		//returns sub string from given index
		System.out.println(str.substring(14));
		//returns sub string from begining index to ending index-1
		System.out.println(str.substring(10, 13));//10th, 11th, 12th	
	}
}















